package com.hanna.basic201;
import java.util.Scanner;

public class MaxOfArray {

	/* 배열 요소의 최댓값을 구하는 메서드 */
	
	static int maxof( int [] a ) {
		
		int max = a[0];
		
		for( int i = 1; i < a.length; i++ ) {
			
			if( a[i] > max )
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("키의 최대값을 구합니다.");
		System.out.println("사람 수 : ");
		int num = stdin.nextInt();
		
		int[] height = new int[num];
		
		for( int i = 0; i < num; i++ ) {
			
			System.out.println("height[" + i + "] : ");
			height[i] = stdin.nextInt();
		}
		
		System.out.println("최댓값은 " + maxof(height) + "입니다.");
	}
}
