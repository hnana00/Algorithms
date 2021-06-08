package com.hanna.basic201;
import java.util.Scanner;

public class PhysicalExamination {

	static final int VMAX= 21;
	
	static class physcDate {
		
		String name;      //이름
		int height;       //키
		double vision;    //시력
	
	physcDate( String name, int height, double vision ){  //생성자
		
		this.name = name;
		this.height = height;
		this.vision = vision;
		
	}
}
	
	static double aveheight( physcDate[] dat ) {  //키의 평균
		
		double sum = 0;
		
		for( int i = 0; i < dat.length; i++ )
			
			sum += dat[i].height;
		
		return sum / dat.length;
	}
	
	static void distvision( physcDate[] dat, int[] dist ) {  //시력 분포
		
		int i = 0;
		dist[i] = 0;
		
		for( i = 0; i < dat.length; i++ )
			
			if( dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0 )
				dist[(int)(dat[i].vision * 10)]++;  //??
	}
	
	public static void main(String[] args) {

		//Scanner stdIn new Scanner(System.in);
		
		physcDate[] x = {
				
			new physcDate("박현규", 162, 0.3),
			new physcDate("함진아", 173, 0.7),
			new physcDate("최윤미", 175, 2.0),
			new physcDate("홍연의", 172, 1.5),
			new physcDate("이수진", 168, 0.4),
			new physcDate("김영준", 174, 1.2),
			new physcDate("박용규", 169, 0.8),
			
		};
		
		int[] vdist = new int[VMAX]; 
		
		System.out.println(" ■ 신체검사 리스트 ■");
		System.out.println("이름      키    시력");
		System.out.println("-------------------");
		
		for( int i = 0; i < x.length; i++ ) {
			
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		
		System.out.printf("\n평균 키 : %5.1fcm\n", aveheight(x));
		
		distvision(x, vdist);
		
		System.out.println("\n시력분포");
		
		for( int i = 0; i < VMAX; i++ ) {
			
			System.out.printf("%3.1f ~ :", i / 10.0);
			
			for( int j = 0; j < vdist[i]; j++ ) 
				
				System.out.print('*');
					
			System.out.println();
		}
	}
}
