package com.hanna.basic201;
import java.util.Scanner;

public class MaxOfArray {

	/* �迭 ����� �ִ��� ���ϴ� �޼��� */
	
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
		
		System.out.println("Ű�� �ִ밪�� ���մϴ�.");
		System.out.println("��� �� : ");
		int num = stdin.nextInt();
		
		int[] height = new int[num];
		
		for( int i = 0; i < num; i++ ) {
			
			System.out.println("height[" + i + "] : ");
			height[i] = stdin.nextInt();
		}
		
		System.out.println("�ִ��� " + maxof(height) + "�Դϴ�.");
	}
}
