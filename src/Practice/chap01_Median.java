package Practice;

import java.util.Scanner;

public class chap01_Median {
	// 3���� �������� �Է��ϰ� �߾Ӱ��� ���� ���� ����մϴ�.
	static int med3(int a, int b, int c) {
		if(a>=b) {
			if(b>=c) {
				return b;
			} else if (a<=c) {
				return a;
			} else {
				return c;
			}
		}else if(a>c){
			return a;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.print("a�� ��:");
		int a = s.nextInt();
		System.out.print("b�� ��:");
		int b = s.nextInt();
		System.out.print("c�� ��:");
		int c = s.nextInt();
		
		System.out.println("�߾Ӱ��� "+med3(a,b,c)+"�Դϴ�.");
	}

}
