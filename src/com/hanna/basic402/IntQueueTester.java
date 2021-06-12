package com.hanna.basic402;
import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {

		/* int�� ť ��� */
		
		Scanner stdin = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while (true) {
			System.out.println("���� ������ �� :" + s.size() + "/"
							   + s.capacity());
			System.out.println("(1)��ť (2)��ť (3)��ũ" +
							   "(4)���� (5)�˻� (0)����");
			
			int menu = stdin.nextInt();
			
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			
			case 1:
				x = stdin.nextInt();
				s.enque(x);
				break;
				
			case 2:
				x = s.deque();
				System.out.println("��ť�� �����ʹ�? " + x);
				break;
			
			case 3:
				x = s.peek();
				System.out.println("��ũ�� ����? " + x);
				break;
				
			case 4:
				s.dump();
				
			case 5:
				System.out.println("�����ʹ� " + s.search(3) + "��°�� �ֽ��ϴ�.");
			}
		}
	}

}
