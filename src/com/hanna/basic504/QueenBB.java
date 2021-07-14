package com.hanna.basic504;

public class QueenBB {

	/*
	 * 각 행,열에 1개의 퀸을 배치하는 조합(재귀)
	 */
	static int[] pos = new int[3];
	static boolean[] flag = new boolean[3];
	
	
	static void print() {
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("%2d" , pos[i]);
		}
		System.out.println("\n----------------------");
	}

	static void set(int i) {
		
		for (int j = 0; j < 3; j++) {

			if(flag[j] == false) {
				pos[i] = j;
				
				if(i == 2) {
					print();
					
				} else {
					flag[j] = true;
					set(i + 1);
					flag[j] = false;
					
				}
			}
		}
	}

	public static void main(String[] args) {

		set(0);
		
	}
}
