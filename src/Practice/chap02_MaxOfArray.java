package Practice;

import java.util.Random;
import java.util.Scanner;

public class chap02_MaxOfArray {
	// �迭 ����� �ִ��� ���ϴ� �޼���
	
	// �迭 ����� �ִ��� ��Ÿ���ϴ�(���� �Է� ����)
	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1;i<a.length;i++) {
			if (a[i]>max) {
				max = a[i];	
			}
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Random ran = new Random();
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		System.out.print("��� ��: ");
		int num = s.nextInt(); // �迭�� ��ڼ��� �Է� ����
		
		int[] height = new int[num]; // ��ڼ��� num�� �迭�� ����
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		for(int i=0; i<num; i++) {
			height[i] = 100+ran.nextInt(90);  // ����� ���� ������ ����
			System.out.println("height["+i+"] :"+height[i]);
		}
		
		System.out.println("�ִ��� "+maxOf(height)+" �Դϴ�.");
	}

}
