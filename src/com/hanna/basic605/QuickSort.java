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
	
	static void quicksort( int[] a, int left, int right ) {

		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
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
