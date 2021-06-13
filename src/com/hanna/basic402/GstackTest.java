package com.hanna.basic402;

import java.util.Scanner;

public class GstackTest {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		Gstack2<Integer> s = new Gstack2<Integer>(64);

		while (true) {
			System.out.println("현재 데이터 수 :" + s.size() + "/" + s.capacity());
			System.out.println("(1)인큐 (2)디큐 (3)피크" + "(4)덤프 (5)검색 (0)종료");

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