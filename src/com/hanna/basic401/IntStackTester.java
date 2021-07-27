package com.hanna.basic401;
import java.util.Scanner;

import com.hanna.basic605.IntStack;


public class IntStackTester {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		IntStack s = new IntStack(64);
		
		while( true ) {
			
			//size=스택에 쌓여 있는 데이터수 반환 , capacity=스택의 용량을 반환
			System.out.println("현재 데이터 수 : " + s.size() + "/" + s.capacity());
			
			System.out.print("(1)푸시  (2)팝  (3)피크 (4)덤프 (0)종료 (5)찾기 (6)비움"
					+ "(7)비움확인 (8)가득참확인");
			int menu = stdin.nextInt();
			
			//종료
			if( menu == 0 )
				break;
			
			int x = 0;
			switch ( menu) {
			
			/* menu = 1이면 푸시
			   스택의 용량 보다 데이수가 많으면 예외 */
			case 1: 
				System.out.print("데이터 : ");
				x = stdin.nextInt();
				
				try {
					s.push(x);
				} catch (IntStack.OverflowIntStackException e) {
					System.out.println("스택이 가득 찼습니다.");
				}
				break;
		
			/* menu = 2이면 팝
			   데이터갯수가 0보다 작거나 같으면 예외 */
			case 2: 
				try {
					x = s.pop();
					System.out.println("팝한 데이터는 " + x + "입니다.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
				
			/* menu = 3이면 피크<정상에 있는 데이터 들여다봄>
			   데이터갯수가 0보다 작거나 같으면 예외 */
			case 3: 
				try {
					x = s.peek();
					System.out.println("피크한 데이터는 " + x + "입니다.");
				} catch(IntStack.EmptyIntStackException e) {
					System.out.println("스택이 비어 있습니다.");
				}
				break;
			
			/* menu = 4이면 덤프<바닥 -> 꼭대기 순서로 출력>
			   데이터갯수가 0보다 작거나 같으면 예외 */
			case 4:
				s.dump();
				break;
			
			/* menu = 5이면 찾는 데이터 위치를 출력 */
			case 5:
				System.out.print("찾는 데이터 :");
				x = stdin.nextInt();
				int n = s.indexOf(x);
				System.out.println("꼭대기부터 " + (s.size() - n) + " 번째 있습니다.");
				
			/* menu = 6이면 스택을 비움 */
			case 6:
				s.clear();
				break;
				
			/* menu = 7이면 스택이 비워있음을 확인해줌 */	
			case 7:
				System.out.println(s.isEmpty() ? "비어있습니다" : "비어있지 않습니다.");
				break;
			
			/* menu = 8이면 스택이 가득차있는지 확인해줌 */	
			case 8:
				System.out.println(s.isfull() ? "가득차있습니다." : "가득차있지 않습니다.");
				break;
			}
		}
	}
}
