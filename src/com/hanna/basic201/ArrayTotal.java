package com.hanna.basic201;
import java.util.Scanner;

public class ArrayTotal {

	/* �迭 a�� ��� ��� �հ� ���Ͽ�
	 * ��ȯ�ϴ� �޼���
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
		
		System.out.println("��ڼ� : ");
		int num = stdin.nextInt();
		
		int[] a = new int[num];
		
		for( int i = 0; i < num; i++ ) {
			
			System.out.println("a [" + i + "] :");
			a[i] = stdin.nextInt();
		}
		
		System.out.println("�迭 ��� ����� �հ� : " + sumof(a));
	}
}