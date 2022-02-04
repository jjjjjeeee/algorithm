package Practice;

import java.util.Scanner;

import al03_stack_queue.IntStack;

public class chap04_IntStackTester {
	private int max;   //스택 용량
	private int ptr;   //스택 포인터
	private int[] stk; //스택 본체

	// 실행 시 예외: 스택이 비어 있음
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {}

	// 실행 시 예외: 스택이 가득 참
	public class OverFlowStackException extends RuntimeException{
		public OverFlowStackException() {}
	}
	
	// 생성자
	public void chap04_IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max]; // 스택 본체용 배열을 생성
		}catch(OutOfMemoryError e) {// 생성할 수 없음
			max =0; 
		}
	}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		IntStack is = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수: "+is.s+"/"+is.capacity());
		}
	}

}
