package Practice;

import java.util.Scanner;

public class chap02_PhysicalExamination {
	// ��ü�˻� �����Ϳ� Ŭ���� �迭���� ��� Ű�� �÷��� ������ ����
	
	static final int VMAX = 21; // �÷º���(0.0~0.1 ������ 21��)
	
	static class PhyscData{
		String name;
		int height;
		double vision;
		
		// ������
		PhyscData(String name, int height, double vision){
			this.name = name;
			this.height = height;
			this.vision = vision;
		}
	}
	
	// Ű�� ��հ��� ����
	static double avHeight(PhyscData[] dat) {
		double sum = 0;
		
		for(int i=0; i<dat.length; i++) {
			sum += dat[i].height;
		} return sum/dat.length;
	}
	
	// �÷º����� ����
	static void distVision(PhyscData[] dat, int [] dist) {
		int i=0;
		dist[i] = 0;
		
		for(i=0; i<dat.length; i++) {
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX/10.0)
				dist[(int)(dat[i].vision*10)]++;
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		PhyscData[]x = {
			new PhyscData("�ڴ���", 162, 0.3),	
			new PhyscData("�̴���", 163, 0.7),	
			new PhyscData("�����", 175, 2.0),	
			new PhyscData("�ִ���", 171, 1.5),	
			new PhyscData("������", 168, 0.4),	
			new PhyscData("������", 174, 1.2),	
			new PhyscData("�Դ���", 169, 0.8),	
		};
		int[] vdist = new int[VMAX]; // �÷º���
		
		System.out.println("�ý�ü�˻� ����Ʈ��");
		System.out.println("�̸�   Ű  �÷�");
		System.out.println("=================");
		
		for(int i=0; i<x.length; i++) {
			System.out.printf("%-5s%2d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		System.out.printf("\n ��� Ű:%5.1fcm\n", avHeight(x));
		
		distVision(x, vdist);
		
		System.out.println("\n�÷� ����");
		for(int i=0; i<VMAX; i++) {
			System.out.printf("%3.1f~:%2d��\n", i/10.0,vdist[i] );
		}
	}

}
