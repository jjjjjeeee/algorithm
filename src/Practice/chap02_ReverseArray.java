package Practice;

import java.util.Scanner;

public class chap02_ReverseArray {
	// 배열 요소에 값을 읽어 들여 역순으로 정렬합니다.
	static void swap(int[] a, int idx1, int idx2) {
		// 배열 요소 a[idx1]과 a[idx2]를 바꿈
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 배열 a의 요소를 역순으로 정렬
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2; i++) {
			swap(a,i,a.length-i-1);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("요솟수: ");
		int n = s.nextInt(); // 요솟수
		
		int[] x= new int[n]; // 요솟수가 n인 배열
		
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = s.nextInt();
		}
		
		reverse(x); // 배열 a의 요소를 역순으로 정렬
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i=0; i<n; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
	}

}
