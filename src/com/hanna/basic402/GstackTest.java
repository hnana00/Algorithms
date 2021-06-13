package com.hanna.basic402;

import java.util.Scanner;

public class GstackTest {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		Gstack2<Integer> s = new Gstack2<Integer>(64);

		while (true) {
			System.out.println("���� ������ �� :" + s.size() + "/" + s.capacity());
			System.out.println("(1)��ť (2)��ť (3)��ũ" + "(4)���� (5)�˻� (0)����");

			int menu = stdin.nextInt();

			if (menu == 0)
				break;

			switch (menu) {

			case 1:

			case 2:
				s.dump();
			}
		}
	}
}