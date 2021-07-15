package com.hanna.basic601;

public class bubblesort4 {

	/*
	 * ����� ���� ����(����Ŀ����,����������)
	 */
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
		static void shakerSort(int[] a, int n) {
			
			int left = 0;
			int right = n - 1;
			int last = right;

			while ( left < right ) {
				
				for ( int j = right; j > left; j-- ) {
					if ( a[j - 1] > a[j] ) {
						swap( a, j - 1, j );
						last = j;
					}
				}
				
				left = last;

				for ( int j = left; j < right; j++ ) {
					if ( a[j] > a[j + 1] ) {
						swap( a, j, j + 1 );
						last = j;
					}
				}
				right = last;
			}
		}
		
	public static void main(String[] args) {
		
		int[] x = {9,1,3,4,6,7,8};
		int n = 7;

		shakerSort(x, n); // �迭 x�� ����� ��������

		System.out.println("������������ �����߽��ϴ�.");
		for (int i = 0; i < n; i++)
			System.out.println("x[" + i + "]��" + x[i]);
		
	}

}
