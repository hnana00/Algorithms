package com.hanna.basic602;
import java.util.Scanner;

public class selectionsort3 {

	/*
	 * // ���� ���� ����
	 */
	static void binInsertionSort(int[] a, int n) {
		
		for ( int i = 1; i < n; i++ ) {
			int key = a[i];
			int pl = 0; // �˻����� �� ���� �ε���
			int pr = i - 1; // �˻����� �� ���� �ε���
			int pc; // �� �߾��� �ε���
			int pd; // �����ϴ� ��ġ�� �ε���

			do {
				pc = (pl + pr) / 2;
				
				if (a[pc] == key) // �˻�����
					break;
				
				else if (a[pc] < key)
					pl = pc + 1;
				
				else
					pr = pc - 1;
				
			} while (pl <= pr);
			
			pd = (pl <= pr) ? pc + 1 : pr + 1;

			for ( int j = i; j > pd; j-- )
				a[j] = a[j - 1];
			
			a[pd] = key;
		}
	}
		
	public static void main(String[] args) {

		Scanner stdIn = new Scanner(System.in);

		System.out.println("���� ���� ����");
		System.out.print("��ڼ���");
		int nx = stdIn.nextInt();
		int[] x = new int[nx];

		for ( int i = 0; i < nx; i++ ) {
			System.out.print("x[" + i + "]��");
			x[i] = stdIn.nextInt();
		}

		binInsertionSort(x, nx); // �迭 x�� ������������

		System.out.println("������������ �����߽��ϴ�.");
		for ( int i = 0; i < nx; i++ )
			System.out.println("x[" + i + "]��" + x[i]);
	}

}
