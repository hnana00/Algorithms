package com.hanna.basic402;

public class Gstack2<E> {

	// ť �뷮
	private int max;
	// ù ��° ���
	private int front;
	// ������ ���
	private int rear;
	// ���� ������ ��
	private int num;
	// ť ��ü
	private E[] que;

	// ���� ���� ó�� : ť�� ��� �ִ� ���
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {

		}
	}

	// ���� ���� ó�� : ť�� ������ ���� �� ���
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {

		}
	}

	//������
	 	public Gstack2 (int capacity) {
	 		
	 		num = front = rear = 0;
	 		max = capacity;
	 		
	 		try {
	 			que = (E[]) new Object[max]; 
	 		}catch (OutOfMemoryError e) {
	 			max = 0;
	 		}
	 	}
	 	
	 	//��ť
	 	public E enque(E x) throws OverflowGstackException {
	 		
	 		if(num >= max)
	 			//ť�� ������
	 			throw new OverflowGstackException();
	 		
	 		que[rear++] = x;
	 		num++;
	 		
	 		if(rear == max)
	 			rear = 0;
			
	 		return x;
	 	}
	 	
	 	//��ť
	 	public E deque() throws EmptyGstackException {
	 		
	 		if(num <= 0)
	 			//ť�� ��
	 			throw new EmptyGstackException();
	 		
	 		E x = que[front];
	 		num--;
	 		
	 		if(front == max)
	 			front = 0;
	 		
			return x;
	 	}
	 	
	 	//��ũ
	 	public E peek() throws EmptyGstackException {
	 		
	 		if(num <= 0)
	 			throw new EmptyGstackException();
	 		
	 		return que[front];
	 	}
	 	
	 	//ť���� x�� �˻��Ͽ� index(ã�� ���ϸ� -1)�� ��ȯ
	 	public int indexOf(E x) {
	 		
	 		for (int i = 0; i < num; i++) {
				
	 			if (que[(i + front) % max] == x) // �˻�����
					return i + front;
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
}
