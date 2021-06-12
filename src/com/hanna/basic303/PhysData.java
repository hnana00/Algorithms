package com.hanna.basic303;

import java.util.Comparator;


public class PhysData {
	private String name;
	private int height;
	private double vision;
	
	//생성자
	public  PhysData(String name, int height,double vision) {
		
		this.name = name;
		this.height = height;
		this.vision = vision;
	}

	public String toString() {
		
		return name + " " + height + " " + vision;
	}
	
	public static final Comparator<PhysData> HEIGHT_ORDER = 
			new HeightOrderComparator();
	
	// 비교하는 방법을 정의한 메소드
	// Comparator 상속 받은 후
	// compare 를 @Override 했다.
	private static class HeightOrderComparator implements Comparator<PhysData> {

		@Override
		public int compare(PhysData d1, PhysData d2) {
			return (d1.height > d2.height) ? 1 :
				   (d1.height < d2.height) ? -1 : 0;
		}
		
	
	}
}
