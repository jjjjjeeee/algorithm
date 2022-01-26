package Practice;

public class Ex_class {
	private int f1; // 비공개 필드
	protected int f2; // 한정 공개 필드
	public int f3; // 공개 필드
	
	public void A() { // 생성자
		f1=f2=f3=0;
	}
	
	public void A(int f1, int f2, int f3) { // 생성자
		this.f1 = f1;
		this.f2 = f3;
		this.f3 = f3;
	}
	
	public void setF1(int f) { // 메서드 f1의 setter
		f1 = f;
	}
	
	public void getF1() { // 메서드 f1의 getter
		return;
	}
	
}
