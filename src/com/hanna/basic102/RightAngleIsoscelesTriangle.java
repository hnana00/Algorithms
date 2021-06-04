package com.hanna.basic102;

public class RightAngleIsoscelesTriangle {

	/*
	 * ���� : 1 ���� n ����
	 */
	public void TriangleLB( int n ) {
		
		for( int i = 1; i <= n; i++ ) {
			
			for( int j = 1; j <= i; j++ ) {
				
				System.out.printf("*");
			}
			System.out.println();
		}
	}

	
	/*
	 * ���� : n ���� 1 ����
	 */
	public void TriangleLU( int n ) {
		
		for( int i = n; i >= 1; i-- ) {
			
			for( int j = 1; j >= i;  j++ ) {
			
				System.out.printf("*");
			}
			System.out.println();
		}
	}
 
	/*
	 * ������ : 1���� n ����
	 */
	public void TriangleRB( int n ){
		
		for( int i = 0; i < n; i++ ) {

			for( int x = 0; x < 5-i; x++ ) {
				
				System.out.printf(" ");
			}

			for( int x = 0; x <= i; x++ ) {
				
				System.out.printf("*");
			}
			System.out.println();
		}
	}

	/*
	 * ������ : n���� 1 ����
	 */
	public void TriangleRU(int n){
		
		for( int i = 0; i < n; i++ ) {

			for( int x = 0; x <= i; x++ ) {
				
				System.out.printf(" ");
			}
			
			for( int x = 0; x < n-i; x++ ) {
				
				System.out.printf("*");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {

		RightAngleIsoscelesTriangle me = new RightAngleIsoscelesTriangle();
		
		//me.TriangleLB(5);
		//me.TriangleLU(5);
		me.TriangleRB(5);
		//me.TriangleRU(5);
	
	}
}