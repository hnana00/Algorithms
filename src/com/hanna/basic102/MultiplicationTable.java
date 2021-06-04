package com.hanna.basic102;

public class MultiplicationTable {
	
		//°ö¼ÀÇ¥ Ãâ·Â
	
	public static void main(String[] args) {

		System.out.printf("   |");
			
		for ( int i = 1; i <= 9; i++ ) {
				
			System.out.printf("%3d",i);
				
		}
			
		System.out.println();
		System.out.printf("---+-----------------------------\n");
			
		for( int i = 1; i <= 9; i++ ) {
				
			System.out.printf("%2d |",i);
				
			for( int j = 1; j <= 9; j++ ) {
					
				System.out.printf("%3d",i * j);
			}
				
			System.out.println();
				
		}
	}
}