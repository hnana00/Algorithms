package com.hanna.basic201;
import java.util.Scanner;

public class ReverseArray {

	/*
	 * �迭 ��ҿ� ���� �������� ����
	 */
	
	static void swap( int[] list, int idx1, int idx2 ) {
		
		int t = list[idx1];
		list[idx1] = list[idx2];
		list[idx2] = t;
		
	}
	
	static void reverse( int[] list ) {
		
		for( int i = 0; i < list.length / 2; i++ ) {
			
			swap( list, i, list.length -i -1 );
		}
	}
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num = stdin.nextInt();
		
		int[] list = new int[num];
		
		// �迭�� ���ڸ� �Է� �޴´�.
		for( int i = 0; i < num; i++ ) {
			
			System.out.println("x[" + i + "] : ");
			list[i] = stdin.nextInt();
		}
		
		// �Ųٷ� ���� ���ּ���
		reverse(list);
		
		System.out.println("��Ҹ� �������� �����߽��ϴ�.");
		
		for( int i = 0; i < num; i++ ) {
			
			System.out.println("x[" + i + "] : " + list[i]);
			
		}
	}
}
