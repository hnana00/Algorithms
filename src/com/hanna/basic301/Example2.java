package com.hanna.basic301;

public class Example2 {

	public static void main(String[] args) {
		
		/**
		 * 세팅
		 */
		 Corn<String> c1 = new Corn<>();
		 c1.setT("안녕");
		
		 Corn<Integer> c2 = new Corn<>();
		 c2.setT(99);
		 
		/**
		 * 사용
		 */
		 System.out.println(c1.getT());
		 System.out.println(c2.getT());
		 
	}
}
