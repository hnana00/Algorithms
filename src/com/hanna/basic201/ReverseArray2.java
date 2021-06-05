package com.hanna.basic201;

public class ReverseArray2 {

	static void swap( int[] list, int idx1, int idx2 ) {
		
		int t = list[idx1];
		list[idx1] = list[idx2];
		list[idx2] = t;
		
	}
	
	static void reverse( int[] list ) {
		
		// 리스트 와 리스트 위치를 swap에게 보내준다
		for( int i = 0; i < list.length / 2; i++ ) {
			
			// 교환하기 전 안내문
			int test = list.length -i -1;
			System.out.println("a[" + i + "]과(와) a[" + test + "]를 교환합니다.");
			
			// 교환
			swap( list, i, list.length -i -1 );
			
			// 교환 후 안내문
			for( int j = 0; j < list.length; j++)
				System.out.printf("%d ",list[j]);
			
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {

		// 입력을 받는다
		int[] a = {5,10,73,2,-5,42};
		
		for( int i = 0; i < a.length; i++ ) {
			
			System.out.printf("%d ",a[i]);
			
		}
		
		System.out.println("\n------------------");
		// 메소드 호출
		reverse(a);
	}
}
