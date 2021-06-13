package com.hanna.basic402;

public class Gstack2<E> {

	// 큐 용량
	private int max;
	// 첫 번째 요소
	private int front;
	// 마지막 요소
	private int rear;
	// 현재 데이터 수
	private int num;
	// 큐 본체
	private E[] que;

	// 실행 예외 처리 : 큐가 비어 있는 경우
	public static class EmptyGstackException extends RuntimeException {
		public EmptyGstackException() {

		}
	}

	// 실행 예외 처리 : 큐가 범위가 가득 찬 경우
	public static class OverflowGstackException extends RuntimeException {
		public OverflowGstackException() {

		}
	}

	//생성자
	 	public Gstack2 (int capacity) {
	 		
	 		num = front = rear = 0;
	 		max = capacity;
	 		
	 		try {
	 			que = (E[]) new Object[max]; 
	 		}catch (OutOfMemoryError e) {
	 			max = 0;
	 		}
	 	}
	 	
	 	//인큐
	 	public E enque(E x) throws OverflowGstackException {
	 		
	 		if(num >= max)
	 			//큐가 가득참
	 			throw new OverflowGstackException();
	 		
	 		que[rear++] = x;
	 		num++;
	 		
	 		if(rear == max)
	 			rear = 0;
			
	 		return x;
	 	}
	 	
	 	//디큐
	 	public E deque() throws EmptyGstackException {
	 		
	 		if(num <= 0)
	 			//큐가 빔
	 			throw new EmptyGstackException();
	 		
	 		E x = que[front];
	 		num--;
	 		
	 		if(front == max)
	 			front = 0;
	 		
			return x;
	 	}
	 	
	 	//피크
	 	public E peek() throws EmptyGstackException {
	 		
	 		if(num <= 0)
	 			throw new EmptyGstackException();
	 		
	 		return que[front];
	 	}
	 	
	 	//큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
	 	public int indexOf(E x) {
	 		
	 		for (int i = 0; i < num; i++) {
				
	 			if (que[(i + front) % max] == x) // 검색성공
					return i + front;
	 		}
			return -1; // 검색실패
	 	}
	 	
	 	// 큐를 비움
	 	public void clear() {
	 		num = front = rear = 0;;
	 		
	 	}

	 	// 큐의 용량을 반환
	 	public int capacity() {
	 		return max;
	 		
	 	}

	 	// 큐에 쌓인 데이터 수를 반환
	 	public int size() {
	 		return num;
	 		
	 	}

	 	// 큐가 비어 있는가?
	 	public boolean isEmpty() {
	 		return num <= 0;
	 		
	 	}

	 	// 큐가 가득 찼는가?
	 	public boolean isFull() {
	 		return num >= max;
	 		
	 	}

	 	// 큐 안의 데이터를 머리→꼬리의 차례로 출력함
	 	public void dump() {
	 		
	 		if (num <= 0)
	 			System.out.println("큐가 비었습니다.");
	 		
	 		else {
	 			for (int i = 0; i < num; i++)
	 				System.out.print(que[(i + front) % max] + " ");
	 		
	 			System.out.println();
	 			
	 		}
	 	}
}
