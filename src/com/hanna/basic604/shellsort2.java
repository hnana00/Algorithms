package com.hanna.basic604;

public class shellsort2 {

	static void shellsort( int[] a, int n ) {
		
		int h;
		int count = 0; //�̵�Ƚ��
		
		for( h = 1; h < n /9; h = h * 3 + 1 ) 
			;
		
		for( ; h > 0; h /= 3 ) {
			for( int i = h; i < n; i++ ) {
			
				int j;
				int tmp = a[i];
				
				for( j = i - h; j >= 0 && a[j] > tmp; j -= h ) {
					a[j + h] = a[j];
					count++;
				}
				a[j + h] = tmp;
				count++;
			}
		}
		System.out.println("����� �ű�Ƚ���� " + count + "ȸ�Դϴ�.");
	}
	
	public static void main(String[] args) {

		System.out.println("�� ����(���� 2)");
		
		int n = 7;
		int[] a = {22,5,11,32,120,68,70};
		
		shellsort( a,n );
		
		for( int i = 0; i < n; i++ )
			System.out.println("a[" + i + "] : " + a[i]);
		
	}
}
