package com.hanna.basic601;

public class BubbleSort {

	/*
	 * 버블 정렬(버전1)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//오른쪽부터 시작
	static void bubblesort( int[] a, int n ) {
		
		int e = 0;
		for( int i = 0; i < n - 1; i++ ) {
			for( int j = n - 1; j > i; j-- )
				if( a[j - 1] > a[j] ) {
					swap( a, j - 1, j );
					e++;
			}
			if( e == 0 )
				break;
		}
		System.out.println("=========" + e);
	}
	
	//왼쪽부터 시작
	static void bubblesort1( int[] a, int n ) {
		
		for( int i = n - 1; i > 0; i-- )
			for( int j = 0; j < i; j++ )
				if( a[j] > a[j+1] )
					swap( a, j-1, j );
	}
	
	public static void main(String[] args) {

		System.err.println("버블 정렬(버전 1)");
		
		int[] x = {22,5,11,32,120,68,70};
		int n = 7;
		
		bubblesort(x,n);
		System.out.println("오른쪽부터 오름차순으로 정렬했습니다.");
		for(int i = 0; i < n; i++)
			System.out.println("x[" + x[i] + "]");
		
		System.out.println();
		
		bubblesort1(x,n);
		System.out.println("왼쪽부터 오름차순으로 정렬했습니다.");
		for(int i = 0; i < n; i++)
			System.out.println("x[" + x[i] + "]");
	}
}
