package com.hanna.basic402;

public class IntQueue {

	/* �� ���� ť�� �����ϴ� ���α׷� */
	
	//ť �뷮
	private int max;
	//ù ��° ���
	private int front;
	//������ ���
	private int rear;
	//���� ������ ��
	private int num;
	//ť ��ü
	private int[] que;
	
	
	//���� ���� ó�� : ť�� ��� �ִ� ��� 
 	public class EmptyintqueueException extends RuntimeException {
 		public EmptyintqueueException() {}
 	}
 	
 	//���� ���� ó�� : ť�� ������ ���� �� ��� 
 	public class OverflowintqueueException extends RuntimeException {
 		public OverflowintqueueException() {}
 	}
 	
 	//������
 	public IntQueue (int capacity) {
 		
 		num = front = rear = 0;
 		max = capacity;
 		
 		try {
 			que = new int[max]; 
 		}catch (OutOfMemoryError e) {
 			max = 0;
 		}
 	}
 	
 	//��ť
 	public int enque(int x) throws OverflowintqueueException {
 		
 		if(num >= max)
 			//ť�� ������
 			throw new OverflowintqueueException();
 		
 		que[rear++] = x;
 		num++;
 		
 		if(rear == max)
 			rear = 0;
		
 		return x;
 	}
 	
 	//��ť
 	public int deque() throws EmptyintqueueException {
 		
 		if(num <= 0)
 			//ť�� ��
 			throw new EmptyintqueueException();
 		
 		int x = que[front];
 		num--;
 		
 		if(front == max)
 			front = 0;
 		
		return x;
 	}
 	
 	//��ũ
 	public int peek() throws EmptyintqueueException {
 		
 		if(num <= 0)
 			throw new EmptyintqueueException();
 		
 		return que[front];
 	}
 	
 	//ť���� x�� �˻��Ͽ� index(ã�� ���ϸ� -1)�� ��ȯ
 	public int indexOf(int x) {
 		
 		for (int i = 0; i < num; i++) {
			
 			int idx = (i + front) % max;
 			
 			if (que[idx] == x) // �˻�����
				return idx;
 		}
		return -1; // �˻�����
 	}
 	
 	// ť�� ���
 	public void clear() {
 		num = front = rear = 0;;
 		
 	}

 	// ť�� �뷮�� ��ȯ
 	public int capacity() {
 		return max;
 		
 	}

 	// ť�� ���� ������ ���� ��ȯ
 	public int size() {
 		return num;
 		
 	}

 	// ť�� ��� �ִ°�?
 	public boolean isEmpty() {
 		return num <= 0;
 		
 	}

 	// ť�� ���� á�°�?
 	public boolean isFull() {
 		return num >= max;
 		
 	}

 	// ť ���� �����͸� �Ӹ��沿���� ���ʷ� �����
 	public void dump() {
 		
 		if (num <= 0)
 			System.out.println("ť�� ������ϴ�.");
 		
 		else {
 			for (int i = 0; i < num; i++)
 				System.out.print(que[(i + front) % max] + " ");
 		
 			System.out.println();
 			
 		}
 	}
 	
 	//ť �ȿ��� �� ��°�� �ִ°�
 	int search(int x) {
 		
 		for (int i = 0; i < num; i++)
			
 			if (que[(i + front) % max] == x) // �˻�����
				return i + 1;
		
 		return 0; // �˻�����
 	}
}
