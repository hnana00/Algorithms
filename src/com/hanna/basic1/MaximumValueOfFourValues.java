package com.hanna.basic1;
//4개의 정수값 중 최대값 출력
public class MaximumValueOfFourValues {

	static int max4(int a,int b,int c,int d) {
		int max=a;
		if(b>max)
			max=b;
		if(c>max)
			max=c;
		if(d>max)
			max=d;
		
		return max;
	}
	public static void main(String[] args) {
		System.out.println("max4(4,3,2,1) = " + max4(4,3,2,1));
		System.out.println("max4(1,2,3,4) = " + max4(1,2,3,4));
		System.out.println("max4(3,7,3,2) = " + max4(3,7,3,2));
		System.out.println("max4(8,1,2,5) = " + max4(8,1,2,5));
		System.out.println("max4(1,4,9,6) = " + max4(1,4,9,6));

	}

}
