package com.hanna.basic501;
import java.util.Scanner;

public class EuclidGCD2 {

	/*
	 * ��� �޼��� ȣ����� �ִ����� ���ϱ�
	 */
	
	static int gcd(int x, int y) {

		while(y != 0) {
			
			int n = x%y;
			x = y;
			y = n;
		}
			return x;
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ������� ���մϴ�.");
		
		System.out.print("������ �Է��ϼ��� : ");
		int x = stdin.nextInt();
		
		System.out.print("������ �Է��ϼ��� : ");
		int y = stdin.nextInt();
		
		System.out.println("�ִ� �������" + gcd(x,y) + "�Դϴ�");
	}
}
