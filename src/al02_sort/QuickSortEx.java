package al02_sort;

import java.util.Arrays;
import java.util.Scanner;

public class QuickSortEx {
	// ���������� �Է¹޾� ���������� ����϶� (��������)
	public static void swap(int a[], int idx1, int idx2) {
		int tmp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = tmp;
	}
	
	public static void QuickScore(int a[], int left, int right) {
		int pl = left;
		int pr = right;
		int pivot = a[(left+right)/2];
		
		do {
			while(a[pl]<pivot) {pl++;} // �ε�ȣ �ٲٸ� ������������
			
			while(a[pr]>pivot) {pr--;}
			
			if(pl<=pr) {
				swap(a,pl++,pr--);
			}
		}while(pl<=pr);
		
		System.out.println(Arrays.toString(a));
		
		if(left<pr) {
			QuickScore(a,left,pr);
		}
		if(pl<right) {
			QuickScore(a,pl,right);
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("���������� ����:");
		
		int no = s.nextInt();
		// �迭 ����
		int score[] = new int[no];
		
		for(int i=0; i<score.length; i++) {
			System.out.print("��������"+(i+1)+":");
			score[i] = s.nextInt();
		}
		System.out.println(Arrays.toString(score));
		QuickScore(score,0,no-1); // �������Ѵ�
		
		for(int i=1;i<=no;i++) {
			System.out.println(i+"��: "+score[i-1]);
		}
	}

}
