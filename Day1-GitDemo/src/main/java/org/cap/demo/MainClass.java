package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		SalesClass class1=new SalesClass();
		ProfitClass profit=new ProfitClass();
		System.out.println("Hello World!!");
		greet();
		class1.show();
		profit.showProfit();
	}
	
	public static void greet() {
		System.out.println("Good Morning!!");
		System.out.println("Welcome to Git Hub.");
		System.out.println("This is your first project.");
	}

}
