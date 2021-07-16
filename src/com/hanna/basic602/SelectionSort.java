package com.hanna.basic602;

public class SelectionSort {

	/*
	 * 단순 선택 정렬(자세히 출력)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void selectionsort( int[] a, int n ) {
		
		for ( int i = 0; i < n - 1; i++ ) {
			int min = i; // 미정렬된 부분 최소 요소의 indexn  
			
			for ( int j = i + 1; j < n; j++ ) {
				if ( a[j] < a[min] )
					min = j;
			}
			
			for ( int m = 0; m < n; m++ ) {
				System.out.print((m == i) ? "  * " : (m == min) ? "  + " : "    ");
			}
			
			System.out.println();

			for ( int m = 0; m < n; m++ ) {
				System.out.printf("%3d ", a[m]);
			}
			
			System.out.println("\n");
			
			swap( a, i, min ); // 미정렬된 부분 머리요소와 최소 요소를 교환
		}
	}
	
	public static void main(String[] args) {

		int[] x = {6,4,8,3,1,9,7};
		int n = 7;

		selectionsort(x, n); // 배열 x를 양방향 버블정렬
	}
}
