package com.hanna.basic301;

public class Example {

	public static void main(String[] args) {
		
		/**
		 * 세팅
		 */
		Corn1 c1 = new Corn1();
		c1.setObj("안녕");
		
		Corn1 c2 = new Corn1();
		c2.setObj(10);
		
		
		/**
		 * 사용
		 */
		String a1 = (String)c1.getObj();
		System.out.println(a1);
		
		int a2 = (int)c2.getObj();
		System.out.println(a2);
		 
	}
}
