package Practice;

public class chap05_QueenB {
	// 각 열에 1개의 퀸을 배치하는 조합을 재귀적으로 나열합니다.
	static boolean[] flag = new boolean[8]; // 각 행에 퀸을 배치했는지 체크
	static int[] pos = new int[8]; // 각 열의 퀸의 위치
	
	// 각 열의 퀸의 위치를 출력합니다.
	static void print() {
		for(int i=0; i<8; i++) {
			System.out.printf("%2d",pos[i]);
		}System.out.println();
	}
	
	// 가지뻗기
	// i열에 퀸을 놓습니다.
//	static void set(int i) {
//		for(int j=0; j<8; j++) {
//			pos[i]=j; // 퀸을 j행에 배치합니다.
//			if(i==7) // 모든 열에 배치합니다.
//				print();
//			else
//				set(i+1); // 다음 열에 퀸을 배치합니다.
//		}
//	}
	
	// 분기 한정법
	static void set() {
		for(int j=0; j<8; j++) {
			if(flag[j] == false) {
				pos[i] = j;
				if(i==7)
					print();
				else {
					flag[j] = true;
					set(i+1);
					flag[j]=false;
			}
		}
	}
}
	
	public static void main(String[] args) {
		set(0); // 0열에 퀸을 배치합니다.
	}

}
