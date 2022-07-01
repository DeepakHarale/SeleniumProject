package Multilevel;

public class ClassC extends ClassA{

	public static void main(String[] args) {
		
		
		ClassA obj = new ClassA();
		obj.add();
		
		ClassC obj1 = new ClassC();
		
		obj1.add();
		
		
	}
	
	public void C1() {
		System.out.println("parent");
	}
	
	
	
	public void add() {
		System.out.println("parent");
	}
}
