package com.hanna.basic605;

import java.util.Scanner;

public class QuickSort4 {

	/*
	 * �� ����(�����) ��� ������ ���� �׷� ���� ������ �޼���
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	static void quickSort( int[] a, int left, int right ) {
		
		IntStack lstack = new IntStack( right - left + 1 ); //���� ����
		IntStack rstack = new IntStack( right - left + 1 ); //���� ����
		
		lstack.push(left);
		rstack.push(right);
		
		
		while( lstack.isEmpty() != true ) {
			
			int pl = left = lstack.pop();
			int pr = right = rstack.pop();
			int x = a[(left + right) / 2];
			
			do {
				while( a[pl] < x )
					pl++;
				
				while( a[pr] > x )
					pr--;
				
				if( pl <= pr )
					swap( a, pl++, pr-- );
				
			} while( pl <= pr );
			
			if (pr - left < right - pl) {
				int temp;
				temp = left;
				left = pl;
				pl = temp;
				temp = right;
				right = pr;
				pr = temp;
			}
			
			if( left < pr ) {
				
				lstack.push(left);
				rstack.push(pr);
				System.out.printf("a[%d]~a[%d]�� �����ϴ� ������ ���ÿ� Ǫ���մϴ�.\n", left, pr); //Ǫ�� �� ���Ұ���
				System.out.printf("Lstack:\n");
				lstack.dump();
				System.out.printf("Rstack:\n");
				rstack.dump();
				
			}
			
			if( pl < right ) {
				
				lstack.push(pl);
				rstack.push(right);
				System.out.printf("a[%d]~a[%d]�� �����ϴ� ������ ���ÿ� Ǫ���մϴ�.\n", pl, right); //Ǫ�� �� ���Ұ���
				System.out.printf("Lstack:\n");
				lstack.dump();
				System.out.printf("Rstack:\n");
				rstack.dump();
			}
		}
	}
	
	public static void main(String[] args) {

		System.out.println("�� ����(����� ����)");
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int n = stdin.nextInt();
		
		int[] a = new int[n];
		
		for( int i = 0; i < n; i++ ) {
			
			System.out.println("a [" + i + "] :");
			a[i] = stdin.nextInt();
		}
		
		quickSort( a, 0, n-1 );
		
		System.out.println("������������ �����߽��ϴ�.");
		
		for( int i = 0; i < n; i++ )
			System.out.println("a[" + i + "]" + a[i]);
	}
}
