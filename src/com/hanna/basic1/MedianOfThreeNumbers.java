package com.hanna.basic1;
import java.util.Scanner;


public class MedianOfThreeNumbers {

	/* 3���� �������� �Է��ϰ� �߾Ӱ� ��� */
	
	static int med3( int a, int b, int c ) {
		
		if( a >= b )
			
			if( b >= c )
				return b;
		
			else if( a <= c )
				return a;
			
			else
				return c;
		
		else if( a > c )
			return a;
		
		else if( b > c )
			return c;
		
		else
			return b;
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�");
		System.out.println("a�� �� :");
		int a = stdin.nextInt();
		System.out.println("b�� �� :");
		int b = stdin.nextInt();
		System.out.println("c�� �� :");
		int c = stdin.nextInt();
		
		System.out.println("�߾Ӱ��� " + med3(a,b,c) + "�Դϴ�.");
	}
}
