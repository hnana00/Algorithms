package com.hanna.basic605;

public class QuickSort {

	/*
	 * �� ����(���)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//�ǹ� ���� 1��� = ���Ƿ� ��� 3�� ���� �� �߾Ӱ��� ���Ͽ� ��ȯ
	static int med3( int a, int b, int c ) {
		
			if ( a >= b )
				if ( b >= c )
					return b;
		
				else if ( a <= c )
					return a;
		 
				else
					return c;
		
			else if ( a > c )
				return a;
		
			else if ( b > c )
				return c;
		
			else
				return b;
		}
	
	// �ǹ� ���� 2��� = x[a], x[b], x[c]�� sort (�߾Ӱ��� index�� ��ȯ)
		static int sort3Elem( int[] x, int a, int b, int c ) {
			
			if ( x[b] < x[a] )
				swap( x, b, a );
			
			if ( x[c] < x[b] )
				swap( x, c, b );
			
			if ( x[b] < x[a] )
				swap( x, b, a );
			
			return b;
		}
		
	//���
	static void quicksort( int[] a, int left, int right ) {

		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		/* 
		 	--- �ǹ� ���� 2��� ---
		    int m = sort3Elem( a, pl, (pl + pr) / 2, pr );
			x = a[m]; //�ǹ�
			swap(a, m, right - 1); //��� ��ҿ� ������ �� ��°  ��Ҹ� ��ȯ
			pl++;  //���� ������ġ
			pr--;  //������ ������ġ
		*/

		System.out.printf("a[%d]~[%d] : {",left,right);
		
		for( int i = left; i < right; i++ )
			System.out.printf("%d , ",a[i]);
		
		System.out.printf("%d}\n",a[right]);
		
		do {
			while( a[pl] < x )
				pl++;
			
			while( a[pr] > x )
				pr--;
			
			if( pl <= pr )
				swap( a, pl++, pr-- );
			
		} while( pl <= pr );
		
		//��� ������ ���� �׷� ���� ������ �޼���
		if ( pr - left < right - pl ) {
			
			int temp;
			
			temp = left;
			left = pl;
			pl = temp;
			
			temp = right;
			right = pr;
			pr = temp;
		}

		if( left < pr ) {
			quicksort( a, left, pr );
		}
		
		if( pl < right ) {
			quicksort( a, pl, right );
		}
	}
	
	// ������(n �� ��ڼ�)
	static void quicksort( int[] a, int n ) {
			
		quicksort(a, 0, n - 1);
		}
	
	public static void main(String[] args) {

		System.out.println("�� ����");
		
		int[] a = {5,8,4,2,6};
		int n = 5;
		
		quicksort( a, n );
		
		for( int i = 0; i < n; i++ )
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
