package com.hanna.basic303;
import java.util.Scanner;

public class BinSearch3 {

	/*���� ���� �� �տ� ��Ҹ� ã�� �޼���*/
	
	static int binsearchx( int[] a, int n, int key ) {
		
		int s = 0;
		int e = n - 1;
		
		do {
			int m = (s + e) / 2;
			
			// key�� ���� �� ���� ��Ҹ� ã��
			if( a[m] == key) {
				for (; m > s; m--)
					if(a[m-1] < key )
						break;
				return m;  //�˻�����
		}
			else if( a[m] > key )
				e = m - 1;
			
			else
				s = m + 1;
		}while( s <= e );
		
		//�˻�����
		return -1;
	}
	
	
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
		
		int na = binsearchx(a,n,key);
		
		if( na == -1 )
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		
		else
			System.out.println(key + "��(��) x[" + na + "]�� �ֽ��ϴ�.");
	}
}
