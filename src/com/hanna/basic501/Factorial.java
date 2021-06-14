package com.hanna.basic501;
import java.util.Scanner;

public class Factorial {

	// 팩토리얼 값을 비재귀적으로 구하기
	
	static int factorial(int n) {
		
		int i = 1;
		int sum = 1;
		
		while(i <= n) {
			sum *= i;
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		System.out.println("정수를 입력 : ");
		int n = stdin.nextInt();
		
		//int sum = factorial(n);
		System.out.println(n + "의 팩토리얼은 " + factorial(n));

	}

}
