package com.hanna.basic102;
import java.util.Scanner;

public class Minus {

	/* a,b�� ������ �Է��ϰ�
	 * b-a�� ����ϴ� ���α׷� �ۼ�
	 */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		int a,b;
		
		System.out.println("a�� �� : ");
		 a = stdin.nextInt();
		 
		do {
			
			System.out.println("b�� �� : ");
			b = stdin.nextInt();
			System.out.println("a���� ū ���� �Է��ϼ���!");
		
		}while ( b <= a );
		
		int minus = b - a;
		
		System.out.println("b - a�� " + minus + "�Դϴ�.");
	}
}