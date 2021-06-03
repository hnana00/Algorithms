package com.hanna.basic102;
import java.util.Scanner;

public class Gauss {

	/* 가우스의 덧셈 방법을 이용하여
	 * 1~n 까지의 정수합구하기
	 */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("가우스 덧셈 입력받은 값 까지의 합 구하기");
		System.out.println("num = ");
		int num = stdin.nextInt(); 
		
		//1+2+3+4+5+6+7+8+9 끝이 홀수로 끝나면 중간값인 5를 가우스덧셈에서 반드시 빼줘야만 합이 나온다.
		//1+2+3+4+5+6+7+8 끝이 짝수로 끝나면 그냥 가우스 덧셈을 하면 된다.
		
		int result = 0;
		
		if(num%2 == 0) { //입력받은 끝 번호가 짝수라면 그냥 가우스 덧셈
			result = (1+num)*((1+num)/2);
			
		}else { //입력받은 끝 번호가 홀수라면 (가우스덧셈) - 중간값
			result = (1+num)*((1+num)/2) - (1+num)/2;
		}
		
		System.out.println(result);
	}
}
