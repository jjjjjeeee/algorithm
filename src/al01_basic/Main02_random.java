package al01_basic;

public class Main02_random {

	/*
	1. 1~100 ������ 50����� ���� ���϶�
	2. ���ٿ� 6���� ������ ����ϰ�
	3. �������ٿ� ���� ����Ѵ�. 
	 */
	
	public static void main(String[] args) {
		int s=0;
		// ����
		for(int i=1;i<=50;i++) {
			int ran = (int)(Math.random()*100)+1; // ����: 1~100
			System.out.printf("%3d ",ran); // ���
			s += ran; // ��
			if(i%6==0){System.out.println();}// �ٹٲ�
		}
		// �����
		System.out.println("\n��="+s);
	}

}
