package com.hanna.basic101;
import java.util.Scanner;

public class DetermineConditionsAndBranch {
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ���. : ");
		int n = stdin.nextInt();
		
		if( n > 0 )
			System.out.println("�� ���� ����Դϴ�.");
		
		else if( n < 0 )
			System.out.println("�� ���� ���� �Դϴ�.");
		
		else
			System.out.println("�� ���� 0�Դϴ�.");
	}
}
	