package com.hanna.basic201;

import java.util.Scanner;

public class ReverseOrder {

	/* 배열 b의 모든 요소를 역순으로 배열 a에 복사 */
	
	static void rcopy( int[] a, int[] b ) {
		
		int num = a.length <= b.length ? a.length : b.length;
		
		for( int i = 0; i < num; i++ )
			a[i] = b[num-i-1];
	}
	public static void main(String[] args) {

Scanner stdin = new Scanner(System.in);
		
		System.out.println("a의 요솟 값 : ");
		int z = stdin.nextInt();
		
		int[] a = new int[z];
		
		for( int i = 0; i < z; i++ ) {
			
			System.out.println("a[" + i + "] : ");
			a[i] = stdin.nextInt();
		}
		
		System.out.println("b의 요솟 값 : ");
		int x = stdin.nextInt();
		
		int[] b = new int[x];
		
		for( int i = 0; i < x; i++ ) {
			
			System.out.println("b[" + i + "] : ");
			b[i] = stdin.nextInt();
		}
		
		rcopy(a,b);
		
		System.out.println("배열 b의 모든 요소를 배열 a에 복사했습니다.");
		
		for( int i = 0; i < z; i++ )
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
