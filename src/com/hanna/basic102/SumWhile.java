package com.hanna.basic102;
import java.util.Scanner;

public class SumWhile {

	/* (while) 1~n 까지의 합 구하기
	 * 종료될 때 i값이 n+1이 됨을 확인하고 1값 출력
	 */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.println("n의 값 : ");
		int n = stdin.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while( i <= n ) {
			
			System.out.println("i++전 i = " + i );
			sum += i;
			i++;
			System.out.println("i++후 i = " + i );
			System.out.println("-----------");
		}
		System.out.println("1부터" + n + "까지의 합은 " + sum + "입니다.");
	}
}