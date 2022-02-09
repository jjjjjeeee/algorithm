package Practice;

import java.util.Scanner;

public class chao06_QuickSort {
	// ������
	// �迭 ��� a[idx1]�� a[idx2]�� ���� �ٲߴϴ�.
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// �W����
	static void quickSort(int[] a, int left, int right) {
		int pl = left;   // ���� Ŀ��
		int pr = right;  // ������ Ŀ��
		int x = a[(pl+pr)/2]; // �ǹ�
		
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
		
		System.out.println("�� ����");
		System.out.print("��ڼ� : ");
		
		int nx = s.nextInt();
		int[] x = new int[nx];
		
		for(int i=0; i<nx; i++) {
			System.out.print("x["+i+"] =>");
			x[i] = s.nextInt();
		}
		
		quickSort(x,0,nx-1); //�迭 x�� �� ����
		
		System.out.println("������������ �����߽��ϴ�.");
		for(int i=0; i<nx; i++) {
			System.out.println("x["+i+"] ="+x[i]);
		}
	}	

}
