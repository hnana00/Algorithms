package com.hanna.basic504;

public class QueenBBBB {

	static boolean[] flag_a = new boolean[8];	// �� �࿡ ���� �̹� ��ġ�Ǿ� �ִ°�?
	static boolean[] flag_b = new boolean[15];	// ���밢���� ���� �̹� ��ġ�Ǿ� �ִ°�?
	static boolean[] flag_c = new boolean[15];	// ���밢���� ���� �̹� ��ġ�Ǿ� �ִ°�?
	static int[] pos = new int[8]; // �� ���� ���� ��ġ

	// ü����(�� ���� ���� ��ġ)�� ���
	static void print() {
		
		for ( int i = 0; i < 8; i++ ) {
			for ( int j = 0; j < 8; j++ )
				System.out.printf("%s", j == pos[i] ? "��" : "��");
			System.out.println();
		}
		System.out.println();
	}

	// i���� �˸��� ��ġ�� ���� ��ġ
	static void set(int i) {
		
		int j;
		int[] jstk = new int[8];

		Start: while ( true ) {
			
			j = 0;
			
			while ( true ) {
				
				while ( j < 8 ) {
					
					if ( !flag_a[j] && !flag_b[i + j] && !flag_c[i - j + 7] ) {
						pos[i] = j;
						
						if ( i == 7 ) // ��� ���� ��ġ ��ħ
							print();
						
						else {
							flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
							jstk[i++] = j; // i ���� ���� Push
							continue Start;
						}
					}
					j++;
				}
				if ( --i == -1 )
					return;
				j = jstk[i]; // i ���� ���� Pop
				flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
				j++;
			}
		}
	}
	
	public static void main(String[] args) {

		set(0);
		
	}
}
