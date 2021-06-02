package com.hanna.basic1;


public class MaximumValueOfFourValues {

	/*
	 *  4개의 정수값 중 최대값 출력
	 */
	private int max4(int a, int b, int c, int d) {
		
		int max = a;
		
		if( b > max )
			max = b;
		
		if( c > max )
			max = c;
		
		if( d > max )
			max = d;
		
		return max;
	}
	
	public static void main(String[] args) {
		
		MaximumValueOfFourValues val = new MaximumValueOfFourValues();
		
		System.out.println("max4(4,3,2,1) = " + val.max4(4,3,2,1));
		System.out.println("max4(1,2,3,4) = " + val.max4(1,2,3,4));
		System.out.println("max4(3,7,3,2) = " + val.max4(3,7,3,2));
		System.out.println("max4(8,1,2,5) = " + val.max4(8,1,2,5));
		System.out.println("max4(1,4,9,6) = " + val.max4(1,4,9,6));
	}
}