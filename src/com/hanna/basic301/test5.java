package com.hanna.basic301;

public class test5 {
	public static void main(String[] args) {
		
		test2 rabbit = new test2();
		test3 dog    = new test3();
		test4 tiger  = new test4();
		
		System.out.print("Åä³¢´Â ");
		rabbit.running();
		System.out.print("¶Ù°í");
		rabbit.eat();
		System.out.print("¸Ô°í");
		System.out.print( rabbit.sleepTime() + "½Ã°£ ÀÜ´Ù");
		
		System.out.println();
		
		System.out.print("°­¾ÆÁö´Â ");
		dog.running();
		System.out.print("¶Ù°í");
		dog.eat();
		System.out.print("¸Ô°í");
		System.out.print( dog.sleepTime() + "½Ã°£ ÀÜ´Ù");
		
		System.out.println();
		
		System.out.print("È£¶ûÀÌ´Â ");
		tiger.running();
		System.out.print("¶Ù°í");
		tiger.eat();
		System.out.print("¸Ô°í");
		System.out.print( tiger.sleepTime() + "½Ã°£ ÀÜ´Ù");
	}
}