package al02_sort;

import java.util.Arrays;
import java.util.Random;

public class ArrayBubbleSort {
	
	public static void swap(int a[], int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	// ��������: ��������          �����͹迭, �����ͼ�
	public static void mySort(int a[], int n) {
		for(int i=0; i<n-1; i++) {
			for(int j=n-1; j>0; j--) { // �� ó���� j=n-1 ���� 9
				// a[j-1]=8, a[j]=9
				if(a[j-1]>a[j]) { // �ε�ȣ ���� �ٲ��ָ� ������������ ����
					// ��ȯ 8, 9
					swap(a,j-1,j);
				}
			}
		
		System.out.println("1�� ����:"+Arrays.toString(a));
	}
	}
	public static void main(String[] args) {
		Random ran = new Random();
		// ������ �غ�
		// 1~100������ ������ �����Ͽ� ũ������� ����(��������)
		
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = ran.nextInt(100)+1; // 0~100���� 101���� ���ڰ� �������
		}
		System.out.println("������:"+Arrays.toString(arr));
		
		mySort(arr,arr.length);
		System.out.println("������:"+Arrays.toString(arr));
	}

}
