package test;

import java.util.Arrays;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
//		Scanner s = new Scanner(System.in);
//		int T = s.nextInt();
//		
//		for(int i=0; i<=T; i++) {
//			int sc = s.nextInt();
//			int max = 0;
//			
//			int num[] = new int[1000];
//			int score[] = new int[101];
//			
//			for(int j=1; j<1000; j++) {
//				num[j] = s.nextInt();
//				score[num[j]] ++;
//			}
//			
//			for(int j=1;j<score.length-1;j++) {
//				if(score[max]<=score[j]) {
//					max = j;
//				}
//				System.out.printf("#"+sc+" "+max);
//			}
//		}
//		
//	
		Scanner scan = new Scanner(System.in);
		// �׷��
		int cnt = Integer.parseInt(scan.nextLine());
		for(int i=1; i<=cnt; i++) {
			int num = Integer.parseInt(scan.nextLine()); // �׷��ȣ
			int[] jumsuCnt = new int[101];
			
			String inStr[] = scan.nextLine().split(" ");
			
			// ���ڿ� �迭�� ���� �迭�� �����Ѵ�
			int inData[] = Arrays.stream(inStr).mapToInt(Integer::parseInt).toArray(); // int�� �迭�� ���ؼ� ��������
			for(int j=0; j<inData.length; j++) {
				// j��° �ִ� ���� index�� ī��Ʈ�Ѵ�
				jumsuCnt[inData[j]] += 1;
			}
			// ���� ū ���� ����ִ� (index=����)�� ���Ѵ�
			int maxIndex = 0;
			for(int k=0; k<jumsuCnt.length; k++) {
				if(jumsuCnt[maxIndex] <= jumsuCnt[k]) {
					maxIndex = k;
				}
			}
			System.out.printf("#"+num+ " "+inData[maxIndex]);
		}

		
	}
}
