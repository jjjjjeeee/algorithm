package al02_sort;

import java.util.Arrays;

public class QuickSort {

	public static void swap(int a[], int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
	}

	public static void myQuick(int a[], int left, int right) {
		int pl = left;  // ���ʺ��� �˻��� index ��ġ
		int pr = right; // �����ʺ��� �˻��� index ��ġ
		int pivot = a[(left+right)/2]; // �ǹ���ġ�� ���� ����

		do {
			// �ǹ����� ���ʿ��� ���������� �ǹ��� ������ ū �����Ͱ� �ִ� index ã��
			while(a[pl] < pivot) {pl++;} // �� ���̶� �߰�ȣ ��������

			// �ǹ����� �����ʿ��� �������� �̵��ϸ� �ǹ��� ������ ���� �����Ͱ� �ִ� index ã��
			while(a[pr] > pivot) {pr--;}
			System.out.println(pl+", "+pr);

			if(pl <= pr) { // pl�� ��ġ����, pr��ġ ���� ��ȯ�Ѵ�
				swap(a,pl++,pr--);
			} 
		}while(pl<=pr);

		System.out.println(Arrays.toString(a));
		System.out.println("pl->"+pl+", p2->"+pr);
		
		// ������ ������ �������� ���ȣ��
		if(left<pr) {
			myQuick(a,left,pr); // 0~3���� �־���
		}
		// ������ ������ �������� ���ȣ��
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
