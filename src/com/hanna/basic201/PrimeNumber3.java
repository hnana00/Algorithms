package com.hanna.basic201;

public class PrimeNumber3 {

	public static void main(String[] args) {
		
		// 곱셈과 나눗셈의 횟수
		int counter = 0; 
		
		// 찾은 소수의 개수
		int ptr = 0;
		
		// 소수를 저장하는 배열
		int[] prime = new int[500];
		
		// 2는 소수라서
		prime[ptr++] = 2;
		
		// 3는 소수라서
		prime[ptr++] = 3;
		 
		for( int n = 5; n <= 1000; n += 2) {
			
			// 소수가 아닐 때 flag = false 이다.
			boolean flag = false;
			
			for( int i = 1; prime[i] * prime[i] <= n; i++ ) {
				
				 counter += 2;
				
				// 나누어 떨어지면 소수가 아니다. 더 이상 반복은 불필요
				if( n % prime[i] == 0 ) {
					// 소수가 아닐 때 flag = true 이다.
					flag = true;
					break;
				}
			}
			
			// 마지막 까지 나누어 떨어지지 않음. 
			// 소수라고 배열에 저장.
			if( !flag ) {
				
				// 소수 애들 처리
				prime[ptr++] = n;
				counter++;
			}
		}
		
		// 소수를 찍는다.
		for( int i=0; i < ptr; i++ ) {
			System.out.println( prime[i] );
		}
	}
}
