package Practice;

import java.util.Scanner;

public class chap01_TriangleLB {
	// ���� �Ʒ��� ������ �̵ �ﰢ�� ���
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;
		
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		do {
			System.out.println("�� �� �ﰢ���Դϱ�?");
			n = s.nextInt();
		}while(n<=0);
		
		for (int i=1; i<=n; i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
