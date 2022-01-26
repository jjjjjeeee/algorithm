package al02_search;

import java.util.Scanner;

// 선형검색(linearSearch, SequenceSearch)
// 순차적으로 검색
public class SequenceSearch {
	
	// for문을 이용하여 검색하기
	// key의 값이 있는 위치를 구하여 index를 반환하는 메소드
	//                      데이터가 담긴 배열
	static int linearSearch1(int[] data, int n, int key) {
		// 배열에서 key값을 검색하여 index를 리턴
		// 만약 검색된 index가 없으면 -1 리턴
		for(int i=0; i<n; i++) {// 0,1,2,3,...
			if(data[i]==key) {
				return i;
			}
		}
		return -1;
	}
	// while문을 이용한 데이터위치 검색
	static int linearSearch2(int[] d, int n, int k) {
		int i=0;
		while(true) {
			if(i==n){ // i index위치가 존재하는가
				return -1;
			}
			if(d[i]==k) { //검색할 데이터를 찾은 경우
				return i;
			}
			// 다음 index의 값을 확인하기 위해서 index를 1 증가
			++i; // i++, i=i+1, i+=1
		}
	}
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
	
		// 데이터의 개수 입력: 배열을 생성
		System.out.print("데이터 수 -> ");
		int n =  s.nextInt();
		
		// 배열을 생성
		int data[] = new int[n]; // 5-> 0,1,2,3,4
		
		// 데이터 입력
		for(int i=0; i<n; i++) {
			System.out.print("data["+i+"]=");
			data[i] = s.nextInt();
		}
		
		// 찾을 숫자를 입력받는다
		System.out.print("검색할 데이터 -> ");
		int key = s.nextInt();
		
		// for를 이용한 선형검색 호출
		int idx = linearSearch1(data, n, key);
		if(idx>=0) {// 검색한 데이터가 있을때
			System.out.println(key+"는 data["+idx+"]에 있습니다.");
		}else{ // 검색한 데이터가 없을때
			System.out.println(key+"는 존재하지 않는 데이터입니다.");
		}
		
		// while문을 이용한 선형검색 호출
		int idx2 = linearSearch2(data, n, key);
		if(idx2>=0) {// 검색한 데이터가 존재함
			System.out.println(key+"는 data["+idx+"]에 존재합니다.");
		}else {// 검색한 데이터가 존재하지 않음
			System.out.println(key+"는 존재하지 않는 데이터입니다.");
		}
		
	}

}
