package com.hanna.basic605;
import java.util.Scanner;

public class QuickSort2 {

	/*
	 * �� ����(�����)
	 */
	static void swap( int[] a, int idx1, int idx2 ) {
		
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}

	// ��� ������ 9�� ���� �϶� �ܼ� ���� ����
	static void insertionSort( int[] a, int left, int right ) {
			
		for ( int i = left + 1; i <= right; i++ ) {
				
			int tmp = a[i];
			int j;
				
			for ( j = i; j > left && a[j - 1] > tmp; j-- )
				a[j] = a[j - 1];
				
			a[j] = tmp;
		}
	}
		
	//�����
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
			
			//��� ������ ���� �׷� ���� ������ �޼���
			if ( pr - left < right - pl ) {
				
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
				
				//Ǫ�� �� ���Ұ���
				System.out.printf("a[%d]~a[%d]�� �����ϴ� ������ ���ÿ� Ǫ���մϴ�.\n", left, pr);
				System.out.printf("Lstack:\n");
				lstack.dump();
				System.out.printf("Rstack:\n");
				rstack.dump();
				
			}
			
			if( pl < right ) {
				
				lstack.push(pl);
				rstack.push(right);
				
				//Ǫ�� �� ���Ұ���
				System.out.printf("a[%d]~a[%d]�� �����ϴ� ������ ���ÿ� Ǫ���մϴ�.\n", pl, right);
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

