package Practice;

import java.util.Scanner;

public class chap03_SeqSearch {
	// ���� �˻�
	
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���� �˻��մϴ�
	static int seqSearch(int[] a, int n, int key) {
		int i=0;
		
		while(true) {
			if(i==n) return -1; // �˻� ����(-1�� ��ȯ)
			if(a[i] == key) return i; // �˻� ����(�ε����� ��ȯ)
			i++;
		}
	} 
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = s.nextInt();
		int x[] = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"]:");
			x[i] = s.nextInt();
		}
		System.out.print("�˻��� ��:"); // Ű ���� ����
		int ky = s.nextInt();
		int idx = seqSearch(x,num,ky); // �迭 x���� Ű ���� ky�� ��Ҹ� �˻�
		
		if(idx==-1)
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		else
			System.out.println(ky+"�� x["+idx+"]�� �ֽ��ϴ�.");
	}

}
