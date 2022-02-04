package Practice;

import java.util.Scanner;

import al03_stack_queue.IntStack;

public class chap04_IntStackTester {
	private int max;   //���� �뷮
	private int ptr;   //���� ������
	private int[] stk; //���� ��ü

	// ���� �� ����: ������ ��� ����
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}

	// ���� �� ����: ������ ���� ��
	public class OverFlowStackException extends RuntimeException{
		public OverFlowStackException() {}
	}
	
	// ������
	public void chap04_IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // ���� ��ü�� �迭�� ����
		}catch(OutOfMemoryError e) {// ������ �� ����
			max =0; 
		}
	}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		IntStack is = new IntStack(64); // �ִ� 64���� Ǫ���� �� �ִ� ����
		
		while(true) {
			System.out.println("���� ������ ��: "+is.s+"/"+is.capacity());
		}
	}

}
