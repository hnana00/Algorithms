package com.hanna.basic102;

public class SumOfIntegers {

	/* ��Ұ��� ������� a,b������ ��� ���� �� ���Ͽ�
	 * ��ȯ�ϴ� �޼ҵ� �ۼ�
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