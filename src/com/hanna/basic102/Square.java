package com.hanna.basic102;
import java.util.Scanner;

public class Square {

	/* �Է��� ���� �� ������ �ϴ�
	 * ���簢���� *��ȣ�� ����ϴ� ���α׷� �ۼ�
	 */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("�簢���� ����մϴ�.");
		System.out.println("�� �� : ");
		int a = stdin.nextInt();
		
		for( int i = 1; i <= a; i++ ) {
			
			for( int j = 1; j <= a; j++ ) {
				
				System.out.printf("*");
			}
			
			System.out.println();
			
		}
	}
}