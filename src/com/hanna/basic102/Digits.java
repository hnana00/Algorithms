package com.hanna.basic102;
import java.util.Scanner;

public class Digits {

	/*������ �Է��ϰ� 
	 * �ڸ����� ����ϴ� ���α׷� �ۼ�
	 */
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("�ڸ����� ���� ���� ������ �Է��ϼ���.");
		
		int a;
		
		do {
			System.out.println("a : ");
			a = stdin.nextInt();
			
		}while ( a <= 0 );
		
		int num = 0;
		
		while ( a > 0 ) {
			a /= 10;
			num++;
		}

		System.out.println("�� �ڸ����� " + num + "�ڸ� �Դϴ�.");
		    }
}