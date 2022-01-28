package Practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class chap03_PhysExamSearch {
	// ��ü�˻� ������ �迭���� ���� �˻��ϱ�
	
	// ��ü�˻� �����͸� �����մϴ�
	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		// ������
		public PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
		
		// ���ڿ��� ��ȯ�ϴ� �޼���(���� Ȯ�ο�)
		public String toString() {
			return name+" "+height+" "+vision;
		}
		
		// ������������ �����ϱ� ���� comparator
		public static final Comparator<PhyscData>HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			public int compare(PhyscData d1, PhyscData d2) {
				return(d1.height>d2.height)?1:
					(d1.height<d2.height)?-1:0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		PhyscData[]x = { // Ű�� ������������ ���ĵǾ� ����
				new PhyscData("��", 162, 0.3),
				new PhyscData("��", 150, 0.4),
				new PhyscData("��", 138, 0.8),
				new PhyscData("��", 180, 1.5),
				new PhyscData("��", 193, 0.7),
				new PhyscData("ȫ", 177, 1.2),
				new PhyscData("��", 185, 2.0),
		};
		System.out.println("�� cm�� ����� ã�� �ֳ���?");
		int height = s.nextInt(); // Ű �� �Է�
		int idx = Arrays.binarySearch(			 // �迭 x����
				x, new PhyscData("",height,0.0), // Ű�� height�� ��Ҹ�
				PhyscData.HEIGHT_ORDER			 // HEIGHT_ORDER�� ���� �˻�
		);
		
		if(idx<0) {
			System.out.println("��Ұ� �����ϴ�.");
		} else {
			System.out.println("x["+idx+"]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������: "+x[idx]); // �ڵ����� toSring�޼��尡 ȣ��˴ϴ�
		}

	}

}
