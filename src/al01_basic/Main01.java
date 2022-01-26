package al01_basic;

import java.util.Scanner;

public class Main01 {
	/*
	 1행. 입력받을 년도의 개수
	 
	 실행
	 6
	 4 100 400 2000 2001 2004
	 #1 윤년
	 #2 평년
	 #3 윤년
	 #4 윤년
	 #5 평년
	 #6 윤년
	 */
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = Integer.parseInt(s.nextLine());
		String data[] = s.nextLine().split(" ");
		
		String r[] = new String[n]; // 윤년, 평년의 결과 저장할 배열
		
		for(int i=0;i<n; i++) {//0,1,2,3,4,5
			// 4년마다 윤년 (단, 100으로 나눠지지 않는 해), 400년마다 윤년
			int y = Integer.parseInt(data[i]);
			if(y%4==0 && y%100!=0 || y%400==0) { // 윤년
				r[i] = "윤년";
			}else { // 평년
				r[i] = "평년";
			}
		}
		// 출력
		for(int i=1; i<=n; i++) {// 1,2,3,4,5,5
			System.out.println("#"+i+" "+r[i-1]);
		}
	}
}

