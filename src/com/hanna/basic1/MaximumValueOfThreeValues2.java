package com.hanna.basic1;

/**
 * 3���� ������ �� �ִ밪 ���
 */

public class MaximumValueOfThreeValues2 {
	
    /*
     * a,b,c�� �ִ밪�� ���Ͽ� ��ȯ
     */
	static int max3( int a, int b, int c ) {
		
		int max = a;
		
		if( b > max )
			max = b;
		
		if( c > max )
			max = c;
		
		return max;
	}
	
	public static void main(String[] args) {
		System.out.println("max3(3,2,1) = " + max3(3,2,1));
		System.out.println("max3(3,2,2) = " + max3(3,2,2));
		System.out.println("max3(3,1,2) = " + max3(3,1,2));
		System.out.println("max3(3,2,3) = " + max3(3,2,3));
		System.out.println("max3(2,1,3) = " + max3(2,1,3));
		System.out.println("max3(3,3,2) = " + max3(3,3,2));
		System.out.println("max3(3,3,3) = " + max3(3,3,3));
		System.out.println("max3(2,2,3) = " + max3(2,2,3));
		System.out.println("max3(2,3,2) = " + max3(2,3,2));
		System.out.println("max3(1,3,2) = " + max3(1,3,2));
		System.out.println("max3(2,3,3) = " + max3(2,3,3));
		System.out.println("max3(1,2,3) = " + max3(1,2,3));
	}
}
