package com.hanna.basic502;

public class Recur2 {

	static void hanna(int n) {
	
		if(n > 0) {
		hanna(n-2);
 		System.out.println(n);
		hanna(n-1);
		}
	}
	
	public static void main(String[] args) {

		hanna(4);
	}

}
