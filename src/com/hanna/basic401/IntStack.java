package com.hanna.basic401;

public class IntStack {

	    //���� �뷮 
		private int max;
		//���� ������ 
		private int ptr;
		//����
	 	private int[] stk;
	 	
		//���� ���� ó�� : ������ ��� �ִ� ��� 
	 	public class EmptyIntStackException extends RuntimeException {
	 		public EmptyIntStackException() {
	 			
	 		}
	 	}
	 	
	 	//���� ���� ó�� : ������ ������ ���� �� ��� 
	 	public class OverflowIntStackException extends RuntimeException {
	 		public OverflowIntStackException() {
	 			
	 		}
	 	}

	 	//������ ( ������ ũ�⸦ �޾� �����ϰ� ���� �ʱ�ȭ
		public IntStack(int capacity) {
			
			this.ptr = 0;
			this.max = capacity;

			try {
				//������ �뷮�� �������� �迭 ���� 
				this.stk = new int[max];
			} catch (OutOfMemoryError e) {
				max = 0 ; 
			}
			
		}
		
		//���ÿ� x�� Ǫ�� 
		public int push(int x) throws OverflowIntStackException {
			
			//������ ���� ��
			if( ptr >= max )
				throw new OverflowIntStackException();
			return stk[ptr++] = x;
		}
		
		//���ÿ��� �����͸� ��
		public int pop() throws EmptyIntStackException {
			
			//������ ��� ����
			if( ptr <= 0 )
				throw new EmptyIntStackException();
			return stk[--ptr];
			
		}
		
		//���ÿ��� �����͸� ��ũ(���� ������ �鿩�ٺ�)
		public int peek() throws EmptyIntStackException {
			
			//������ ��� ����
			if( ptr <= 0 )
				throw new EmptyIntStackException();
			return stk[ptr -1];
			
		}
		
		//���ÿ��� x��ã�� �ε��� ��ȯ
		public int indexOf (int x) {
			for (int i = ptr-1; i >= 0; i--) {
				if(stk[i] == x) {
					return i;
				}
			}
			return -1;
		}
		
		//������ ���
		public void clear() {
			this.ptr = 0;
		}
		
		//������ �뷮�� ��ȯ
		public int capacity() {
			return this.max;
		}
		
		//������ �׿� �ִ� ������ �� ��ȯ
		public int size() {
			return ptr;
		}
		
		//������ ����ִ°�?
		public boolean isEmpty() {
			return ptr <= 0;
		}
		
		//������ ���� á�°�?
		public boolean isfull() {
			return ptr >= max;
		}
		
		//���� ���� ��� �����͸� �ٴں��� ������� ���
		public void dump() {
			if (this.ptr <= 0) {
				System.out.println("������ ��� �ֽ��ϴ�.");
			}else {
				for (int i = 0; i < ptr; i++) {
					System.out.println(stk[i]);
				}
			}
		}
}