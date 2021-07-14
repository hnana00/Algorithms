package com.hanna.basic503;

public class Hanoi2 {
 
	/*
	 * ÇÏ³ëÀÌÀÇ Å¾(±âµÕ ¹®ÀÚ¿­·Î Âï±â)
	 */
	static String[] name = { "A±âµÕ", "B±âµÕ", "C±âµÕ" };

	// ¿ø¹ÝÀ» x±âµÕ¿¡¼­ y±âµÕÀ¸·Î ¿Å±è
	static void move(int no, int x, int y) {
		if (no > 1) {
			move(no - 1, x, 6 - x - y);
		}
		
		System.out.println("¿ø¹Ý[" + no + "]¸¦ " + name[x - 1] + "¿¡¼­ " + name[y - 1] + "À¸·Î ¿Å±è");

		if (no > 1) {
			move(no - 1, 6 - x - y, y);
		}
		
	}

	public static void main(String[] args) {
	
		move(3, 1, 3);
		
}
}
