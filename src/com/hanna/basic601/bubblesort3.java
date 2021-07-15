package com.hanna.basic601;

public class bubblesort3 {

	/*
	 * �������� �ڼ��� ���(���� 3)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubblesort3(int[] a, int n) {
		
		int ccnt = 0; // ��Ƚ��
		int scnt = 0; // ��ȯȽ��

		System.out.println("�������� ����3");
		
		int i = 0;
		int k = 0; // a[k]���� ���� �̹� ���ĵ�
		
		while ( k < n - 1 ) {
			
			System.out.printf("�н�%d��\n", i++);
			
			int last = n - 1; // ���� �������� ��ȯ�� ��ġ
			
			for ( int j = n - 1; j > k; j-- ) {
				for ( int m = 0; m < n - 1; m++ )
					System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
				System.out.printf("%3d\n", a[n - 1]);
			
				ccnt++;
				
				if ( a[j - 1] > a[j] ) {
					
					swap( a, j - 1, j );
					last = j;
					scnt++;
				}
			}
			
			k = last;
		}
		
		System.out.println("�񱳸� " + ccnt + "ȸ �߽��ϴ�.");
		System.out.println("��ȯ�� " + scnt + "ȸ �߽��ϴ�.");
	}
	
	public static void main(String[] args) {

		int[] x = {1,3,9,4,7,8,6};
		int n = 7;

		bubblesort3(x,n);
	}

}
