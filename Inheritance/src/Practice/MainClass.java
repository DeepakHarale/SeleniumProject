package Practice;

import Multilevel.ClassA;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		ClassA d =new ClassA();
//		d.P1();
		
		custmer e = new custmer();
//		e.P1();
		e.Bike();
		
		customer2 B = new customer2();
		B.Bike();
		B.Laptop();
		
		customer3 C =new customer3();
	
		C.Bike();
		C.Laptop();
		C.Watch();
		
		MainClass d1 = new MainClass(2);
		MainClass d3 = new MainClass(2);
		MainClass d2 = new MainClass(2,3);
		 
	}

	
	public MainClass() {
		System.out.println("hi");
		
	}
	
public MainClass(int a) {
		
		
	}


public MainClass(int b, int c) {
	
	
}
	
}
