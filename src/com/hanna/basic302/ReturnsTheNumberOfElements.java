package com.hanna.basic302;
import java.util.Scanner;

class ReturnsTheNumberOfElements {

	/* 요솟수가 n개인 배열 a에서 key와 일치하는 요소의
	 * 인덱스를 idx의 앞부터 순서대로 저장하고
	 * 일치한 요솟수를 반환하는 메서드 작성
	 */
	
	static int searchIdx( int[] a, int n, int key, int[] idx ) {

		int hhh = 0;
		
		for( int i = 0; i < n; i++ ) {
			
			if(a[i] == key) 
				idx[hhh++] = i;
		}
		
		return hhh;
	}
	
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int n = stdin.nextInt();
		
		//요솟수가 n인 배열
		int[] a = new int[n];
		int[] idx = new int[n];
		
		for( int i =0; i < n; i++ ) {
			
			System.out.println("a[" + i + "] :");
			a[i] = stdin.nextInt();
		}
		
		//찾을 값 입력
		System.out.println("찾을값 : ");
		int key = stdin.nextInt();
		
		int hhh = searchIdx(a,n,key,idx);
		
		if(hhh == 0 )
			System.out.println("그 값의 요소가 없습니다.");
		
		else
			for( int i = 0; i < hhh; i++ )
				System.out.println("그 값은 " + "a[" + idx[i] + "]에 있습니다.");
	}
}
