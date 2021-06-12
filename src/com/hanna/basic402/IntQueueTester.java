package com.hanna.basic402;
import java.util.Scanner;

public class IntQueueTester {

	public static void main(String[] args) {

		/* int형 큐 사용 */
		
		Scanner stdin = new Scanner(System.in);
		IntQueue s = new IntQueue(64);
		
		while (true) {
			System.out.println("현재 데이터 수 :" + s.size() + "/"
							   + s.capacity());
			System.out.println("(1)인큐 (2)디큐 (3)피크" +
							   "(4)덤프 (5)검색 (0)종료");
			
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
				System.out.println("디큐한 데이터는? " + x);
				break;
			
			case 3:
				x = s.peek();
				System.out.println("피크한 값은? " + x);
				break;
				
			case 4:
				s.dump();
				
			case 5:
				System.out.println("데이터는 " + s.search(3) + "번째에 있습니다.");
			}
		}
	}

}
