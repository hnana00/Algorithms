package com.hanna.basic501;
import java.util.Scanner;

public class EuclidGCD2 {

	/*
	 * 재귀 메서드 호출없이 최대공약수 구하기
	 */
	
	static int gcd(int x, int y) {

		while(y != 0) {
			
			int n = x%y;
			x = y;
			y = n;
		}
			return x;
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("두 정수의 최대공약수를 구합니다.");
		
		System.out.print("정수를 입력하세요 : ");
		int x = stdin.nextInt();
		
		System.out.print("정수를 입력하세요 : ");
		int y = stdin.nextInt();
		
		System.out.println("최대 공약수는" + gcd(x,y) + "입니다");
	}
}
