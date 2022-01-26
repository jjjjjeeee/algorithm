package al02_sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayBubbleSort {
	
	public static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	// 버블정렬: 오름차순          데이터배열, 데이터수
	public static void mySort(int a[], int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=n-1; j>0; j--) { // 맨 처음의 j=n-1 값은 9
				// a[j-1]=8, a[j]=9
				if(a[j-1]>a[j]) { // 부등호 방향 바꿔주면 내림차순으로 정렬
					// 교환 8, 9
					swap(a,j-1,j);
				}
			}
		
		System.out.println("1번 정렬:"+Arrays.toString(a));
	}
	}
	public static void main(String[] args) {
		Random ran = new Random();
		// 데이터 준비
		// 1~100까지의 난수를 생성하여 크기순으로 정렬(오름차순)
		
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(100)+1; // 0~100까지 101개의 숫자가 만들어짐
		}
		System.out.println("정렬전:"+Arrays.toString(arr));
		
		mySort(arr,arr.length);
		System.out.println("정렬후:"+Arrays.toString(arr));
	}

}
