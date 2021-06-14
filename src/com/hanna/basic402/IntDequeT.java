package com.hanna.basic402;
import java.util.Scanner;

public class IntDequeT {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		IntDeque s = new IntDeque(10);
		
		while (true) {
			System.out.println("현재 데이터 수 :" + s.size() + "/"
							   + s.capacity());
			System.out.println("(1)앞인큐 (2)뒤인큐 (3)앞디큐" +
							   "(4)덤프 (5)검색");
			
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
