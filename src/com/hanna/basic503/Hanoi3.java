package com.hanna.basic503;

public class Hanoi3 {

	// ������ x��տ��� y������� �ű�
		static void move(int no, int x, int y) {
			
			int[] xstk = new int[100];
			int[] ystk = new int[100];
			int[] sstk = new int[100]; // ����
			int ptr = 0; // ���� ������
			int sw = 0;

			while (true) {
				if (sw == 0 && no > 1) {
					xstk[ptr] = x; // x�� ���� Ǫ��
					ystk[ptr] = y; // y�� ���� Ǫ��
					sstk[ptr] = sw; // sw�� ���� Ǫ��
					ptr++;
					no = no - 1;
					y = 6 - x - y;
					continue;
				}
				System.out.printf("[%d]�� %d��տ��� %d������� �ű�\n", no, x, y);
				
				System.out.println(sw);
				
				if (sw == 1 && no > 1) {
					xstk[ptr] = x; // x�� ���� Ǫ��
					ystk[ptr] = y; // y�� ���� Ǫ��
					sstk[ptr] = sw; // sw�� ���� Ǫ��
					ptr++;
					no = no - 1;
					x = 6 - x - y;
					if (++sw == 2)
						sw = 0;
					continue;
				}
				do {
					if (ptr-- == 0) // ������ �� ��
						return;
					x = xstk[ptr]; // ���� �����ϰ� �ִ� x�� ��
					y = ystk[ptr]; // ���� �����ϰ� �ִ� y�� ��
					sw = sstk[ptr] + 1; // ���� �����ϰ� �ִ� sw�� ��
					no++;
				} while (sw == 2);
			}
		}
		
	public static void main(String[] args) {

		move(3, 1, 3);
		
	}

}
