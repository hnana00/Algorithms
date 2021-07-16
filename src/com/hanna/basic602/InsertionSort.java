package com.hanna.basic602;

public class InsertionSort {

	/*
	 * �ܼ� ���� ����(�ڼ��� ���)
	 */
	static void insertionsort( int[] a, int n ) {
		
		for( int i = 1; i < n; i++ ) {
			
			int temp = a[i];	// ������ ��� �� �����س���,
			int j;
			
			// �ݺ�����
			// 1) ���ĵ� ���� ���� ���ʳ��� �����ϰų�(j=0)
			// 2) ��Һ��� �۰ų� ���� ���� ���� ��Ҹ� �߰��� �� ����
			
			for( j = i; j > 0 && a[j - 1] > temp; j-- ) {
				a[j] = a[j - 1];	// ���ʰ� -> �����ʰ����� ����
			}
			a[j] = temp;
		}
	}
	
	public static void main(String[] args) {

		System.out.println("�ܼ� ���� ����");
		
		int n = 7;
		int [] a = { 7,22,5,11,32,120,68,70 };
		
		insertionsort( a, n );
		
		System.out.println("������������ �����߽��ϴ�.");
		
		for( int i = 0; i < n; i++ )
			System.out.println( "a[" + i + "] = " + a[i] );
	}

}
