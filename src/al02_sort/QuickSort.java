package al02_sort;

import java.util.Arrays;

public class QuickSort {

	public static void swap(int a[], int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	public static void myQuick(int a[], int left, int right) {
		int pl = left;  // 왼쪽부터 검색할 index 위치
		int pr = right; // 오른쪽부터 검색할 index 위치
		int pivot = a[(left+right)/2]; // 피벗위치의 값을 구함

		do {
			// 피벗기준 왼쪽에서 오른쪽으로 피벗의 값보다 큰 데이터가 있는 index 찾기
			while(a[pl] < pivot) {pl++;} // 한 줄이라서 중괄호 생략가능

			// 피벗기준 오른쪽에서 왼쪽으로 이동하며 피벗의 값보다 작은 데이터가 있는 index 찾기
			while(a[pr] > pivot) {pr--;}
			System.out.println(pl+", "+pr);

			if(pl <= pr) { // pl의 위치값과, pr위치 값을 교환한다
				swap(a,pl++,pr--);
			} 
		}while(pl<=pr);

		System.out.println(Arrays.toString(a));
		System.out.println("pl->"+pl+", p2->"+pr);
		
		// 정렬후 왼쪽을 재정렬할 재귀호출
		if(left<pr) {
			myQuick(a,left,pr); // 0~3까지 넣어줌
		}
		// 정렬후 오른쪽 재정렬할 재귀호출
		if(pl<right) {
			myQuick(a,pl,right);
		}
		
	}

		public static void main(String[] args) {
			int arr[] = {175, 120, 170, 160, 190, 130, 168, 200, 165, 170, 155, 150};

			System.out.println(Arrays.toString(arr));
			myQuick(arr, 0,arr.length-1);
		}

	}
