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
	// 스택에서 x를 찾아 인덱스(없으면-1)를 반환
	public int indexOf(int x) {
		for(int i=ptr-1; i>=0; i--) {//정상쪽에서 선형 검색
			if(stk[i]==x)
				return i; // 검섹성공
		}return -1; // 검색 실패
	}
	
	// 스택을 비움
	public void clear() {
		ptr=0;
	}
	
	// 스택의 용량을 반환
	public int capacity() {
		return max;
	}
	
	// 스택에 쌓여있는 데이터 수를 반환
	public int size() {
		return ptr;
	}
	
	// 스택이 비어있는가?
	public boolean isEmpty() {
		return ptr<=0;
	}
	
	// 스택이 가득찼는가?
	public boolean isFull() {
		return ptr>=max;
	}
	
	// 스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력
	public void dump() {
		if(ptr<=0) {
			System.out.println("스택이 비어있습니다.");
		} else {
			for(int i=0; i<ptr; i++) {
				System.out.println(stk[i]+" ");
			}System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		IntStack is = new IntStack(64); // 최대 64개를 푸시할 수 있는 스택
		
		while(true) {
			System.out.println("현재 데이터 수: "+s.size()+"/"+s.capacity());
		}
	}

}
