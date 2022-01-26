package al01_basic;

public class Main02_random {

	/*
	1. 1~100 난수를 50만들어 합을 구하라
	2. 한줄에 6개의 난수를 출력하고
	3. 마지막줄에 합을 출력한다. 
	 */
	
	public static void main(String[] args) {
		int s=0;
		// 난수
		for(int i=1;i<=50;i++) {
			int ran = (int)(Math.random()*100)+1; // 난수: 1~100
			System.out.printf("%3d ",ran); // 출력
			s += ran; // 합
			if(i%6==0){System.out.println();}// 줄바꿈
		}
		// 합출력
		System.out.println("\n합="+s);
	}

}
