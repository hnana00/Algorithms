package com.hanna.basic503;

public class Hanoi {

	/*
	 * 하노이의 탑
	 */
	
	  public static void move(int no, int x, int y) {

	      if (no > 1) {

	         System.out.println("1 > move(" + (no-1) + " , " +  (x) + " , " + (6-x-y)+ ")");
	         move( no-1, x, 6-x-y );
	      }
	      
	      System.out.println( "\n원반  [ " + no +" ] 을 "+ x + " 기둥에서 "+ y + " 기둥으로");

	      if (no > 1) {
	         System.out.println("2 > move(" + (no-1) + " , " +  (6-x-y) + " , " + y + ")");
	         move( no-1, 6-x-y, y );
	      }

	   }

	public static void main(String[] args) {

		 move(3, 1, 3);

	}

}
