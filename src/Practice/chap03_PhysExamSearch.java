package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class chap03_PhysExamSearch {
	// 신체검사 데이터 배열에서 이진 검색하기
	
	// 신체검사 데이터를 정의합니다
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		// 생성자
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		// 문자열을 반환하는 메서드(정보 확인용)
		public String toString() {
			return name+" "+height+" "+vision;
		}
		
		// 오름차순으로 정렬하기 위한 comparator
		public static final Comparator<PhyscData>HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return(d1.height>d2.height)?1:
					(d1.height<d2.height)?-1:0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PhyscData[]x = { // 키의 오름차순으로 정렬되어 있음
				new PhyscData("이", 162, 0.3),
				new PhyscData("유", 150, 0.4),
				new PhyscData("나", 138, 0.8),
				new PhyscData("김", 180, 1.5),
				new PhyscData("박", 193, 0.7),
				new PhyscData("홍", 177, 1.2),
				new PhyscData("진", 185, 2.0),
		};
		System.out.println("몇 cm인 사람을 찾고 있나요?");
		int height = s.nextInt(); // 키 값 입력
		int idx = Arrays.binarySearch(			 // 배열 x에서
				x, new PhyscData("",height,0.0), // 키가 height인 요소를
				PhyscData.HEIGHT_ORDER			 // HEIGHT_ORDER에 의해 검색
		);
		
		if(idx<0) {
			System.out.println("요소가 없습니다.");
		} else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾은 데이터: "+x[idx]); // 자동으로 toSring메서드가 호출됩니다
		}

	}

}
