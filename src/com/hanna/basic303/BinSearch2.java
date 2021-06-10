package com.hanna.basic303;
import java.util.Scanner;


public class BinSearch2 {

	/*이진검색 (검색과정을 자세히 출력함)*/
	
	static int binSearch2( int[] a, int n, int key ) {
		
		System.out.printf("   |");
		
		for( int i = 0; i < n; i++ )
			System.out.printf("%4d",i);
		
		
		System.out.println();
		System.out.println("---+------------------------------");
		
		//
		int s = 0; 
		int e = n - 1;

		do {
			
			int m = (s + e) / 2;
			
			System.out.println("   |");
			
			if (s != m)            //↓정말정말 당황스럽다 이게뭘까? 어이가없다 이걸 내거 어떻게 알지?
				System.out.printf(String.format("%%%ds<-%%%ds+", (s * 4) + 1, (m - s) * 4), "", "");
			else
				System.out.printf(String.format("%%%ds<-+", m * 4 + 1), "");
			
			if (m != e)
				System.out.printf(String.format("%%%ds->\n", (e - m) * 4 - 2), "");
			else
				System.out.println("->");
			System.out.printf("%3d|", m);

			for (int k = 0; k < n; k++)
				System.out.printf("%4d", a[k]);
			System.out.println("\n   |");
			
			//검색성공
			if( a[m] == key )
				return m;
			
			//검색 결과를 뒷쪽으로 좁힘
			else if( a[m] < key )
				s = m + 1;
			
			//검색 결과를 앞쪽으로 좁힘
			else
				e = m - 1;
			
			
		}while ( s <= e );

		//검색실패
		return -1;
	}

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		
		System.out.println("요솟수 : ");
		int n = stdin.nextInt();
		int[] a = new int[n];
		
		System.out.println("오름차순으로 입력하세요.");
		
		System.out.print("a[0] : ");
		a[0] = stdin.nextInt();
		
		for( int i = 1; i < n; i++ ) {
			
			//앞에 요소보다 작으면 다시입력
			do {
				
				System.out.println("x[" + i + "] :");
				a[i] = stdin.nextInt();
		
			}while ( a[i] < a[i-1] );
		}
		
		System.out.println("검색할 값 : ");
		int key = stdin.nextInt();
		
		int na = binSearch2(a, n, key);
		
		if( na == -1 )
			System.out.println("그 값의 요소가 없습니다.");
		
		else
			System.out.println(key + "은(는) x[" + na + "]에 있습니다.");
	}

}
