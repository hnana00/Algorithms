package com.hanna.basic303;
import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch {

	/* 
	 *  Arrays.binarySearch�� �����˻�
	 */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int n = stdin.nextInt();
		int[] a = new int[n];
		
		System.out.println("������������ �Է��ϼ���.");
		
		System.out.print("a[0] : ");
		a[0] = stdin.nextInt();
		
		for( int i = 1; i < n; i++ ) {
			
			do {
				
				System.out.println("x[" + i + "] :");
				a[i] = stdin.nextInt();
				
			}while ( a[i] < a[i-1] );
		}
		
		System.out.println("�˻��� �� : ");
		int key = stdin.nextInt();
		
		int na = Arrays.binarySearch(a,key);
		
		if( na < 0 ) {
			
			//�˻� ����
			int p = -na-1;
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
			System.out.println("���� ����Ʈ�� : " + p + " ��ȯ���� : " +na);
			
			
			//�˻� ���� 
		}else
			System.out.println(key + "��(��) x[" + na + "]�� �ֽ��ϴ�.");
	}
}
