package com.hanna.basic303;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class physExamSearch {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);

		PhysData[] x = {

				new PhysData("�̳���", 162, 0.3), new PhysData("������", 168, 0.4), new PhysData("���Ѱ�", 169, 0.8),
				new PhysData("ȫ�ر�", 171, 1.5), new PhysData("������", 173, 0.7), new PhysData("��ȣ��", 174, 1.2),
				new PhysData("�̼���", 175, 2.0), };

		System.out.println("�� cm�� ����� ã�� �ֳ���? : ");
		int height = stdin.nextInt();

		int idx = Arrays.binarySearch(x,new PhysData("",height,0.0), PhysData.HEIGHT_ORDER);

		if (idx < 0)
			System.out.println("��Ұ� �����ϴ�.");
		else
			System.out.println("x[" + idx + "]�� �ֽ��ϴ�.");
		System.out.println("ã�� ������ : " + x[idx]);
	}
}
