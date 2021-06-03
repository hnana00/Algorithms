package com.hanna.basic102;
import java.util.Scanner;

public class SumForPos {

	/* 1~n의 합을 구함(양수만 입력) */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		int n;
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.println("n의 값: ");
			n = stdin.nextInt();
		}while ( n <= 0 );
		
		int sum = 0;
		
		for( int i = 1; i <= n; i++ ) {
			
			sum += i;
			
		}
		System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다.");
	}
}