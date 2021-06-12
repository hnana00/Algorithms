package com.hanna.basic402;

public class IntQueue {

	/* 링 버퍼 큐를 규현하는 프로그램 */
	
	//큐 용량
	private int max;
	//첫 번째 요소
	private int front;
	//마지막 요소
	private int rear;
	//현재 데이터 수
	private int num;
	//큐 본체
	private int[] que;
	
	
	//실행 예외 처리 : 큐가 비어 있는 경우 
 	public class EmptyintqueueException extends RuntimeException {
 		public EmptyintqueueException() {}
 	}
 	
 	//실행 예외 처리 : 큐가 범위가 가득 찬 경우 
 	public class OverflowintqueueException extends RuntimeException {
 		public OverflowintqueueException() {}
 	}
 	
 	//생성자
 	public IntQueue (int capacity) {
 		
 		num = front = rear = 0;
 		max = capacity;
 		
 		try {
 			que = new int[max]; 
 		}catch (OutOfMemoryError e) {
 			max = 0;
 		}
 	}
 	
 	//인큐
 	public int enque(int x) throws OverflowintqueueException {
 		
 		if(num >= max)
 			//큐가 가득참
 			throw new OverflowintqueueException();
 		
 		que[rear++] = x;
 		num++;
 		
 		if(rear == max)
 			rear = 0;
		
 		return x;
 	}
 	
 	//디큐
 	public int deque() throws EmptyintqueueException {
 		
 		if(num <= 0)
 			//큐가 빔
 			throw new EmptyintqueueException();
 		
 		int x = que[front];
 		num--;
 		
 		if(front == max)
 			front = 0;
 		
		return x;
 	}
 	
 	//피크
 	public int peek() throws EmptyintqueueException {
 		
 		if(num <= 0)
 			throw new EmptyintqueueException();
 		
 		return que[front];
 	}
 	
 	//큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
 	public int indexOf(int x) {
 		
 		for (int i = 0; i < num; i++) {
			
 			int idx = (i + front) % max;
 			
 			if (que[idx] == x) // 검색성공
				return idx;
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
 	
 	//큐 안에서 몇 번째에 있는가
 	int search(int x) {
 		
 		for (int i = 0; i < num; i++)
			
 			if (que[(i + front) % max] == x) // 검색성공
				return i + 1;
		
 		return 0; // 검색실패
 	}
}
