package com.hanna.basic302;
import java.util.Scanner;

class ReturnsTheNumberOfElements {

	/* ��ڼ��� n���� �迭 a���� key�� ��ġ�ϴ� �����
	 * �ε����� idx�� �պ��� ������� �����ϰ�
	 * ��ġ�� ��ڼ��� ��ȯ�ϴ� �޼��� �ۼ�
	 */
	
	static int searchIdx( int[] a, int n, int key, int[] idx ) {

		int hhh = 0;
		
		for( int i = 0; i < n; i++ ) {
			
			if(a[i] == key) 
				idx[hhh++] = i;
		}
		
		return hhh;
	}
	
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int n = stdin.nextInt();
		
		//��ڼ��� n�� �迭
		int[] a = new int[n];
		int[] idx = new int[n];
		
		for( int i =0; i < n; i++ ) {
			
			System.out.println("a[" + i + "] :");
			a[i] = stdin.nextInt();
		}
		
		//ã�� �� �Է�
		System.out.println("ã���� : ");
		int key = stdin.nextInt();
		
		int hhh = searchIdx(a,n,key,idx);
		
		if(hhh == 0 )
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		
		else
			for( int i = 0; i < hhh; i++ )
				System.out.println("�� ���� " + "a[" + idx[i] + "]�� �ֽ��ϴ�.");
	}
}
