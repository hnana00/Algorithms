package com.hanna.basic303;
import java.util.Scanner;


public class BinSearch2 {

	/*�����˻� (�˻������� �ڼ��� �����)*/
	
	static int binSearch2( int[] a, int n, int key ) {
		
		System.out.printf("   |");
		
		for( int i = 0; i < n; i++ )
			System.out.printf("%4d",i);
		
		
		System.out.println();
		System.out.println("---+------------------------------");
		
		//
		int s = 0; 
		int e = n - 1;

		do {
			
			int m = (s + e) / 2;
			
			System.out.println("   |");
			
			if (s != m)            //���������� ��Ȳ������ �̰Թ���? ���̰����� �̰� ���� ��� ����?
				System.out.printf(String.format("%%%ds<-%%%ds+", (s * 4) + 1, (m - s) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", m * 4 + 1), "");
			
			if (m != e)
				System.out.printf(String.format("%%%ds->\n", (e - m) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", m);

			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			
			//�˻�����
			if( a[m] == key )
				return m;
			
			//�˻� ����� �������� ����
			else if( a[m] < key )
				s = m + 1;
			
			//�˻� ����� �������� ����
			else
				e = m - 1;
			
			
		}while ( s <= e );

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
			
			//�տ� ��Һ��� ������ �ٽ��Է�
			do {
				
				System.out.println("x[" + i + "] :");
				a[i] = stdin.nextInt();
		
			}while ( a[i] < a[i-1] );
		}
		
		System.out.println("�˻��� �� : ");
		int key = stdin.nextInt();
		
		int na = binSearch2(a, n, key);
		
		if( na == -1 )
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		
		else
			System.out.println(key + "��(��) x[" + na + "]�� �ֽ��ϴ�.");
	}

}
