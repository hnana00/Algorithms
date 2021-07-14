package com.hanna.basic502;

public class Recur3 {

	static void hanna(int n) {
		
		/*
		if(n > 0) {
			hanna(n-1);
 			System.out.println(n);
			hanna(n-2);
		}
		*/
		
		// 
		int[] a = new int[100];
		
		// 
		int[] b = new int[100];
		int p = -1;
		int s = 0;

		while (true) {
			
			if (n > 0) {
				p++;
				a[p] = n;
				b[p] = s;

				if (s == 0) {
					n = n - 1;
					
				} else if (s == 1) {
					n = n - 2;
					s = 0;
				}
				continue;
			}
			 
			do {
				n = a[p];
				s = b[p--] + 1;
				 
				if (s == 2) {
					System.out.println( n );
					if (p < 0)
						return;
				}
			} while (s == 2);
		}
	}
		
	
	public static void main(String[] args) {

		hanna(3);
	}
}
