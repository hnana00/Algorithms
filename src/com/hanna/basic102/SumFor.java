package com.hanna.basic102;
import java.util.Scanner;

public class SumFor {

	/* (for) 1~n ������ �� ���ϱ� */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� �� : ");
		int n = stdin.nextInt();
		
		int sum = 0;
		
		for(int i = 1; i <= n; i++) {
			
			sum += i;
			
		}
		System.out.println("1����" + n + "������ ���� " + sum + "�Դϴ�.");
	}
}