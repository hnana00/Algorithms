package com.hanna.basic501;
import java.util.Scanner;

public class Factorial {

	// ���丮�� ���� ����������� ���ϱ�
	
	static int factorial(int n) {
		
		int i = 1;
		int sum = 1;
		
		while(i <= n) {
			sum *= i;
			i++;
		}
		return sum;
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		System.out.println("������ �Է� : ");
		int n = stdin.nextInt();
		
		//int sum = factorial(n);
		System.out.println(n + "�� ���丮���� " + factorial(n));

	}

}
