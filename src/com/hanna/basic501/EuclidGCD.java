package com.hanna.basic501;
import java.util.Scanner;

class EuclidGCD {

	/*
	 * ��Ŭ���� ȣ�������� �ִ����� ���ϱ�(���)
	 */
	
	static int gcd(int x, int y) {

		if (y == 0)
			return x;

		else
			return gcd(y, x % y);

	}

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		System.out.println("�� ������ �ִ������� ���մϴ�.");
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = stdin.nextInt();
		
		System.out.print("������ �Է��ϼ��� : ");
		int y = stdin.nextInt();
		
		System.out.println("�ִ�������" + gcd(x,y) + "�Դϴ�.");
	}

}
