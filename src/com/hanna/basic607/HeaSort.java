package com.hanna.basic607;

public class HeaSort {

	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void downHeap( int[] a , int left, int right ) {
		
		int temp = a[left];
		int child;
		int parent;
		
		for( parent = left; parent < (right + 1) / 2; parent = child ) {
			int cl = parent * 2 + 1;
			int cr = cl + 1;
			
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl;
			
			if( temp >= a[child] )
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}

	static void heaSort( int[] a, int n ) {
		
		for( int i = (n -1) / 2; i >= 0; i-- )
			downHeap( a, i, n - 1 );
		
		for( int i = n - 1; i > 0; i-- ) {
			
			swap( a, 0, i );
			downHeap( a, 0, i - 1 );
		}
	}
	
	public static void main(String[] args) {

		System.out.println("힙정렬");
		
		int n = 7;
		int[] a = {22,5,11,32,150,68,70};
		
		heaSort( a, n );
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for( int i = 0; i < n; i++ )
			System.out.println("a[" + i + "] = " + a[i]);
	}
}