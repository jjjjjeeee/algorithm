package al01_basic;

import java.util.Scanner;

public class Solution02 {
	// static String name = "홍길동";
	/*
	 실행
	 5
	 5*2=10
	 :
	 :
	 5*9=45 
	 */
	
	public static void gugudan(int dan) {
		for(int i=2; i<9; i++) {
			int r = dan*i;
			System.out.printf("%2d * %2d = %3d\n", dan, i , r);
		}
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan = scan.nextInt();
		
		gugudan(dan);
		
		// System.out.println(name); // static이라서 객체 생성하지 않고도 사용가능
		
	}

}
