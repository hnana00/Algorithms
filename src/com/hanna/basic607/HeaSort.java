package com.hanna.basic607;

public class HeaSort {

	/*
	 * 힙 정렬
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void downHeap( int[] a , int left, int right ) {
		
		int temp = a[left]; //루트
		int child; //큰 값을 가진 노드
		int parent; //부모
		
		for( parent = left; parent < (right + 1) / 2; parent = child ) {
			int cl = parent * 2 + 1; //왼쪽 자식
			int cr = cl + 1; //오른쪽 자식
			
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl; //큰 값을 가진 노드를 자식에 대입
		
			if( temp >= a[child] )
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}

	static void heaSort( int[] a, int n ) {
		
		
		for( int i = (n -1) / 2; i >= 0; i-- )  //힙으로 만들기
			downHeap( a, i, n - 1 );
		
		for( int i = n - 1; i > 0; i-- ) {
			
			swap( a, 0, i ); //가장 큰 요소와 아직 정렬되지 않은 부분의 마지막요소를 고환
			downHeap( a, 0, i - 1 ); //힙으로 만들기
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