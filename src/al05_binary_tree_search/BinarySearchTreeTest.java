package al05_binary_tree_search;

import java.util.Scanner;

public class BinarySearchTreeTest {
	static Scanner s = new Scanner(System.in);
	
	// �����͸� ���� ��ü
	static class Data{
		private Integer no;  // �Է¹��� ��ȣ
		private String name; // �Է¹��� �̸�
		
		// 
		final int NO=1;   // ��ȣ �Է¹����� Ȯ��
		final int NAME=2; // �̸� �Է¹����� Ȯ��
		
		// ��ȣ�� ���� �� �ִ� �޼ҵ�
		Integer getkeyCode() {
			return no;
		}
		public String toString() {
			return name;
		}
		
		// ������ �Է¹޴� �޼ҵ�
		public void inData(String msg, int sw) {
			System.out.println(msg+"�� �Է��ϼ���");
			
			if((sw&NO)==NO) {
				System.out.print("��ȣ:");
				no = Integer.parseInt(s.nextLine());
			}
			if((sw&NAME)==NAME) {
				System.out.print("�̸�:");
				name = s.nextLine();
			}
		}
	} // Data
	// Menu
	
	enum Menu{ // ���������� menu ����
		ADD("ȸ���߰�"),
		REMOVE("����"),
		SEARCH("�˻�"),
		PRINT("���"),
		TERMINATE("����");
		private final String message;
		
		Menu(String msg){
			message = msg;
		}
		String getMessage() {
			return message;
		}
		// ����� �Է��� �޴���ü�� �����ϴ� �޼ҵ�
		static Menu menuAt(int idx) {
			for(Menu m:Menu.values()) {
				if(m.ordinal()==idx) {
					return m;
				}
			}
			return null;
		}
	}// Menu
	// �޴� ����ϰ� ����ڿ��� �޴��� �Է¹��� �޼ҵ�
	// ��ȯ�� : ������ �޴� ��ü
	static Menu selectMenu() {
		int menuNo;
		do { // �޴��� �߸��Է��ϸ� �ٸ� �޴��� �Է¹ޱ� ���ؼ�
			for(Menu m : Menu.values()) {// �޴����
				System.out.printf("%d.%s ",m.ordinal(), m.getMessage());
				}
			System.out.print(":");
			menuNo = Integer.parseInt(s.nextLine());
		}while(menuNo < Menu.ADD.ordinal() || menuNo > Menu.TERMINATE.ordinal());
		return Menu.menuAt(menuNo);
	} 

	public static void main(String[] args) {
		Menu m;
		
		BinaryTree<Integer, Data> tree = new BinaryTree<Integer, Data>();
		Data data;
		do {
		m = selectMenu(); // ����� ������ �޴�
		switch(m) {
		case ADD: // ��ȣ, �̸��� �Է¹޾� Node->tree�� ����
			data = new Data();
			data.inData("ȸ������", data.NO | data.NAME);
			// ���ο� ��� �߰��ϱ�
			tree.add(data.getkeyCode(),data);
			
			break;
		case REMOVE:
			// ������ Ű�� �Է¹ޱ�
			data = new Data();
			data.inData("������ key", data.NO);
			boolean result = tree.remove(data.getkeyCode());
			if(result)
				System.out.println(data.getkeyCode()+"�� ȸ���� �����Ǿ����ϴ�.");
			else System.out.println("ȸ�������� �����ϴ�.");
			break;
		case SEARCH:
			data = new Data();
			data.inData("�˻��� key", data.NO); // key�� �����
			// �˻��� ����� ���Ϲ޴´�
			Data searchData = tree.search(data.getkeyCode());
			if(searchData==null) {
				System.out.println("�ش�Ű�� ȸ�� ������ �������� �ʽ��ϴ�.");
			} else { // �˻��� ����� ������
				System.out.println("��ȣ:"+searchData.getkeyCode()+", �̸�:"+searchData);
			}
			break;
		case PRINT:
			tree.print();
			break;
		}
	}while(m !=Menu.TERMINATE);
	} // ���� �����

}
