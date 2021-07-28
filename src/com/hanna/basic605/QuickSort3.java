package com.hanna.basic605;

public class QuickSort3 {

	/*
	 * �� ����(���) ��� ������ ���� �׷� ���� ������ �޼���
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
		
		do {
			while( a[pl] < x )
				pl++;
			
			while( a[pr] > x )
				pr--;
			
			if( pl <= pr )
				swap( a, pl++, pr-- );
			
		} while( pl <= pr );
		
		if (pr - left < right - pl) {
			
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
		
		int[] a = {5,8,4};
		int n = 3;
		
		quicksort( a, n );
		
		for( int i = 0; i < n; i++ )
			System.out.println("a[" + i + "] = " + a[i]);
	}
}
