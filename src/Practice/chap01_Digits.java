package Practice;

import java.util.Scanner;

public class chap01_Digits {
	// 2자리의 수만 입력하도록 제한하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("2자리의 정수를 입력하세요.");
		
		do {
			System.out.println("입력: ");
			num = s.nextInt();
		}while(num<10||num>99);
		
	
		System.out.println("변수 num의 값은: "+num+"이 되었습니다.");
	}

}
