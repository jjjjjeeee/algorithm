package Practice;

import java.util.Scanner;

import al03_stack_queue.IntStack;

public class chap05_Recur {
	// ����Լ� �����ϱ�
	static void recur(int n) {
		// ����Լ�
		if(n>0) {
			recur(n-1);
			System.out.println(n);
			recur(n-2);
		}
	}
	
	static void recurX2(int n) {
		IntStack s= new IntStack(n);
		
		while(true) {
			if(n>0) {
				s.push(n); //n�� ���� Ǫ��
				n=n-1;
				continue;
			}
			if(s.isEmpty() != true) { // ������ ������� �ʴٸ�
				n=s.pop(); // �����ϰ� �ִ� ������ ���� ��
				System.out.println(n);
				n=n-2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���.");
		int x = sc.nextInt();
		
		recur(x);
	}
}
