package al02_search;

import java.util.Scanner;

public class BinarySearch {
	// ���� �˻�(binary search)
	// �����Ͱ� ���ĵǾ� �־�� ��
	// ��� ��ġ�� ���Ͽ� �˻���
	static int binarySearch(int arr[], int n, int key){
		int left = 0; // ���� ���� index (���� index)
		int right = n-1; // ������ ������ index (�� index)
		
		do {
			// �߰� index�� ���Ѵ�
			int center = (left+right)/2;
			if(key==arr[center]) { // �˻��� ���� �߰� index�� ���� ��� 
				return center;
				} else if(arr[center]<key){ // ã�����ϴ� ���� �߾Ӱ����� ũ�� �߾Ӱ� ������ �˻��� �ʿ䰡 ����
					left = center+1; // left�� center+1�� �ٲ۴�
				} else {
					right = center-1;
				}
			
		}while(left <= right);
		// �˻��� ���� ���� ��� (��=�� �ε����� ���ų� �������� ���ʺ��� �۰ų� ������ �����ʺ��� ũ�� ���̻� �����Ͱ� ���� ��)
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("������ �� = ");
		int n = s.nextInt();
		
		int arr[] = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.print("arr["+i+"]=");
			arr[i] = s.nextInt();
		}
		
		// �˻��� �� �Է�
		int key = s.nextInt();
		
		// �����˻�
		int result = binarySearch(arr, n, key);
		if(result>=0) {
			System.out.println(key+"�� arr["+result+"]��ġ�� �����մϴ�.");
		} else {
			System.out.println(key+"�� �������� �ʴ� �������Դϴ�.");
		}
	}

}