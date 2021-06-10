package com.hanna.basic302;
import java.util.Scanner;

public class SeqSearchSen2 {

	/* �����˻� ��ĳ�� ������ ���ϰ� ���
	 * ���� �˻��ϰ� �ִ� ������� *��ǥǥ��
	 */
	
	static int SeqSearchSen( int[] a, int n, int key ) {
		
		System.out.printf("   |");
		
		for( int i = 0; i < n; i++ )
			System.out.printf("%4d",i);
		
		System.out.println();
		System.out.println("---+-----------------------------");
		
		for( int i = 0; i < n; i++ ) {
			
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");   //??
			System.out.printf("%3d|",i);
			
			for( int j = 0; j < n; j++ ) {
				
				System.out.printf("%4d",a[j]);
			}
			
			System.out.println();
			
			//�˻�����
			if(a[i] == key)
				return i;   
		}
		
		//�˻�����
		return -1;
	}

	public static void main(String[] args) {

		 
		Scanner stdin = new Scanner(System.in);
		
		// �Է� ���� ���̸�ŭ �迭�� �����Ѵ�.
		System.out.println("��ڼ� : ");
		int num = stdin.nextInt();
		int[] x = new int[num];
	
		// ���� �迭�� ���̸�ŭ �޴´�.
		for( int i = 0; i < num; i++ ) {
			
			System.out.print("x[" + i + "] : ");
			x[i] = stdin.nextInt();
		}
		
		// �˻��� ���� �Է� �޴´�.
		System.out.println("�˻��� �� : ");
		int ky = stdin.nextInt();
		
		//x=�迭 num=�迭ũ�� ky=ã�� ��
		int idx = SeqSearchSen(x,num,ky);
		
		
		if(idx == -1 )
			System.out.println("�� ���� ��Ұ� �����ϴ�.");
		
		else
			System.out.println(ky + "��(��) x[" + idx + "]�� �ֽ��ϴ�.");
	}

}
