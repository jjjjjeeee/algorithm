package Practice;

import java.util.Scanner;

public class chap04_Factorial {
	// ���丮���� ��������� ����
		// ���� ����  n�� ���丮���� ��ȯ�մϴ�.
		static int factorial(int n) {
			if(n>0)
				return n*factorial(n-1);
			else
				return 1;
		}

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���");
		int x = s.nextInt();
		
		System.out.println(x+"�� ���丮���� "+factorial(x)+"�Դϴ�.");
	}

}
