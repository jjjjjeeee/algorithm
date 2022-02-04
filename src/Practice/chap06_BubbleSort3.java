package Practice;

import java.util.Scanner;

public class chap06_BubbleSort3 {
	// ��������(version 3)
	static void bubbleSort(int[] a, int n) {
		int k=0;  // a[k]���� ������ ������ �� ��ģ ����
		while(k<n-1) {
			int last = n-1; // ���������� ��Ҹ� ��ȯ�� ��ġ
			for(int j=n-1; j>k; j--)
				if(a[j-1]>a[j]) {
					swap(a, j-1, j);
					last=j;
				}
			k=last;
		}
		
	}
	

	// a[idx1] a[idx2]�� ���� �ٲߴϴ�.
	static void swap(int[]a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("���� ����(version 2)");
		System.out.print("��ڼ�: ");
		
		int nx=s.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++){
			System.out.print("x["+i+"]:");
			x[i] = s.nextInt();
		}
		
		bubbleSort(x,nx); // �迭 x�� ���������մϴ�.
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"]="+x[i]);
		}
	}
}
