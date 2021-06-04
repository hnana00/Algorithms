package com.hanna.basic102;
import java.util.Scanner;

public class Square {

	/* 입력한 수를 한 변으로 하는
	 * 정사각형을 *기호로 출력하는 프로그램 작성
	 */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("사각형을 출력합니다.");
		System.out.println("단 수 : ");
		int a = stdin.nextInt();
		
		for( int i = 1; i <= a; i++ ) {
			
			for( int j = 1; j <= a; j++ ) {
				
				System.out.printf("*");
			}
			
			System.out.println();
			
		}
	}
}