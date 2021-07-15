package com.hanna.basic601;

public class BubbleSort1 {

	/*
	 * 버블정렬 자세히 출력(버전 1)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

		// 단순교환정렬
		static void bubblesort(int[] a, int n) {
			int ccnt = 0; // 비교횟수
			int scnt = 0; // 교환횟수

			System.out.println("버블정렬 버전1");
			for ( int i = 0; i < n - 1; i++ ) {
				System.out.printf("패스%d：\n", i + 1);
				
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
			
			System.out.println("비교를 " + ccnt + "회 했습니다.");
			System.out.println("교환를 " + scnt + "회 했습니다.");
		}

		
	public static void main(String[] args) {
		
		int[] x = {6,4,3,7,1,9,8};
		int n = 7;
		
		bubblesort(x,n);

		System.out.println();
		
	}
}
