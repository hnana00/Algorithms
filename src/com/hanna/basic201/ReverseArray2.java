package com.hanna.basic201;

public class ReverseArray2 {

	static void swap( int[] list, int idx1, int idx2 ) {
		
		int t = list[idx1];
		list[idx1] = list[idx2];
		list[idx2] = t;
		
	}
	
	static void reverse( int[] list ) {
		
		// ����Ʈ �� ����Ʈ ��ġ�� swap���� �����ش�
		for( int i = 0; i < list.length / 2; i++ ) {
			
			// ��ȯ�ϱ� �� �ȳ���
			int test = list.length -i -1;
			System.out.println("a[" + i + "]��(��) a[" + test + "]�� ��ȯ�մϴ�.");
			
			// ��ȯ
			swap( list, i, list.length -i -1 );
			
			// ��ȯ �� �ȳ���
			for( int j = 0; j < list.length; j++)
				System.out.printf("%d ",list[j]);
			
			System.out.println("\n");
		}
	}
	
	public static void main(String[] args) {

		// �Է��� �޴´�
		int[] a = {5,10,73,2,-5,42};
		
		for( int i = 0; i < a.length; i++ ) {
			
			System.out.printf("%d ",a[i]);
			
		}
		
		System.out.println("\n------------------");
		// �޼ҵ� ȣ��
		reverse(a);
	}
}
