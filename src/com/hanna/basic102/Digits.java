package com.hanna.basic102;
import java.util.Scanner;

public class Digits {

	/*정수를 입력하고 
	 * 자릿수를 출력하는 프로그램 작성
	 */
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("자릿수를 구할 양의 정수를 입력하세요.");
		
		int a;
		
		do {
			System.out.println("a : ");
			a = stdin.nextInt();
			
		}while ( a <= 0 );
		
		int num = 0;
		
		while ( a > 0 ) {
			a /= 10;
			num++;
		}

		System.out.println("그 자릿수는 " + num + "자리 입니다.");
		    }
}