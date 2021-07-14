package com.hanna.basic503;

public class Hanoi2 {
 
	/*
	 * �ϳ����� ž(��� ���ڿ��� ���)
	 */
	static String[] name = { "A���", "B���", "C���" };

	// ������ x��տ��� y������� �ű�
	static void move(int no, int x, int y) {
		if (no > 1) {
			move(no - 1, x, 6 - x - y);
		}
		
		System.out.println("����[" + no + "]�� " + name[x - 1] + "���� " + name[y - 1] + "���� �ű�");

		if (no > 1) {
			move(no - 1, 6 - x - y, y);
		}
		
	}

	public static void main(String[] args) {
	
		move(3, 1, 3);
		
}
}
