package com.hanna.basic102;
import java.util.Scanner;

public class SumWhile {

	/* (while) 1~n ������ �� ���ϱ�
	 * ����� �� i���� n+1�� ���� Ȯ���ϰ� 1�� ���
	 */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.println("n�� �� : ");
		int n = stdin.nextInt();
		
		int sum = 0;
		int i = 1;
		
		while( i <= n ) {
			
			System.out.println("i++�� i = " + i );
			sum += i;
			i++;
			System.out.println("i++�� i = " + i );
			System.out.println("-----------");
		}
		System.out.println("1����" + n + "������ ���� " + sum + "�Դϴ�.");
	}
}