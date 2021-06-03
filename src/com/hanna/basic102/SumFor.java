package com.hanna.basic102;
import java.util.Scanner;

public class SumFor {

	/* (for) 1~n 까지의 합 구하기 */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = stdin.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			sum += i;
			
		}
		System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다.");
	}
}