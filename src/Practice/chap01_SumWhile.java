package Practice;

import java.util.Scanner;

public class chap01_SumWhile {
	// n������ �� ���ϱ�
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� => ");
		int n = s.nextInt();
		
		int sum = 0; //��
		int i = 1;
		
		// while��
		while(i<=n) { // i�� n���ϸ� �ݺ��Ѵ�
			sum += i; // sum�� i�� ���Ѵ�
			i++;      // i���� 1��ŭ ������Ų��
		}
		
		// for��
		int result = 0;
		for(int a=1; a<=n; a++) {
			result += a;
		}
		System.out.println("[while��] 1���� "+n+"������ �� ==> "+sum);
		System.out.println("[for��] 1���� "+n+"������ �� ==> "+result);
	}

}
