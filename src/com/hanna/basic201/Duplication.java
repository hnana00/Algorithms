package com.hanna.basic201;
import java.util.Scanner;

public class Duplication {
	
	/* �迭 b�� ��� ��Ҹ� �迭 a�� ���� */

	static void copy( int[] a, int[] b ) {
		
		int num = a.length <= b.length ? a.length : b.length;

		for( int i = 0; i < num; i++ )
			a[i] = b [i];
	}

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("a�� ��� �� : ");
		int z = stdin.nextInt();
		
		int[] a = new int[z];
		
		for( int i = 0; i < z; i++ ) {
			
			System.out.println("a[" + i + "] : ");
			a[i] = stdin.nextInt();
		}
		
		System.out.println("b�� ��� �� : ");
		int x = stdin.nextInt();
		
		int[] b = new int[x];
		
		for( int i = 0; i < x; i++ ) {
			
			System.out.println("b[" + i + "] : ");
			b[i] = stdin.nextInt();
		}
		
		copy(a,b);
		
		System.out.println("�迭 b�� ��� ��Ҹ� �迭 a�� �����߽��ϴ�.");
		
		for( int i = 0; i < z; i++ )
			System.out.println("a[" + i + "] = " + a[i]);
		
	}
}
