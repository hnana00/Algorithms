package com.hanna.basic101;
import java.util.Scanner;
//3���� ������ �� �ִ밪 ���ϱ�

public class MaximumValueOfThreeValues {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ����� �ִ밪�� ���մϴ�.");
		
		System.out.println("a�� �� : "); 
		int a = stdIn.nextInt();
		
		System.out.println("b�� �� : "); 
		int b = stdIn.nextInt();
		
		System.out.println("c�� �� : ");
		int c = stdIn.nextInt();
		
		int max = a;
		
		if( b > max )
			max = b;
		
		if( c > max )
			max = c;
		
		System.out.println("�ִ밪��" + max + "�Դϴ�.");
		
	}
}
