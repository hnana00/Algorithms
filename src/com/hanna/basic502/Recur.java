package com.hanna.basic502;

public class Recur {

	static void hanna(int n) {
		
		if(n > 0) {
			hanna(n-1);
			System.out.println(n);
			hanna(n-2);
		}
	}
	
	public static void main(String[] args) {
		 
		hanna(4);
	}
}