package com.hanna.basic504;

public class QueenB {
	/*
	 * 각 열에 1개의 퀸을 배치하는 조합(재귀)
	 */
	static int[] pos = new int[3];
	
	static void print() {
		
		//System.out.println("----------------------");
		
		for (int i = 0; i < 3; i++) {
			
			System.out.printf("%2d" , pos[i]);
		}
		
		System.out.println("\n----------------------");
		
	}
	
	static void set(int i) {
		
		for (int j = 0; j < 3; j++) {
		//	System.out.println( "set(" + i + ") pos[" + i + "] = " + j);
			pos[i] = j;
			if(i == 2)
				print();
			else
				set1(i+1);
		}
	}
	
	static void set1(int i) {
		
		for (int j = 0; j < 3; j++) {
		//	System.out.println( "set1(" + i + ") pos[" + i + "] = " + j);
			pos[i] = j;
			if(i == 2)
				print();
			else
				set2(i+1);
		}
	}
	
	static void set2(int i) {
		
		for (int j = 0; j < 3; j++) {
		//	System.out.println( "set2(" + i + ") pos[" + i + "] = " + j);
			pos[i] = j;
			if(i == 2) {
				print();
			}
		}
	}
	
	public static void main(String[] args) {
	
		set(0);
		
	}

}
