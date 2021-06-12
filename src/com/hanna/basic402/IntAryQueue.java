package com.hanna.basic402;

public class IntAryQueue {

	/* ť�� �����ϴ� ���α׷� */
	
	//ť �뷮
	private int max;
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
 	public void IntAryQueu (int capacity) {
 		
 		num = 0;
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
 			throw new OverflowintqueueException();
 		
		return que[num++] = x;
 	}
 	
 	//��ť
 	public int deque() throws EmptyintqueueException {
 		
 		if(num <= 0)
 			throw new EmptyintqueueException();
 		
 		//�ε���0��° ���� ������ ������ ��Ҹ� ������ ����
 		int x = que[0];
 		for(int i = 0; i < num-1; i++) {
 			
 			que[i] = que[i+1];
 		}
 		num--;
 		
		return x;
 	}
 	
 	//��ũ
 	public int peek() throws EmptyintqueueException {
 		
 		if(num <= 0)
 			throw new EmptyintqueueException();
 		
 		return que[num - 1];
 	}
 	
 	//ť���� x�� �˻��Ͽ� index(ã�� ���ϸ� -1)�� ��ȯ
 	public int indexOf(int x) {
 		
 		for (int i = 0; i < num; i++)
			
 			if (que[i] == x) // �˻�����
				return i;
 		
		return -1; // �˻�����
 		
 	}
 	
 	// ť�� ���
 	public void clear() {
 		num = 0;
 		
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
 				System.out.print(que[i] + " ");
 		
 			System.out.println();
 			
 			}
 		}
 	}
