package com.hanna.basic201;
import java.util.Scanner;
import java.util.Random;

public class MaxOfArrayRand {

	/* 키와 사람수 난수로 생성하는 프로그램 */
	
	static int maxof( int[] a ) {
		
		int max = a[0];
		
		for( int i = 1; i < a.length; i++ ) {
			
			if( a[i] > max )
				max = a[i];
		}
		return max;
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");
		
		int num = 5 + rand.nextInt(10);
		System.out.println("사람 수 : " + num);
		
		System.out.println("키 값은 아래와 같습니다.");
		
		int[] height = new int[num];
		
		for( int i = 0; i < num; i++ ) {
		
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
			
		}
		System.out.println("최댓값은 " + maxof(height) + "입니다.");
	}
}