package com.hanna.basic601;

public class bubblesort3 {

	/*
	 * 버블정렬 자세히 출력(버전 3)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void bubblesort3(int[] a, int n) {
		
		int ccnt = 0; // 비교횟수
		int scnt = 0; // 교환횟수

		System.out.println("버블정렬 버전3");
		
		int i = 0;
		int k = 0; // a[k]보다 앞은 이미 정렬됨
		
		while ( k < n - 1 ) {
			
			System.out.printf("패스%d：\n", i++);
			
			int last = n - 1; // 가장 마지막에 교환한 위치
			
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
		
		System.out.println("비교를 " + ccnt + "회 했습니다.");
		System.out.println("교환를 " + scnt + "회 했습니다.");
	}
	
	public static void main(String[] args) {

		int[] x = {1,3,9,4,7,8,6};
		int n = 7;

		bubblesort3(x,n);
	}

}
