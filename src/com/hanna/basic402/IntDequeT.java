package com.hanna.basic402;
import java.util.Scanner;

public class IntDequeT {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		IntDeque s = new IntDeque(10);
		
		while (true) {
			System.out.println("���� ������ �� :" + s.size() + "/"
							   + s.capacity());
			System.out.println("(1)����ť (2)����ť (3)�յ�ť" +
							   "(4)���� (5)�˻�");
			
			int menu = stdin.nextInt();
			
			if(menu == 0) break;
			
			int x;
			switch(menu) {
			
			case 1:
				x = stdin.nextInt();
				s.enqueFront(x);
				break;
				
			case 2:
				x = stdin.nextInt();
				s.enqueRear(x);
				break;
				
			case 3:
				// = s.dequeFront();
				System.out.println(s.dequeFront());
				break;
				
			case 4:
				s.dequeRear();
				break;
		
			case 5:
				s.dump();
				break;
			}
		}
	}
}
