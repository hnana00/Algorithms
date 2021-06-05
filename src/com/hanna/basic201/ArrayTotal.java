package com.hanna.basic201;
import java.util.Scanner;

public class ArrayTotal {

	/* 배열 a의 모든 요소 합계 구하여
	 * 반환하는 메서드
	 */
	
	static int sumof( int[] a) {
		
		int sum = 0;
		
		for( int i = 0; i < a.length; i++ ) {
			
			sum += a[i];
		}
		
		return sum;
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdin.nextInt();
		
		int[] a = new int[num];
		
		for( int i = 0; i < num; i++ ) {
			
			System.out.println("a [" + i + "] :");
			a[i] = stdin.nextInt();
		}
		
		System.out.println("배열 모든 요소의 합계 : " + sumof(a));
	}
}