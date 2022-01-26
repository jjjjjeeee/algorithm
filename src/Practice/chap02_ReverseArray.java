package Practice;

import java.util.Scanner;

public class chap02_ReverseArray {
	// �迭 ��ҿ� ���� �о� �鿩 �������� �����մϴ�.
	static void swap(int[] a, int idx1, int idx2) {
		// �迭 ��� a[idx1]�� a[idx2]�� �ٲ�
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	// �迭 a�� ��Ҹ� �������� ����
	static void reverse(int[] a) {
		for(int i=0;i<a.length/2; i++) {
			swap(a,i,a.length-i-1);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int n = s.nextInt(); // ��ڼ�
		
		int[] x= new int[n]; // ��ڼ��� n�� �迭
		
		for(int i=0; i<n; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = s.nextInt();
		}
		
		reverse(x); // �迭 a�� ��Ҹ� �������� ����
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		for(int i=0; i<n; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
	}

}
