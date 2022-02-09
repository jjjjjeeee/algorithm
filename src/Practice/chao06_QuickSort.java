package Practice;

import java.util.Scanner;

public class chao06_QuickSort {
	// 퀵정렬
	// 배열 요소 a[idx1]과 a[idx2]의 값을 바꿉니다.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// 큌정렬
	static void quickSort(int[] a, int left, int right) {
		int pl = left;   // 왼쪽 커서
		int pr = right;  // 오른쪽 커서
		int x = a[(pl+pr)/2]; // 피벗
		
		do {
			while(a[pl]<x) pl++;
			while(a[pr]>x) pr--;
			if(pl<=pr)
				swap(a, pl++, pr--);
		}while(pl<=pr);
		
		if(left<pr) quickSort(a, left, pr);
		if(right>pl) quickSort(a, right, pl);
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("퀵 정렬");
		System.out.print("요솟수 : ");
		
		int nx = s.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x["+i+"] =>");
			x[i] = s.nextInt();
		}
		
		quickSort(x,0,nx-1); //배열 x를 퀵 정렬
		
		System.out.println("오름차순으로 정렬했습니다.");
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"] ="+x[i]);
		}
	}	

}
