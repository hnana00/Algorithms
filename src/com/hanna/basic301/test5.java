package com.hanna.basic301;

public class test5 {
	public static void main(String[] args) {
		
		test2 rabbit = new test2();
		test3 dog    = new test3();
		test4 tiger  = new test4();
		
		System.out.print("�䳢�� ");
		rabbit.running();
		System.out.print("�ٰ�");
		rabbit.eat();
		System.out.print("�԰�");
		System.out.print( rabbit.sleepTime() + "�ð� �ܴ�");
		
		System.out.println();
		
		System.out.print("�������� ");
		dog.running();
		System.out.print("�ٰ�");
		dog.eat();
		System.out.print("�԰�");
		System.out.print( dog.sleepTime() + "�ð� �ܴ�");
		
		System.out.println();
		
		System.out.print("ȣ���̴� ");
		tiger.running();
		System.out.print("�ٰ�");
		tiger.eat();
		System.out.print("�԰�");
		System.out.print( tiger.sleepTime() + "�ð� �ܴ�");
	}
}