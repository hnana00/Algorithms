package com.hanna.basic601;

public class BubbleSort1 {

	/*
	 * �������� �ڼ��� ���(���� 1)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

		// �ܼ���ȯ����
		static void bubblesort(int[] a, int n) {
			int ccnt = 0; // ��Ƚ��
			int scnt = 0; // ��ȯȽ��

			System.out.println("�������� ����1");
			for ( int i = 0; i < n - 1; i++ ) {
				System.out.printf("�н�%d��\n", i + 1);
				
				for ( int j = n - 1; j > i; j-- ) {
					for ( int m = 0; m < n - 1; m++ )
						System.out.printf("%3d %c", a[m], (m != j - 1) ? ' ' : (a[j - 1] > a[j]) ? '+' : '-');
					System.out.printf("%3d\n", a[n - 1]);

					ccnt++;
					if ( a[j - 1] > a[j] ) {
						scnt++;
						swap( a, j - 1, j );
					}
				}
				for ( int m = 0; m < n; m++ )
					System.out.printf("%3d  ", a[m]);
				System.out.println();
			}
			
			System.out.println("�񱳸� " + ccnt + "ȸ �߽��ϴ�.");
			System.out.println("��ȯ�� " + scnt + "ȸ �߽��ϴ�.");
		}

		
	public static void main(String[] args) {
		
		int[] x = {6,4,3,7,1,9,8};
		int n = 7;
		
		bubblesort(x,n);

		System.out.println();
		
	}
}
