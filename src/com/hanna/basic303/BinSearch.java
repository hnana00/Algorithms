package com.hanna.basic303;
import java.util.Scanner;

public class BinSearch {

	static int binSearch( int[] a, int n, int key ) {
		
		//맨앞,맨뒷
		
		int s = 0; 
		int e = n - 1;
		
		do {
			//중앙
			int m = (s + e) / 2;
			
			if( a[m] == key )
				return m;
			
			else if( a[m] < key )
				s = m + 1;
			
			else
				e = m - 1;
		}while ( s <= e );
		
		return -1;
	}
	
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int n = stdin.nextInt();
		int[] a = new int[n];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("a[0] : ");
		a[0] = stdin.nextInt();
		
		for( int i = 1; i < n; i++ ) {
			
			do {
				
				System.out.println("x[" + i + "] :");
				a[i] = stdin.nextInt();
				
			}while ( a[i] < a[i-1] );
		}
		
		System.out.println("검색할 값 : ");
		int key = stdin.nextInt();
		
		int na = binSearch(a,n,key);
		
		if( na == -1 )
			System.out.println("그 값의 요소가 없습니다.");
		
		else
			System.out.println(key + "은(는) x[" + na + "]에 있습니다.");
	}
}
