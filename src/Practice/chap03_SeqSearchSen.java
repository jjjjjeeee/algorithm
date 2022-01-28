package Practice;

import java.util.Scanner;

public class chap03_SeqSearchSen {
	// ���� �˻�(���ʹ�)
	// ��ڼ��� n�� �迭 a���� key�� ���� ��Ҹ� ���ʹ����� ���� �˻��մϴ�
	static int seqSearchSen(int[] a, int n, int key) {
		int i=0;
		
		a[n] = key; // ���ʸ� �߰�
		
		while(true) {
			if(a[i]==key) { // �˻�����
				break;
			}
			i++;
		}
		return i==n?-1:i;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("��ڼ�: ");
		int num = s.nextInt();
		int[]x = new int[num+1]; // ��ڼ� num+1
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] =>");
			x[i] = s.nextInt();
		}
		
		System.out.print("�˻��� �� : "); // Ű ���� �Է�
		int ky = s.nextInt();
		
		int idx = seqSearchSen(x,num,ky); // �迭 x���� ���� ky�� ��Ҹ� �˻�
		
		if(idx==-1) {
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		} else {
			System.out.println(ky+"��(��) x["+idx+"]�� �ֽ��ϴ�.");
		}
				
	}

}