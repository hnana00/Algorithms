package com.hanna.basic1;
import java.util.Scanner;


public class MedianOfThreeNumbers {

	/* 3개의 정수값을 입력하고 중앙값 출력 */
	
	static int med3( int a, int b, int c ) {
		
		if( a >= b )
			
			if( b >= c )
				return b;
		
			else if( a <= c )
				return a;
			
			else
				return c;
		
		else if( a > c )
			return a;
		
		else if( b > c )
			return c;
		
		else
			return b;
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다");
		System.out.println("a의 값 :");
		int a = stdin.nextInt();
		System.out.println("b의 값 :");
		int b = stdin.nextInt();
		System.out.println("c의 값 :");
		int c = stdin.nextInt();
		
		System.out.println("중앙값은 " + med3(a,b,c) + "입니다.");
	}
}
