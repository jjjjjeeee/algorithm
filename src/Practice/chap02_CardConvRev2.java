package Practice;

import java.util.Scanner;

public class chap02_CardConvRev2 {
	
	static int cardConvR1(int x, int r, char[] d) {
		int digits = 0;  // 변환 후의 자릿수
		String dchar = "01234566789ABCDEFGHZOJLMZDH";
		
		do {
			d[digits++] = dchar.charAt(x%r); // r로 나눈 나머지를 저장
			x /= r;
		} while (x !=0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no; // 변환하는 정수
		int cd; // 기수
		int dno; // 변환 후의 자릿수
		int retry; // 다시 한 번?
		char[] cno = new char[32]; // 변환 후 각 자리의 숫자를 넣어두는 문자의 배열
		
		System.out.println("10진수를 기수 변환합니다.");
		do {
			do {
				System.out.print("변환하는 음이 아닌 정수: ");
				no = s.nextInt();
			} while(no<0);
			
			do {
				System.out.print("어떤 진수로 변환할까요? (2~36) : ");
				cd = s.nextInt();
			} while(cd<2||cd>36);
			
			dno = cardConvR1(no, cd, cno); // no를 cd 진수로 변환
			
			System.out.print(cd+"진수로는 ");
			for(int i=dno-1; i>=0; i--) {
				System.out.print(cno[i]);
			}System.out.println("입니다.");
			
			System.out.println("한 번 더 할까요? (1.예 / 2.아니오) :");
			retry = s.nextInt();
		}while(retry==1);
	
	}

}
