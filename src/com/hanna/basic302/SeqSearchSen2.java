package com.hanna.basic302;
import java.util.Scanner;

public class SeqSearchSen2 {

	/* 선형검색 스캐닝 과정을 상세하게 출력
	 * 현재 검색하고 있는 요소위에 *별표표시
	 */
	
	static int SeqSearchSen( int[] a, int n, int key ) {
		
		System.out.printf("   |");
		
		for( int i = 0; i < n; i++ )
			System.out.printf("%4d",i);
		
		System.out.println();
		System.out.println("---+-----------------------------");
		
		for( int i = 0; i < n; i++ ) {
			
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i * 4) + 3), "");   //??
			System.out.printf("%3d|",i);
			
			for( int j = 0; j < n; j++ ) {
				
				System.out.printf("%4d",a[j]);
			}
			
			System.out.println();
			
			//검색성공
			if(a[i] == key)
				return i;   
		}
		
		//검색실패
		return -1;
	}

	public static void main(String[] args) {

		 
		Scanner stdin = new Scanner(System.in);
		
		// 입략 받은 길이만큼 배열을 생성한다.
		System.out.println("요솟수 : ");
		int num = stdin.nextInt();
		int[] x = new int[num];
	
		// 값을 배열의 길이만큼 받는다.
		for( int i = 0; i < num; i++ ) {
			
			System.out.print("x[" + i + "] : ");
			x[i] = stdin.nextInt();
		}
		
		// 검색할 값을 입력 받는다.
		System.out.println("검색할 값 : ");
		int ky = stdin.nextInt();
		
		//x=배열 num=배열크기 ky=찾을 값
		int idx = SeqSearchSen(x,num,ky);
		
		
		if(idx == -1 )
			System.out.println("그 값의 요소가 없습니다.");
		
		else
			System.out.println(ky + "은(는) x[" + idx + "]에 있습니다.");
	}

}
