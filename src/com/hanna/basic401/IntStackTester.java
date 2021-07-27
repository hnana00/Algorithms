package com.hanna.basic401;
import java.util.Scanner;

import com.hanna.basic605.IntStack;


public class IntStackTester {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		
		while( true ) {
			
			//size=���ÿ� �׿� �ִ� �����ͼ� ��ȯ , capacity=������ �뷮�� ��ȯ
			System.out.println("���� ������ �� : " + s.size() + "/" + s.capacity());
			
			System.out.print("(1)Ǫ��  (2)��  (3)��ũ (4)���� (0)���� (5)ã�� (6)���"
					+ "(7)���Ȯ�� (8)������Ȯ��");
			int menu = stdin.nextInt();
			
			//����
			if( menu == 0 )
				break;
			
			int x = 0;
			switch ( menu) {
			
			/* menu = 1�̸� Ǫ��
			   ������ �뷮 ���� ���̼��� ������ ���� */
			case 1: 
				System.out.print("������ : ");
				x = stdin.nextInt();
				
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("������ ���� á���ϴ�.");
				}
				break;
		
			/* menu = 2�̸� ��
			   �����Ͱ����� 0���� �۰ų� ������ ���� */
			case 2: 
				try {
					x = s.pop();
					System.out.println("���� �����ʹ� " + x + "�Դϴ�.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
				
			/* menu = 3�̸� ��ũ<���� �ִ� ������ �鿩�ٺ�>
			   �����Ͱ����� 0���� �۰ų� ������ ���� */
			case 3: 
				try {
					x = s.peek();
					System.out.println("��ũ�� �����ʹ� " + x + "�Դϴ�.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("������ ��� �ֽ��ϴ�.");
				}
				break;
			
			/* menu = 4�̸� ����<�ٴ� -> ����� ������ ���>
			   �����Ͱ����� 0���� �۰ų� ������ ���� */
			case 4:
				s.dump();
				break;
			
			/* menu = 5�̸� ã�� ������ ��ġ�� ��� */
			case 5:
				System.out.print("ã�� ������ :");
				x = stdin.nextInt();
				int n = s.indexOf(x);
				System.out.println("�������� " + (s.size() - n) + " ��° �ֽ��ϴ�.");
				
			/* menu = 6�̸� ������ ��� */
			case 6:
				s.clear();
				break;
				
			/* menu = 7�̸� ������ ��������� Ȯ������ */	
			case 7:
				System.out.println(s.isEmpty() ? "����ֽ��ϴ�" : "������� �ʽ��ϴ�.");
				break;
			
			/* menu = 8�̸� ������ �������ִ��� Ȯ������ */	
			case 8:
				System.out.println(s.isfull() ? "�������ֽ��ϴ�." : "���������� �ʽ��ϴ�.");
				break;
			}
		}
	}
}
