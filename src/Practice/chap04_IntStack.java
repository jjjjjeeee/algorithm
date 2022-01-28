package Practice;

//int�� ���� 
public class chap04_IntStack {
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
}

