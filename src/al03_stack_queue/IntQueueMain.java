package al03_stack_queue;

import java.util.Scanner;

public class IntQueueMain {
	
	static Scanner s = new Scanner(System.in);
	// 메뉴를 입력받는 메소드	
	static String getMenu() {
		// 3. 제일 앞의 갚을 구하여 출력(데이터에 변동없음, 확인만 하는 것)
		// 4. 큐의 크기, 데이터의 수, front 인덱스, rear 인덱스, 처음과 마지막값을 구하라 
		System.out.print("[메뉴]1.enqueue, 2.dequeue, 3.peek, 4.info, 9.end ?");
		return s.nextLine();
	}
	
	public static void main(String[] args) {
		
		IntQueue queue = new IntQueue(10);
		
		while(true) {
			String menu = getMenu();
			if(menu.equals("9")) { // 9.end 선택시 
				break;
			}else { // 그 외 선택시
				switch(menu) {
				case "1": // 큐에 데이터를 추가한다
					System.out.print("큐에 추가할 데이터: ");
					int data = Integer.parseInt(s.nextLine());
					try {
					int result = queue.enqueue(data);
					}catch(Exception e) {
						System.out.println("큐가 가득찼습니다.");
					}
					break;
			
				case "2": // 큐의 데이터 가져오기(제일 앞의 것)
					try {
						int result = queue.dequeue();
						System.out.println("큐에서 가져온 데이터 -> "+result);
					}catch(Exception e) {
						System.out.println("큐가 비어있습니다.");
					}
					break;
				
				case "3": // peek: 제일 앞에 있는 객체 얻어오기
						  // que[front] 값을 조사만하고 데이터는 꺼내지 않음
					try {
						int result = queue.peek();
						System.out.println("큐의 제일 앞 데이터 -> "+result);
					}catch(Exception e) {
						System.out.println("큐가 비어있습니다.");
					}
					break;
				
				case "4": // 4.큐의 크기, 데이터의 수, front 인덱스, rear 인덱스, 처음과 마지막값을 구하라 
					try {
						System.out.println("큐의 크기-> "+queue.getCapacity());
						System.out.println("데이터의 수->"+queue.getSize());
						System.out.println("front->"+queue.getFrontIndex());
						System.out.println("rear->"+queue.getRearIndex());
						System.out.println("처음값->"+queue.peek());
						System.out.println("마지막값->"+queue.getRearData());
					}catch(Exception e) {
						
					}
					break;
				default: 
					System.out.println("메뉴를 잘못 선택하였습니다.");
				}
			}
		}

		System.out.println("프로그램이 종료되었습니다.");
	}
}
