package com.hanna.basic303;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

	/* 
	 *  Arrays.binarySearch로 이진검색
	 */
	
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
		
		int na = Arrays.binarySearch(a,key);
		
		if( na < 0 ) {
			
			//검색 실패
			int p = -na-1;
			System.out.println("그 값의 요소가 없습니다.");
			System.out.println("삽입 포인트는 : " + p + " 반환값은 : " +na);
			
			
			//검색 성공 
		}else
			System.out.println(key + "은(는) x[" + na + "]에 있습니다.");
	}
}
