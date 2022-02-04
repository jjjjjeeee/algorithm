package Practice;

public class chap06_SelectionSort {
	// �ܼ� ���� ����
	static void selectionSort(int[]a, int n) {
		for(int i=0; i<n-1; i++) {
			int min =i; // ���� ���ĵ��� ���� �κп��� ���� ���� ����� �ε����� ����մϴ�.
			for(int j=i+1;j<n;j++) {
				if(a[j] < a[min])
					min=j;
			}
			swap(a,i,min);
		}
	}
	// a[idx1] a[idx2]�� ���� �ٲߴϴ�.
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
}
