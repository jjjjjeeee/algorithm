package Practice;

import java.util.Scanner;

public class chap05_EuclidGCD {

	// ��Ŭ���� ȣ�������� �ִ����� ���ϱ�
	static int gcd(int x, int y) {
		if(y==0)
			return x;
		else
			return gcd(y, x%y);
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		
		System.out.print("������ �Է��ϼ���. : "); int x = s.nextInt();
		System.out.print("������ �Է��ϼ���. : "); int y = s.nextInt();
		
		System.out.println("�ִ������� "+gcd(x,y)+"�Դϴ�.");
	}

}
