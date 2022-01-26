package Practice;

import java.util.Scanner;

public class chap01_SumWhile {
	// n까지의 합 구하기
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 => ");
		int n = s.nextInt();
		
		int sum = 0; //합
		int i = 1;
		
		// while문
		while(i<=n) { // i가 n이하면 반복한다
			sum += i; // sum에 i를 더한다
			i++;      // i값을 1만큼 증가시킨다
		}
		
		// for문
		int result = 0;
		for(int a=1; a<=n; a++) {
			result += a;
		}
		System.out.println("[while문] 1부터 "+n+"까지의 합 ==> "+sum);
		System.out.println("[for문] 1부터 "+n+"까지의 합 ==> "+result);
	}

}
