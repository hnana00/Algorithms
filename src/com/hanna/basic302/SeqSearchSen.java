package com.hanna.basic302;
import java.util.Scanner;

public class SeqSearchSen {

	// ���� �˻�(���ʹ���for���� ����Ͽ� ����)
	
	static int SeqSearchSen( int[] a, int n, int key ) {
		
		a[n] = key;   //�����߰�
		
		for( int i = 0; i <= n; i++ ) 
			
			if(a[i] == key)
				return i;
			
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("��ڼ� : ");
		int num = stdin.nextInt();
		int[] x = new int[num +1];
		
		for( int i = 0; i < num; i++ ) {
			
			System.out.print("x[" + i + "] : ");
			x[i] = stdin.nextInt();
		}
		
		System.out.println("�˻��� �� : ");
		int ky = stdin.nextInt();
		
		int idx = SeqSearchSen(x,num,ky);
		
		if(idx == -1 )
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		
		else
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}

}
