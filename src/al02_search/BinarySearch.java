package al02_search;

import java.util.Scanner;

public class BinarySearch {
	// 이진 검색(binary search)
	// 데이터가 정렬되어 있어야 함
	// 가운데 위치를 구하여 검색함
	static int binarySearch(int arr[], int n, int key){
		int left = 0; // 왼쪽 시작 index (시작 index)
		int right = n-1; // 오늘쪽 마지작 index (끝 index)
		
		do {
			// 중간 index를 구한다
			int center = (left+right)/2;
			if(key==arr[center]) { // 검색할 값이 중간 index에 있을 경우 
				return center;
				} else if(arr[center]<key){ // 찾고자하는 값이 중앙값보다 크면 중앙값 왼쪽은 검색할 필요가 없음
					left = center+1; // left를 center+1로 바꾼다
				} else {
					right = center-1;
				}
			
		}while(left <= right);
		// 검색한 값이 없을 경우 (왼=오 인덱스가 같거나 오른쪽이 왼쪽보다 작거나 왼쪽이 오른쪽보다 크면 더이상 데이터가 없는 것)
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("데이터 수 = ");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("arr["+i+"]=");
			arr[i] = s.nextInt();
		}
		
		// 검색할 수 입력
		int key = s.nextInt();
		
		// 이진검색
		int result = binarySearch(arr, n, key);
		if(result>=0) {
			System.out.println(key+"는 arr["+result+"]위치에 존재합니다.");
		} else {
			System.out.println(key+"는 존재하지 않는 데이터입니다.");
		}
	}

}
