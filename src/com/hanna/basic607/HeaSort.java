package com.hanna.basic607;

public class HeaSort {

	/*
	 * �� ����
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void downHeap( int[] a , int left, int right ) {
		
		int temp = a[left]; //��Ʈ
		int child; //ū ���� ���� ���
		int parent; //�θ�
		
		for( parent = left; parent < (right + 1) / 2; parent = child ) {
			int cl = parent * 2 + 1; //���� �ڽ�
			int cr = cl + 1; //������ �ڽ�
			
			child = (cr <= right && a[cr] > a[cl]) ? cr : cl; //ū ���� ���� ��带 �ڽĿ� ����
		
			if( temp >= a[child] )
				break;
			a[parent] = a[child];
		}
		a[parent] = temp;
	}

	static void heaSort( int[] a, int n ) {
		
		
		for( int i = (n -1) / 2; i >= 0; i-- )  //������ �����
			downHeap( a, i, n - 1 );
		
		for( int i = n - 1; i > 0; i-- ) {
			
			swap( a, 0, i ); //���� ū ��ҿ� ���� ���ĵ��� ���� �κ��� ��������Ҹ� ��ȯ
			downHeap( a, 0, i - 1 ); //������ �����
		}
	}
	
	public static void main(String[] args) {

		System.out.println("������");
		
		int n = 7;
		int[] a = {22,5,11,32,150,68,70};
		
		heaSort( a, n );
		
		System.out.println("������������ �����߽��ϴ�.");
		
		for( int i = 0; i < n; i++ )
			System.out.println("a[" + i + "] = " + a[i]);
	}
}