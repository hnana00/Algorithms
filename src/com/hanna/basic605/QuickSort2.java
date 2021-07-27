package com.hanna.basic605;
import java.util.Scanner;

public class QuickSort2 {

	/*
	 * 퀵 정렬(비재귀)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void quickSort( int[] a, int left, int right ) {
		
		IntStack lstack = new IntStack( right - left + 1 );
		IntStack rstack = new IntStack( right - left + 1 );
		
		lstack.push(left);
		rstack.push(right);
		
		
		while( lstack.isEmpty() != true ) {
			
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left + right) / 2];
			
			do {
				while( a[pl] < x )
					pl++;
				
				while( a[pr] > x )
					pr--;
				
				if( pl <= pr )
					swap( a, pl++, pr-- );
				
			} while( pl <= pr );
			
			if( left < pr ) {
				
				lstack.push(left);
				rstack.push(pr);
				
			}
			
			if( pl < right ) {
				
				lstack.push(pl);
				rstack.push(right);
			}
		}
	}
	
	public static void main(String[] args) {

		System.out.println("퀵 정렬(비재귀 버전)");
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int n = stdin.nextInt();
		
		int[] a = new int[n];
		
		for( int i = 0; i < n; i++ ) {
			
			System.out.println("a [" + i + "] :");
			a[i] = stdin.nextInt();
		}
		
		quickSort( a, 0, n-1 );
		
		System.out.println("오름차순으로 정렬했습니다.");
		
		for( int i = 0; i < n; i++ )
			System.out.println("a[" + i + "]" + a[i]);
	}
}

