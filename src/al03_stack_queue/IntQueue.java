package al03_stack_queue;

public class IntQueue {
	int capacity; // ť�� ũ��
	int queue[]; // ť�� �޸𸮸� ����
	
	// �ʱⰪ: ����:0, �Ǽ�:0.0, ��:false, ��ü��:null
	int front; // ���� �� ��ġ
	int rear; // ���� ������ ��ġ
	int dataCnt; // ť�� ������ ����
	
	public IntQueue() {}
	public IntQueue(int capacity) {
		this.capacity = capacity;
		queue = new int[capacity];
		
		// �ʱⰪ�� ���� ���൵ �������
//		front=0; 
//		rear=0;
//		dataCnt=0;
//		front=rear=dataCnt = 0;
	
	}
	// ť�� �����͸� �߰��ϴ� �޼ҵ�
	public int enqueue(int data) throws QueueOverFlowException{
		// �����Ͱ� ���� á���� Ȯ��
		// capacity: �뷮, dataCnt: ���� �����ͼ�
		if(capacity<=dataCnt) {// �����÷ο� �߻�
			throw new QueueOverFlowException();
		}
		// �����͸� ť�� ��´� (rear: ��ġ��)
		queue[rear++] = data;
		dataCnt++; // �������� �� ����
		// rear ��ġ�� �������� ó���ϱ�
		if(rear==capacity) {
			rear = 0;
		}
		System.out.println("rear->"+rear+", ���� ������="+dataCnt);
		return data;
	}
	// ť���� �����͸� ������ �޼���
	public int dequeue() throws QueueEmptyException{
		if(dataCnt<=0) {
			throw new QueueEmptyException();
		}
		// ť�� �����Ͱ� ������ �����
		dataCnt--; // ���� ��ü�� ���� 1����
		int deData = queue[front++];
		if(front==capacity)
			front=0;
		System.out.println("front->"+front+", ���� ������ ��="+dataCnt);
		return deData;
	}
	// 3. peek: ť�� ���� ��(front) �����͸� ���Ѵ�
	public int peek() throws QueueEmptyException{
		if(dataCnt<=0) {
			throw new QueueEmptyException();
		}
		return queue[front];
	}
	// 4. ť�� ũ��
	public int getCapacity() {
		return capacity;
	}
	// 4. ť�� �������� ��
	public int getSize() {
		return dataCnt;
	}
	// 4. front �ε���
	public int getFrontIndex() {
		return front;
	}
	// 4. rear �ε���
	public int getRearIndex() {
		return rear;
	}
	// 4. ������ ��
	public int getRearData() {
		return queue[rear-1];
	}
	// ť�� ��������� Empty���� Ŭ����
	class QueueEmptyException extends RuntimeException {
		QueueEmptyException(){};
	}
	// �����÷ο� �߻��� ó���� ����
	class QueueOverFlowException extends RuntimeException{
		QueueOverFlowException(){} // ������ �޼ҵ�
		
	}

}


