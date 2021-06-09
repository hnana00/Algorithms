package com.hanna.basic201;

public class PrimeNumber3 {

	public static void main(String[] args) {
		
		// ������ �������� Ƚ��
		int counter = 0; 
		
		// ã�� �Ҽ��� ����
		int ptr = 0;
		
		// �Ҽ��� �����ϴ� �迭
		int[] prime = new int[500];
		
		// 2�� �Ҽ���
		prime[ptr++] = 2;
		
		// 3�� �Ҽ���
		prime[ptr++] = 3;
		 
		for( int n = 5; n <= 1000; n += 2) {
			
			// �Ҽ��� �ƴ� �� flag = false �̴�.
			boolean flag = false;
			
			for( int i = 1; prime[i] * prime[i] <= n; i++ ) {
				
				 counter += 2;
				
				// ������ �������� �Ҽ��� �ƴϴ�. �� �̻� �ݺ��� ���ʿ�
				if( n % prime[i] == 0 ) {
					// �Ҽ��� �ƴ� �� flag = true �̴�.
					flag = true;
					break;
				}
			}
			
			// ������ ���� ������ �������� ����. 
			// �Ҽ���� �迭�� ����.
			if( !flag ) {
				
				// �Ҽ� �ֵ� ó��
				prime[ptr++] = n;
				counter++;
			}
		}
		
		// �Ҽ��� ��´�.
		for( int i=0; i < ptr; i++ ) {
			System.out.println( prime[i] );
		}
	}
}
