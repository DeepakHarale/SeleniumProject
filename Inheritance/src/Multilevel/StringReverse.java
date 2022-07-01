package Multilevel;

public class StringReverse {
	
	public static void main(String[] args) {
		
		String name = "Vishal";
		StringBuilder obj = new StringBuilder(name);
		
		obj.reverse();
		
		String name1 = obj.toString();
		
		System.out.println(name1);
		
	}

}
