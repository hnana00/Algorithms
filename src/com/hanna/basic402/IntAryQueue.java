package com.hanna.basic402;

public class IntAryQueue {

	/* 큐를 규현하는 프로그램 */
	
	//큐 용량
	private int max;
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
 	public void IntAryQueu (int capacity) {
 		
 		num = 0;
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
 			throw new OverflowintqueueException();
 		
		return que[num++] = x;
 	}
 	
 	//디큐
 	public int deque() throws EmptyintqueueException {
 		
 		if(num <= 0)
 			throw new EmptyintqueueException();
 		
 		//인덱스0번째 값을 꺼내고 나머지 요소를 앞으로 당긴다
 		int x = que[0];
 		for(int i = 0; i < num-1; i++) {
 			
 			que[i] = que[i+1];
 		}
 		num--;
 		
		return x;
 	}
 	
 	//피크
 	public int peek() throws EmptyintqueueException {
 		
 		if(num <= 0)
 			throw new EmptyintqueueException();
 		
 		return que[num - 1];
 	}
 	
 	//큐에서 x를 검색하여 index(찾지 못하면 -1)를 반환
 	public int indexOf(int x) {
 		
 		for (int i = 0; i < num; i++)
			
 			if (que[i] == x) // 검색성공
				return i;
 		
		return -1; // 검색실패
 		
 	}
 	
 	// 큐를 비움
 	public void clear() {
 		num = 0;
 		
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
 				System.out.print(que[i] + " ");
 		
 			System.out.println();
 			
 			}
 		}
 	}
