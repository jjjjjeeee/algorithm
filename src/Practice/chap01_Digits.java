package Practice;

import java.util.Scanner;

public class chap01_Digits {
	// 2�ڸ��� ���� �Է��ϵ��� �����ϱ�
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num;
		
		System.out.println("2�ڸ��� ������ �Է��ϼ���.");
		
		do {
			System.out.println("�Է�: ");
			num = s.nextInt();
		}while(num<10||num>99);
		
	
		System.out.println("���� num�� ����: "+num+"�� �Ǿ����ϴ�.");
	}

}
