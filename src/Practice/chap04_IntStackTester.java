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
	// ���ÿ��� x�� ã�� �ε���(������-1)�� ��ȯ
	public int indexOf(int x) {
		for(int i=ptr-1; i>=0; i--) {//�����ʿ��� ���� �˻�
			if(stk[i]==x)
				return i; // �˼�����
		}return -1; // �˻� ����
	}
	
	// ������ ���
	public void clear() {
		ptr=0;
	}
	
	// ������ �뷮�� ��ȯ
	public int capacity() {
		return max;
	}
	
	// ���ÿ� �׿��ִ� ������ ���� ��ȯ
	public int size() {
		return ptr;
	}
	
	// ������ ����ִ°�?
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	// ������ ����á�°�?
	public boolean isFull() {
		return ptr>=max;
	}
	
	// ���� ���� ��� �����͸� �ٴ� -> ����� ������ ���
	public void dump() {
		if(ptr<=0) {
			System.out.println("������ ����ֽ��ϴ�.");
		} else {
			for(int i=0; i<ptr; i++) {
				System.out.println(stk[i]+" ");
			}System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		IntStack is = new IntStack(64); // �ִ� 64���� Ǫ���� �� �ִ� ����
		
		while(true) {
			System.out.println("���� ������ ��: "+s.size()+"/"+s.capacity());
		}
	}

}
