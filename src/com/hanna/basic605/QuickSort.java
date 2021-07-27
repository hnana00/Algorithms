package com.hanna.basic605;

public class QuickSort {

	/*
	 * Äü Á¤·Ä(Àç±Í)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void quicksort( int[] a, int left, int right ) {
		System.out.println("left = " +left);
		System.out.println("right = " +right);
		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		System.out.println("x =" + x);
		do {
			while( a[pl] < x )
				pl++;
			
			while( a[pr] > x )
				pr--;
			
			if( pl <= pr )
				swap( a, pl++, pr-- );
			
		} while( pl <= pr );
		
		for( int i = 0; i < 9; i++ ) {
			System.out.println("a[" + i + "]" + a[i]);
		}
		
		if( left < pr ) {
			System.out.println("Àç±Íleft" +left);
			quicksort( a, left, pr );
		}
		
		if( pl < right ) {
			System.out.println("Àç±Írihjt" +right);
			quicksort( a, pl, right );
		}
	}
	
	// ÄüÁ¤·Ä(n ¡¦ ¿ä¼Ú¼ö)
	static void quicksort( int[] a, int n ) {
			
		quicksort(a, 0, n - 1);
		}
	
	public static void main(String[] args) {

		System.out.println("Äü Á¤·Ä");
		
		int[] a = {5,8,4,2,6,1,3,9,7};
		int n = 9;
		
		quicksort( a, n );
		
		for( int i = 0; i < n; i++ )
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
