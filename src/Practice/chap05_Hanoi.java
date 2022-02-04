package Practice;

import java.util.Scanner;

public class chap05_Hanoi {
	// �ϳ����� ž
	// no���� ������ x�� ��տ��� y�� ������� �ű�
	static void move(int no, int x, int y) {
		if(no>1) {
			move(no-1,x,6-x-y);
			
			System.out.println("����["+no+"]��"+x+"��տ���"+y+"������� �ű�");
		}
		if(no>1) {
			move(no-1,6-x-y,y);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.println("�ϳ����� ž");
		System.out.println("���� ����: ");
		int n=s.nextInt();
		
		move(n,1,3); // 1�� ����� n���� ������ 3�� ������� �ű�
	}

}
