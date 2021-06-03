package com.hanna.basic101;

public class ThreeMinimums {
	
	private int min3( int a, int b, int c ) {

		int min = a;
		
		if( b < min )
			min = b;
		
		if( c < min )
			min = c;
		
		return min;
	}
	
	private int min3 ( int[] list ) {
		
		int min = list[0];
		
		for( int num : list ) {
			
			if( min > num ) { 
				min = num;
			}
		}
		return min; 
	}
	
	public static void main(String[] args) {
		
		ThreeMinimums min = new ThreeMinimums();
		
		System.out.println("01¹ø : " + min.min3(1,2,3)); 
		
		System.out.println("======================");
		System.out.println("======================");
		
		int[] list = { 10, 6, 7, 3, 5, 20, 43 };
		System.out.println("02¹ø : " + min.min3(list)); 
		
	}
}
 