package com.hanna.basic302;
import java.util.Scanner;

public class SeqSearchSen {

	// 선형 검색(보초법：for문을 사용하여 구현)
	
	static int SeqSearchSen( int[] a, int n, int key ) {
		
		a[n] = key;   //보초추가
		
		for( int i = 0; i <= n; i++ ) 
			
			if(a[i] == key)
				return i;
			
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		Scanner stdin = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int num = stdin.nextInt();
		int[] x = new int[num +1];
		
		for( int i = 0; i < num; i++ ) {
			
			System.out.print("x[" + i + "] : ");
			x[i] = stdin.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int ky = stdin.nextInt();
		
		int idx = SeqSearchSen(x,num,ky);
		
		if(idx == -1 )
			System.out.println("그 값의 요소가 없습니다.");
		
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}

}
