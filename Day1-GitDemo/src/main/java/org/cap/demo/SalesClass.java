package org.cap.demo;

public class SalesClass {
	
	int[] array= {1,2,3,-55,87};

	public void show() {
		for(int num:array) {
			System.out.println(num);
		}
		SalesDetails salesD=new SalesDetails();
		salesD.details();
		
	}
}
