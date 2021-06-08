package com.hanna.basic201;
import java.util.Scanner;

public class PhysicalExamination {

	static final int VMAX= 21;
	
	static class physcDate {
		
		String name;      //�̸�
		int height;       //Ű
		double vision;    //�÷�
	
	physcDate( String name, int height, double vision ){  //������
		
		this.name = name;
		this.height = height;
		this.vision = vision;
		
	}
}
	
	static double aveheight( physcDate[] dat ) {  //Ű�� ���
		
		double sum = 0;
		
		for( int i = 0; i < dat.length; i++ )
			
			sum += dat[i].height;
		
		return sum / dat.length;
	}
	
	static void distvision( physcDate[] dat, int[] dist ) {  //�÷� ����
		
		int i = 0;
		dist[i] = 0;
		
		for( i = 0; i < dat.length; i++ )
			
			if( dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0 )
				dist[(int)(dat[i].vision * 10)]++;  //??
	}
	
	public static void main(String[] args) {

		//Scanner stdIn new Scanner(System.in);
		
		physcDate[] x = {
				
			new physcDate("������", 162, 0.3),
			new physcDate("������", 173, 0.7),
			new physcDate("������", 175, 2.0),
			new physcDate("ȫ����", 172, 1.5),
			new physcDate("�̼���", 168, 0.4),
			new physcDate("�迵��", 174, 1.2),
			new physcDate("�ڿ��", 169, 0.8),
			
		};
		
		int[] vdist = new int[VMAX]; 
		
		System.out.println(" �� ��ü�˻� ����Ʈ ��");
		System.out.println("�̸�      Ű    �÷�");
		System.out.println("-------------------");
		
		for( int i = 0; i < x.length; i++ ) {
			
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		}
		
		System.out.printf("\n��� Ű : %5.1fcm\n", aveheight(x));
		
		distvision(x, vdist);
		
		System.out.println("\n�÷º���");
		
		for( int i = 0; i < VMAX; i++ ) {
			
			System.out.printf("%3.1f ~ :", i / 10.0);
			
			for( int j = 0; j < vdist[i]; j++ ) 
				
				System.out.print('*');
					
			System.out.println();
		}
	}
}
