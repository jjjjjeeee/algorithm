package al03_stack_queue;

public class IntQueue {
	int capacity; // 큐의 크기
	int queue[]; // 큐의 메모리를 선언
	
	// 초기값: 정수:0, 실수:0.0, 논리:false, 객체형:null
	int front; // 제일 앞 위치
	int rear; // 제일 마지막 위치
	int dataCnt; // 큐의 데이터 개수
	
	public IntQueue() {}
	public IntQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		
		// 초기값은 굳이 안줘도 상관없음
//		front=0; 
//		rear=0;
//		dataCnt=0;
//		front=rear=dataCnt = 0;
	
	}
	// 큐에 데이터를 추가하는 메소드
	public int enqueue(int data) throws QueueOverFlowException{
		// 데이터가 가득 찼는지 확인
		// capacity: 용량, dataCnt: 현재 데이터수
		if(capacity<=dataCnt) {// 오버플로우 발생
			throw new QueueOverFlowException();
		}
		// 데이터를 큐에 담는다 (rear: 위치에)
		queue[rear++] = data;
		dataCnt++; // 데이터의 수 증가
		// rear 위치를 링형으로 처리하기
		if(rear==capacity) {
			rear = 0;
		}
		System.out.println("rear->"+rear+", 남은 데이터="+dataCnt);
		return data;
	}
	// 큐에서 데이터를 얻어오기 메서드
	public int dequeue() throws QueueEmptyException{
		if(dataCnt<=0) {
			throw new QueueEmptyException();
		}
		// 큐에 데이터가 있을때 실행됨
		dataCnt--; // 남은 객체의 수를 1감소
		int deData = queue[front++];
		if(front==capacity)
			front=0;
		System.out.println("front->"+front+", 남은 데이터 수="+dataCnt);
		return deData;
	}
	// 3. peek: 큐의 제일 앞(front) 데이터를 구한다
	public int peek() throws QueueEmptyException{
		if(dataCnt<=0) {
			throw new QueueEmptyException();
		}
		return queue[front];
	}
	// 4. 큐의 크기
	public int getCapacity() {
		return capacity;
	}
	// 4. 큐의 데이터의 수
	public int getSize() {
		return dataCnt;
	}
	// 4. front 인덱스
	public int getFrontIndex() {
		return front;
	}
	// 4. rear 인덱스
	public int getRearIndex() {
		return rear;
	}
	// 4. 마지막 값
	public int getRearData() {
		return queue[rear-1];
	}
	// 큐가 비어있을때 Empty예외 클래스
	class QueueEmptyException extends RuntimeException {
		QueueEmptyException(){};
	}
	// 오버플로우 발생시 처리할 예외
	class QueueOverFlowException extends RuntimeException{
		QueueOverFlowException(){} // 생성자 메소드
		
	}

}


