package Practice;

import java.util.Scanner;

public class chap02_CardConvRev2 {
	
	static int cardConvR1(int x, int r, char[] d) {
		int digits = 0;  // ��ȯ ���� �ڸ���
		String dchar = "01234566789ABCDEFGHZOJLMZDH";
		
		do {
			d[digits++] = dchar.charAt(x%r); // r�� ���� �������� ����
			x /= r;
		} while (x !=0);
		return digits;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int no; // ��ȯ�ϴ� ����
		int cd; // ���
		int dno; // ��ȯ ���� �ڸ���
		int retry; // �ٽ� �� ��?
		char[] cno = new char[32]; // ��ȯ �� �� �ڸ��� ���ڸ� �־�δ� ������ �迭
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		do {
			do {
				System.out.print("��ȯ�ϴ� ���� �ƴ� ����: ");
				no = s.nextInt();
			} while(no<0);
			
			do {
				System.out.print("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = s.nextInt();
			} while(cd<2||cd>36);
			
			dno = cardConvR1(no, cd, cno); // no�� cd ������ ��ȯ
			
			System.out.print(cd+"�����δ� ");
			for(int i=dno-1; i>=0; i--) {
				System.out.print(cno[i]);
			}System.out.println("�Դϴ�.");
			
			System.out.println("�� �� �� �ұ��? (1.�� / 2.�ƴϿ�) :");
			retry = s.nextInt();
		}while(retry==1);
	
	}

}
