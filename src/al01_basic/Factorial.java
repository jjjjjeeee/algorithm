package al01_basic;

import java.util.Scanner;

public class Factorial {
	// for���� �̿��� ���丮�� ���ϱ�
	static int factorial1(int max) {
		int result = 1; // max�� ���� �� ���� ���ϸ� �ȵż� 0�� �־���
		// 5*4*3*2*1
		for(int i=max; i>=1; i--) {// 5*4*3*2*1
			// ����� ������ ����
			result *= i;
		
		} return result;
	}
	
	// ���ȣ��� ���丮�� ���ϱ�
	static int result =1;
	public static void factorial2(int max) {
		// ���ȣ�� �ߴ�
		if(max<=1) return;
		factorial2(max-1);
		result *= max;
		factorial2(max-1);
	}
	
	// ���ȣ��� ���丮�� ���ϱ�(��ȯ������ �ִ� ���)
	// ���丮�� ���� ����� �����ϴ� ���
	public static int factorial3(int max) {
		if(max<=1) return 1;
		return max*factorial3(max-1);
	}
	
	// while������ ���丮�� ���ϱ�
	public static int factorial4(int max) {
		int r = 1;
		while(true) {
			if(max<=1) return r;
			r *= max; //5,4
			max--;
		}
	} 
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		// �Է��� ������ ���丮�� ���ϱ�
		int max = s.nextInt();
		
		// for���� �̿��� ���丮�� ���ϱ�
		int res1 = factorial1(max);
		System.out.println("f1->"+res1);
		
		// ���ȣ��� ���丮�� ���ϱ�
		result =1;
		factorial2(max);
		System.out.println("f2->"+result);
		
		int r = factorial3(max);
		System.out.println("f3->"+r);
		
		System.out.println("f4->"+factorial4(max));
	}

}
