package com.hanna.basic102;
import java.util.Scanner;
// ��ȣ���� *�� �Ƕ�̵带 �����

class Pyramids  {
	
	static void spira(int n) {
		
		for ( int i = 1; i <= n; i++ ) { 					// i�� (i = 1, 2, �� ,n)
			
			for ( int j = 1; j <= n - i + 1; j++ ) 		// n-i+1���� ' '�� ��Ÿ��
				
				System.out.print(' ');
			
			for ( int j = 1; j <= (i - 1) * 2 + 1; j++ ) 	// (i-1)*2+1���� '*'�� ��Ÿ��
				
				System.out.print("*");
			
			System.out.println(); 						// ����(�ٺ�ȯ)
		}
	}

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int n;

		System.out.println("�Ƕ�̵� ������� ��Ÿ���ϴ�.");

		do {
			System.out.print("�ܼ��� ��");
			n = stdIn.nextInt();
		} while (n <= 0);

		spira(n); 		// �Ƕ�̵带 ��Ÿ��
	}
}
