package com.hanna.basic201;
import java.util.Scanner;
import java.util.Random;

public class MaxOfArrayRand {

	/* Ű�� ����� ������ �����ϴ� ���α׷� */
	
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
		
		System.out.println("Ű�� �ִ��� ���մϴ�.");
		
		int num = 5 + rand.nextInt(10);
		System.out.println("��� �� : " + num);
		
		System.out.println("Ű ���� �Ʒ��� �����ϴ�.");
		
		int[] height = new int[num];
		
		for( int i = 0; i < num; i++ ) {
		
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height[" + i + "] : " + height[i]);
			
		}
		System.out.println("�ִ��� " + maxof(height) + "�Դϴ�.");
	}
}