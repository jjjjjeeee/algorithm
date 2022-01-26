package Practice;

public class chap02_CardConvRev {
	// 입력 받은 10진수를 2진수~36진수로 기수 변환하여 나타냄
	
	// 정숫값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어두고 자릿수를 반환합니다
	protected static int cardConvR(int x, int r, char[] d) {
		int digits = 0;  // 변환 후의 자릿수
		String dchar = "01234566789ABCDEFGHZOJLMZDH";
		
		do {
			d[digits++] = dchar.charAt(x%r); // r로 나눈 나머지를 저장
			x /= r;
		} while (x !=0);
		return digits;
		
	}
}
