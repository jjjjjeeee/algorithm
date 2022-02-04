package Practice;

import java.util.Scanner;

import al03_stack_queue.IntStack;

public class chap05_Recur {
	// 재귀함수 이해하기
	static void recur(int n) {
		// 재귀함수
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
				s.push(n); //n의 값을 푸시
				n=n-1;
				continue;
			}
			if(s.isEmpty() != true) { // 스택이 비어있지 않다면
				n=s.pop(); // 저장하고 있던 스택의 값을 팝
				System.out.println(n);
				n=n-2;
				continue;
			}
			break;
		}
	}
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int x = sc.nextInt();
		
		recur(x);
	}
}
