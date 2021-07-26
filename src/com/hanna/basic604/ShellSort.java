package com.hanna.basic604;

public class ShellSort {

	static void shellsort( int[] a, int n ) {
		
		for( int h = n / 2; h > 0; h /= 2 )
			for( int i = h; i < n; i++) {
				
				int j;
				int tmp = a[i];
				
				for( j = i - h; j >= 0 && a[j] > tmp; j -= h )
					a[j + h] = a[j];
				a[j + h] = tmp;
			}
	}
	
	public static void main(String[] args) {

		System.out.println("셀 정렬(버전 1)");
		
		int n = 7;
		int[] a = {22,5,11,32,120,68,70};
		
		shellsort( a,n );
		
		for( int i = 0; i < n; i++)
			System.out.println("a[" + i + "] : " + a[i]);
		
		
	}

}
