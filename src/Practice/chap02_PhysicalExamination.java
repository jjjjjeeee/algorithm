package Practice;

import java.util.Scanner;

public class chap02_PhysicalExamination {
	// 신체검사 데이터용 클래스 배열에서 평균 키와 시력의 분포를 구함
	
	static final int VMAX = 21; // 시력분포(0.0~0.1 단위로 21개)
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		// 생성자
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	// 키의 평균값을 구함
	static double avHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) {
			sum += dat[i].height;
		} return sum/dat.length;
	}
	
	// 시력분포를 구함
	static void distVision(PhyscData[] dat, int [] dist) {
		int i=0;
		dist[i] = 0;
		
		for(i=0; i<dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX/10.0)
				dist[(int)(dat[i].vision*10)]++;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		PhyscData[]x = {
			new PhyscData("박덕구", 162, 0.3),	
			new PhyscData("이덕구", 163, 0.7),	
			new PhyscData("김덕구", 175, 2.0),	
			new PhyscData("최덕구", 171, 1.5),	
			new PhyscData("정덕구", 168, 0.4),	
			new PhyscData("유덕구", 174, 1.2),	
			new PhyscData("함덕구", 169, 0.8),	
		};
		int[] vdist = new int[VMAX]; // 시력분포
		
		System.out.println("▣신체검사 리스트▣");
		System.out.println("이름   키  시력");
		System.out.println("=================");
		
		for(int i=0; i<x.length; i++) {
			System.out.printf("%-5s%2d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		System.out.printf("\n 평균 키:%5.1fcm\n", avHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("\n시력 분포");
		for(int i=0; i<VMAX; i++) {
			System.out.printf("%3.1f~:%2d명\n", i/10.0,vdist[i] );
		}
	}

}
