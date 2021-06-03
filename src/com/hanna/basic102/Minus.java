package com.hanna.basic102;
import java.util.Scanner;

public class Minus {

	/* a,b에 정수를 입력하고
	 * b-a를 출력하는 프로그램 작성
	 */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("a의 값 : ");
		 a = stdin.nextInt();
		 
		do {
			
			System.out.println("b의 값 : ");
			b = stdin.nextInt();
			System.out.println("a보다 큰 값을 입력하세요!");
		
		}while ( b <= a );
		
		int minus = b - a;
		
		System.out.println("b - a는 " + minus + "입니다.");
	}
}