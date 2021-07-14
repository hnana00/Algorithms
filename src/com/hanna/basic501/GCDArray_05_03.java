package com.hanna.basic501;

import java.util.Scanner;

//�迭�� ��� ����� �ִ� ������� ���մϴ�.

class GCDArray_05_03 {
	// ���� x, y�� �ִ� ������� ����������� ���Ͽ� ��ȯ
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

	// ��ڼ� n�� �迭 a�� ��� ����� �ִ� ������� ���մϴ�.
	static int gcdArray(int a[], int start, int size) {
		
		System.out.println( "a      : " + a );
		System.out.println( "start  : " + start );
		System.out.println( "size   : " + size );
		System.out.println("=================");
		System.out.println();
		
		if (size == 1) {
			// System.out.println("����");
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
		 
		int[] x = {1, 2, 3, 4, 5}; // ���� num�� �迭
		System.out.println("�ִ� ������� " + gcdArray(x, 0, 5) + "�Դϴ�.");
	}
}
