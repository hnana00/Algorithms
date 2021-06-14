package com.hanna.basic402;

public class IntDeque {

	private int max; // ��(deck)�� �뷮
	private int num; // ������ ������ ��
	private int front; // �� �� Ŀ��
	private int rear; // �� �� Ŀ��
	private int[] que; // ��(deck)�� ��ü

	// ������ �� ���ܣ�ť�� ��� ����
	public class EmptyIntDequeException extends RuntimeException {
		public EmptyIntDequeException() {
		}

	}

	// ������ �� ���ܣ�ť�� ���� ��
	public class OverflowIntDequeException extends RuntimeException {
		public OverflowIntDequeException() {
		}
	}

	// ������
	public IntDeque(int capacity) {
		num = front = rear = 0;
		max = capacity;
		try {
			que = new int[max]; // ��(deck)��ü�� �迭�� ����
		} catch (OutOfMemoryError e) { // ������ �� �����ϴ�
			max = 0;
		}
	}

	// ��(deck)�� �����͸� �Ӹ��ʺ��� ��ť
	public int enqueFront(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException(); // ��(deck)�� ���� ��
		num++;
		if (--front < 0)
			front = max - 1;
		que[front] = x;
		return x;
	}

	// ��(deck)�� �����͸� �����ʺ��� ��ť
	public int enqueRear(int x) throws OverflowIntDequeException {
		if (num >= max)
			throw new OverflowIntDequeException(); // ��(deck)�� ���� ��
		que[rear++] = x;
		num++;
		if (rear == max)
			rear = 0;
		return x;
	}

	// ��(deck)�� �Ӹ����� �����͸� ��ť
	public int dequeFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		int x = que[front++];
		num--;
		if (front == max)
			front = 0;
		return x;
	}

	// ��(deck)�� �������� �����͸� ��ť
	public int dequeRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		num--;
		if (--rear < 0)
			rear = max - 1;
		return que[rear];
	}

	// ��(deck)�� �Ӹ����� �����͸� ��ũ(�Ӹ������͸� ���캽)
	public int peekFront() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		return que[front];
	}

	// ��(deck)�� �������� �����͸� ��ũ(���������͸� ���캽)
	public int peekRear() throws EmptyIntDequeException {
		if (num <= 0)
			throw new EmptyIntDequeException(); // ��(deck)�� ��� ����
		return que[rear == 0 ? max - 1 : rear - 1];
	}

	// ��(deck)���� x�� �˻��Ͽ� index(ã�� ���ϸ� -1)�� ��ȯ
	public int indexOf(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max] == x) // �˻�����
				return i + front;
		return -1; // �˻�����
	}

	// ��(deck)���� x�� �˻��Ͽ� �Ӹ����� �� �� °�ΰ�(ã�� ���ϸ� 0)�� ��ȯ
	public int search(int x) {
		for (int i = 0; i < num; i++)
			if (que[(i + front) % max] == x) // �˻�����
				return i + 1;
		return 0; // �˻�����
	}

	// ��(deck)�� ���
	public void clear() {
		num = front = rear = 0;
	}

	// ��(deck)�� �뷮�� ��ȯ
	public int capacity() {
		return max;
	}

	// ��(deck)�� ���� ������ ���� ��ȯ
	public int size() {
		return num;
	}

	// ��(deck)�� ��� �ִ°�?
	public boolean isEmpty() {
		return num <= 0;
	}

	// ��(deck)�� ���� á�°�?
	public boolean isFull() {
		return num >= max;
	}

	// ��(deck)���� �����͸� �Ӹ��沿���� ���ʷ� ��Ÿ��
	public void dump() {
		if (num <= 0)
			System.out.println("��(deck)�� ������ϴ�.");
		else {
			for (int i = 0; i < num; i++)
				System.out.print(que[(i + front) % max] + " ");
			System.out.println();
		}
	}
}
