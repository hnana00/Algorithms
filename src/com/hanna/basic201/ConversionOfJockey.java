package com.hanna.basic201;
import java.util.Scanner;

public class ConversionOfJockey {

	public static void main(String[] args) {

		CardconvR card = new CardconvR();
		Scanner stdin = new Scanner(System.in);
		
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ�մϴ�.");
		
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = stdin.nextInt();
			}while( no < 0 );
		
			do {
				System.out.println("� ������ ��ȯ�ұ��? (2~36) : ");
				cd = stdin.nextInt();
			}while( cd < 2 || cd > 36 );
			
			dno = card.cardconvR(no,cd,cno);
			
			System.out.println(cd + "�����δ�");
			for( int i = dno -1; i >= 0; i--) {
				
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.println("�� �� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = stdin.nextInt();
		}while(retry == 1);
	}
}