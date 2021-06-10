package com.hanna.basic401;

public class IntStack {

	    //스택 용량 
		private int max;
		//스택 포인터 
		private int ptr;
		//스택
	 	private int[] stk;
	 	
		//실행 예외 처리 : 스택이 비어 있는 경우 
	 	public class EmptyIntStackException extends RuntimeException {
	 		public EmptyIntStackException() {
	 			
	 		}
	 	}
	 	
	 	//실행 예외 처리 : 스택이 범위가 가득 찬 경우 
	 	public class OverflowIntStackException extends RuntimeException {
	 		public OverflowIntStackException() {
	 			
	 		}
	 	}

	 	//생성자 ( 스택의 크기를 받아 생성하고 변수 초기화
		public IntStack(int capacity) {
			
			this.ptr = 0;
			this.max = capacity;

			try {
				//스택의 용량을 기준으로 배열 생성 
				this.stk = new int[max];
			} catch (OutOfMemoryError e) {
				max = 0 ; 
			}
			
		}
		
		//스택에 x를 푸시 
		public int push(int x) throws OverflowIntStackException {
			
			//스택이 가득 참
			if( ptr >= max )
				throw new OverflowIntStackException();
			return stk[ptr++] = x;
		}
		
		//스택에서 데이터를 팝
		public int pop() throws EmptyIntStackException {
			
			//스택이 비어 있음
			if( ptr <= 0 )
				throw new EmptyIntStackException();
			return stk[--ptr];
			
		}
		
		//스택에서 테이터를 피크(정상 테이터 들여다봄)
		public int peek() throws EmptyIntStackException {
			
			//스택이 비어 있음
			if( ptr <= 0 )
				throw new EmptyIntStackException();
			return stk[ptr -1];
			
		}
		
		//스택에서 x를찾아 인덱스 반환
		public int indexOf (int x) {
			for (int i = ptr-1; i >= 0; i--) {
				if(stk[i] == x) {
					return i;
				}
			}
			return -1;
		}
		
		//스택을 비움
		public void clear() {
			this.ptr = 0;
		}
		
		//스택의 용량을 반환
		public int capacity() {
			return this.max;
		}
		
		//스택의 쌓여 있는 데이터 수 반환
		public int size() {
			return ptr;
		}
		
		//스택이 비어있는가?
		public boolean isEmpty() {
			return ptr <= 0;
		}
		
		//스택이 가득 찼는가?
		public boolean isfull() {
			return ptr >= max;
		}
		
		//스택 안의 모든 데이터를 바닥부터 순서대로 출력
		public void dump() {
			if (this.ptr <= 0) {
				System.out.println("스택이 비어 있습니다.");
			}else {
				for (int i = 0; i < ptr; i++) {
					System.out.println(stk[i]);
				}
			}
		}
}