package com.hanna.basic102;
import java.util.Scanner;

public class Gauss {

	/* ���콺�� ���� ����� �̿��Ͽ�
	 * 1~n ������ �����ձ��ϱ�
	 */
	
	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("���콺 ���� �Է¹��� �� ������ �� ���ϱ�");
		System.out.println("num = ");
		int num = stdin.nextInt(); 
		
		//1+2+3+4+5+6+7+8+9 ���� Ȧ���� ������ �߰����� 5�� ���콺�������� �ݵ�� ����߸� ���� ���´�.
		//1+2+3+4+5+6+7+8 ���� ¦���� ������ �׳� ���콺 ������ �ϸ� �ȴ�.
		
		int result = 0;
		
		if(num%2 == 0) { //�Է¹��� �� ��ȣ�� ¦����� �׳� ���콺 ����
			result = (1+num)*((1+num)/2);
			
		}else { //�Է¹��� �� ��ȣ�� Ȧ����� (���콺����) - �߰���
			result = (1+num)*((1+num)/2) - (1+num)/2;
		}
		
		System.out.println(result);
	}
}
