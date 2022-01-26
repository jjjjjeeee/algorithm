package al04_linkedlist;

import java.util.Scanner;

public class LinkedListTestMain {
	static Scanner scan = new Scanner(System.in);
	
	// ��ȣ�� �̸��� ������ �� �ִ� ����Ŭ���� (��� 1���� ������ ����)
	static class Data{
		private Integer no;
		private String name;
		
		static final int NO = 1; // ��ȣ�� �Է¹����� Ȯ��
		static final int NAME = 2;
		// String �������� ���� ��ȯ
		public String toString() {
			return no+" : "+name; // �ϳ��� ���ڿ��� ��ȯ
		}
		
		// ��ȣ �Ǵ� �̸��� �Է¹޴� �޼ҵ�
		public void scanData(String msg, int s) {
			// s���� 1, 2, 3�߿� �ϳ��� ���Եȴ�.
			if((s & NO)==NO) {
				// ��ȣ�Է�
				System.out.print("��ȣ->");
				no = scan.nextInt();
				
			}
			if((s & NAME) == NAME) {
				// �̸��Է�
				System.out.print("�̸�->");
				name = scan.next(); // ������ �������� �� �ܾ �Է�, nextLine()�� ���ͱ��� 
			}
		}	
	}
	
	// �޴��� ���������� �����
	enum Menu{
		ADD_FIRST("�Ӹ��� ��� ����"),
		ADD_LAST("������ ��� ����"),
		REMOVE_FIRST("�Ӹ� ��� ����"),
		REMOVE_CURRENT("���� ��� ����"),
		DUMP("��� ��� ���"),
		TERMINATE("����");
		
		private final String message;
		
		static Menu MenuAt(int idx) {
			for(Menu m:Menu.values()) {
				if(m.ordinal()==idx)
					return m;
			}
			return null;
		}
		Menu(String str){
			message = str;
		}
		String getMessage() {
			return message;
		}
	}
	// �޴��� ǥ���ϰ� �޴��� index�� �Է¹޾� ������ �޴���ü �����ϴ� �޼ҵ�
	static Menu SelectMenu() {
		int key; // ������ �޴�
		do {
			for(Menu m:Menu.values()) {
				System.out.printf("(%d) %s   ", m.ordinal(), m.getMessage());
			}
			System.out.print("->");
			key = scan.nextInt();
		}while(key<Menu.ADD_FIRST.ordinal() || key>Menu.TERMINATE.ordinal());
		
		return Menu.MenuAt(key);
	}
	
	public static void main(String[] args) {
		Menu menu; // ������ �޴�
		// linkedlist�� data�� �� �� �ֵ��� ��(���׸���)
		LinkedListTest<Data> list = new LinkedListTest<Data>();
		
		do {
			// �޴��� ǥ��
			Data data;
			menu = SelectMenu();
			switch(menu) {
			case ADD_FIRST: // �Ӹ��� ��� ����
				data = new Data();
				data.scanData("�Ӹ� ��� ����",Data.NO | Data.NAME); // |: bit or����
				list.addFirst(data); // list�� ����
				break;
			case ADD_LAST: // ������ ��� ����
				data = new Data();
				data.scanData("����������", Data.NO | Data.NAME);
				list.addLast(data);
				break;
			case REMOVE_FIRST: // �Ӹ� ��� ����
				list.removeFirst();
				break;
			case REMOVE_CURRENT: // ���� ��� ����
				list.removeCurrent();
				break;
			case DUMP: // ��� ��� ���
				list.dump();
				break;
			}
		}while(menu != Menu.TERMINATE);
		System.out.println("���α׷��� ����Ǿ����ϴ�.");
	} 

}
