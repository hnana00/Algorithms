package com.hanna.basic201;
import java.util.Scanner;

public class ReverseArray {

	/*
	 * 배열 요소에 값을 역순으로 정렬
	 */
	
	static void swap( int[] list, int idx1, int idx2 ) {
		
		int t = list[idx1];
		list[idx1] = list[idx2];
		list[idx2] = t;
		
	}
	
	static void reverse( int[] list ) {
		
		for( int i = 0; i < list.length / 2; i++ ) {
			
			swap( list, i, list.length -i -1 );
		}
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdin.nextInt();
		
		int[] list = new int[num];
		
		// 배열에 숫자를 입력 받는다.
		for( int i = 0; i < num; i++ ) {
			
			System.out.println("x[" + i + "] : ");
			list[i] = stdin.nextInt();
		}
		
		// 거꾸로 정렬 해주세요
		reverse(list);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		
		for( int i = 0; i < num; i++ ) {
			
			System.out.println("x[" + i + "] : " + list[i]);
			
		}
	}
}
