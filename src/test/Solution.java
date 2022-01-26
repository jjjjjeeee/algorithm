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
		// 그룹수
		int cnt = Integer.parseInt(scan.nextLine());
		for(int i=1; i<=cnt; i++) {
			int num = Integer.parseInt(scan.nextLine()); // 그룹번호
			int[] jumsuCnt = new int[101];
			
			String inStr[] = scan.nextLine().split(" ");
			
			// 문자열 배열을 숫자 배열로 변경한다
			int inData[] = Arrays.stream(inStr).mapToInt(Integer::parseInt).toArray(); // int형 배열로 구해서 리턴해줌
			for(int j=0; j<inData.length; j++) {
				// j번째 있는 값을 index로 카운트한다
				jumsuCnt[inData[j]] += 1;
			}
			// 제일 큰 값이 들어있는 (index=점수)를 구한다
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
