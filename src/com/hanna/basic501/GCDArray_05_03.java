package com.hanna.basic501;

import java.util.Scanner;

//배열의 모든 요소의 최대 공약수를 구합니다.

class GCDArray_05_03 {
	// 정수 x, y의 최대 공약수를 비재귀적으로 구하여 반환
	static int gcd(int x, int y) {
		System.out.println("------------- " + x +" / " + y);
		System.out.println();
		
		while (y != 0) {
			int temp = y;
			y = x % y;
			x = temp;
		}
		System.out.println("=============== " + x +" / " + y);
		System.out.println();
		return (x);
	}

	// 요솟수 n인 배열 a의 모든 요소의 최대 공약수를 구합니다.
	static int gcdArray(int a[], int start, int size) {
		
		System.out.println( "a      : " + a );
		System.out.println( "start  : " + start );
		System.out.println( "size   : " + size );
		System.out.println("=================");
		System.out.println();
		
		if (size == 1) {
			// System.out.println("설마");
			return a[start];
		}
			
		else if (size == 2) {
			System.out.println("else if>>>>");
			return gcd(a[start], a[start + 1]);
		}
			
		else {
			return gcd(a[start], gcdArray(a, start + 1, size - 1));
		}
	
	}

	
	
	
	
	public static void main(String[] args) {
		 
		int[] x = {1, 2, 3, 4, 5}; // 길이 num인 배열
		System.out.println("최대 공약수는 " + gcdArray(x, 0, 5) + "입니다.");
	}
}
