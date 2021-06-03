package com.hanna.basic102;

public class SumOfIntegers {

	/* 대소관계 상관없이 a,b사이의 모든 정수 합 구하여
	 * 반환하는 메소드 작성
	 */
	
	static int sumof( int a, int b ) {
		
		int sum = 0;
		
		if( a < b ) {
			
			for( int i = a; i <= b; i++ ) {
				
				sum += i;
			}
		}
		else
			for( int i = b; i <= a; i++ ) {
				
				sum += i;
			}
			return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.printf("sum = " + sumof(3,5)+ "\n");
		System.out.printf("sum = " + sumof(6,4));
	}
}