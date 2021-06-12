package com.hanna.basic303;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class physExamSearch {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		PhysData[] x = {

				new PhysData("이나령", 162, 0.3), new PhysData("유지훈", 168, 0.4), new PhysData("김한결", 169, 0.8),
				new PhysData("홍준기", 171, 1.5), new PhysData("전서현", 173, 0.7), new PhysData("이호연", 174, 1.2),
				new PhysData("이수민", 175, 2.0), };

		System.out.println("몇 cm인 사람을 찾고 있나요? : ");
		int height = stdin.nextInt();

		int idx = Arrays.binarySearch(x,new PhysData("",height,0.0), PhysData.HEIGHT_ORDER);

		if (idx < 0)
			System.out.println("요소가 없습니다.");
		else
			System.out.println("x[" + idx + "]에 있습니다.");
		System.out.println("찾은 데이터 : " + x[idx]);
	}
}
