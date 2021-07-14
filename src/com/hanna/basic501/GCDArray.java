package com.hanna.basic501;
import java.util.Scanner;

public class GCDArray {

	// 정수 x, y의 최대 공약수를 비재귀적으로 구하여 반환
	static int gcd(int x, int y) {
	
		while (y != 0) {
		
			int temp = y;
			y = x % y;
			x = temp;
		}
		return (x);
	}
	
	// 요솟수 n인 배열 a의 모든 요소의 최대 공약수를 구합니다.
	static int gcdArray(int a[], int start, int no) {
	
		if (no == 1)
			return a[start];
		
		else if (no == 2)
			return gcd(a[start], a[start + 1]);
		
		else
			return gcd(a[start], gcdArray(a, start + 1, no - 1));   //또잉?????
	}

	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 몇 개의 최대 공약수를 구할까요?：");
		
		int num;
		num = stdIn.nextInt();
		// 길이 num인 배열
		int[] x = new int[num];
		
		for (int i = 0; i < num; i++) {
			
			System.out.print("x[" + i + "]：");
			x[i] = stdIn.nextInt();
			
		}
		System.out.println("최대 공약수는 " + gcdArray(x, 0, num) + "입니다.");
	}
}
