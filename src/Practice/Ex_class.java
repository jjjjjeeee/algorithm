package Practice;

public class Ex_class {
	private int f1; // ����� �ʵ�
	protected int f2; // ���� ���� �ʵ�
	public int f3; // ���� �ʵ�
	
	public void A() { // ������
		f1=f2=f3=0;
	}
	
	public void A(int f1, int f2, int f3) { // ������
		this.f1 = f1;
		this.f2 = f3;
		this.f3 = f3;
	}
	
	public void setF1(int f) { // �޼��� f1�� setter
		f1 = f;
	}
	
	public void getF1() { // �޼��� f1�� getter
		return;
	}
	
}
