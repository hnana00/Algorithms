package com.hanna.basic102;
import java.util.Scanner;

public class SumForPos {

	/* 1~n�� ���� ����(����� �Է�) */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		int n;
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.println("n�� ��: ");
			n = stdin.nextInt();
		}while ( n <= 0 );
		
		int sum = 0;
		
		for( int i = 1; i <= n; i++ ) {
			
			sum += i;
			
		}
		System.out.println("1����" + n + "������ ���� " + sum + "�Դϴ�.");
	}
}