package Practice;

public class chap02_CardConvRev {
	// �Է� ���� 10������ 2����~36������ ��� ��ȯ�Ͽ� ��Ÿ��
	
	// ������ x�� r������ ��ȯ�Ͽ� �迭 d�� �Ʒ��ڸ����� �־�ΰ� �ڸ����� ��ȯ�մϴ�
	protected static int cardConvR(int x, int r, char[] d) {
		int digits = 0;  // ��ȯ ���� �ڸ���
		String dchar = "01234566789ABCDEFGHZOJLMZDH";
		
		do {
			d[digits++] = dchar.charAt(x%r); // r�� ���� �������� ����
			x /= r;
		} while (x !=0);
		return digits;
		
	}
}
