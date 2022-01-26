package al02_sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayInsertionSort {
	// ��������(insertion sort)
	static void mySort(int a[], int n) {
		for(int i=1;i<n; i++) { // 1,2,3,4,5...
			int temp = a[i];
			int j;
			for(j=i; j > 0 && a[j-1] > temp; j--) {
					a[j] = a[j-1];
			}
			a[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		Random ran = new Random();
		
		int a[] = new int[10];
		
		for(int i=0; i<a.length; i++){
			a[i] = ran.nextInt(100); // 0~99������ 100���� ���� ����
		}
		System.out.println("������ ==> "+Arrays.toString(a));
		mySort(a,a.length);
		System.out.println("������ ==> "+Arrays.toString(a));
	}

}
