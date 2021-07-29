package com.hanna.basic605;

public class QuickSort {

	/*
	 * 퀵 정렬(재귀)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	//피벗 선택 1방법 = 임의로 요소 3개 선택 후 중앙값을 구하여 반환
	static int med3( int a, int b, int c ) {
		
			if ( a >= b )
				if ( b >= c )
					return b;
		
				else if ( a <= c )
					return a;
		 
				else
					return c;
		
			else if ( a > c )
				return a;
		
			else if ( b > c )
				return c;
		
			else
				return b;
		}
	
	// 피벗 선택 2방법 = x[a], x[b], x[c]를 sort (중앙값의 index를 반환)
		static int sort3Elem( int[] x, int a, int b, int c ) {
			
			if ( x[b] < x[a] )
				swap( x, b, a );
			
			if ( x[c] < x[b] )
				swap( x, c, b );
			
			if ( x[b] < x[a] )
				swap( x, b, a );
			
			return b;
		}
		
	//재귀
	static void quicksort( int[] a, int left, int right ) {

		int pl = left;
		int pr = right;
		int x = a[(pl + pr) / 2];
		
		/* 
		 	--- 피벗 선택 2방법 ---
		    int m = sort3Elem( a, pl, (pl + pr) / 2, pr );
			x = a[m]; //피벗
			swap(a, m, right - 1); //가운데 요소와 끝에서 두 번째  요소를 교환
			pl++;  //왼쪽 시작위치
			pr--;  //오른쪽 시작위치
		*/

		System.out.printf("a[%d]~[%d] : {",left,right);
		
		for( int i = left; i < right; i++ )
			System.out.printf("%d , ",a[i]);
		
		System.out.printf("%d}\n",a[right]);
		
		do {
			while( a[pl] < x )
				pl++;
			
			while( a[pr] > x )
				pr--;
			
			if( pl <= pr )
				swap( a, pl++, pr-- );
			
		} while( pl <= pr );
		
		//요소 개수가 적은 그룹 먼저 나누는 메서드
		if ( pr - left < right - pl ) {
			
			int temp;
			
			temp = left;
			left = pl;
			pl = temp;
			
			temp = right;
			right = pr;
			pr = temp;
		}

		if( left < pr ) {
			quicksort( a, left, pr );
		}
		
		if( pl < right ) {
			quicksort( a, pl, right );
		}
	}
	
	// 퀵정렬(n … 요솟수)
	static void quicksort( int[] a, int n ) {
			
		quicksort(a, 0, n - 1);
		}
	
	public static void main(String[] args) {

		System.out.println("퀵 정렬");
		
		int[] a = {5,8,4,2,6};
		int n = 5;
		
		quicksort( a, n );
		
		for( int i = 0; i < n; i++ )
			System.out.println("a[" + i + "] = " + a[i]);
	}

}
