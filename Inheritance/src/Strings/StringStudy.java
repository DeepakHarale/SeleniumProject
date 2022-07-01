package Strings;

public class StringStudy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name1 ="Anuja";
		
		String n1 = "Anuja";
		
		System.out.println(name1.length());
		
		System.out.println(name1.toUpperCase());
		

		System.out.println(name1.toLowerCase());
		
		if (name1.equals(n1)) {
			
			System.out.println("It is equals string");
			
		}
		else {
			
			System.out.println("It is not equals string");
		}
		
		
		System.out.println("*********************Non constant pool area*******************");
		String name = new String("Deepak");
		
		String n2 = new String("DEEPAK");
		
		System.out.println(name.length());
		
		System.out.println(name.toUpperCase());
		
		System.out.println(name.toLowerCase());
		
if (name.equals(n2)) {
			
			System.out.println("It is equals string");
			
		}
		else {
			
			System.out.println("It is not equals string");
		}

    System.out.println(n2.equalsIgnoreCase(name));
    
    System.out.println("+++++++++Contains");
    System.out.println(name.contains("eep"));
    
    String empty = "hii";
    
    String blank = null;
    
    System.out.println(empty.isEmpty());
//    System.out.println(blank.isBlank());
    
    System.out.println(name.charAt(4));
    System.out.println(name.endsWith("ak"));
    
    System.out.println(name.startsWith("Dee"));
    
    System.out.println(name.substring(2));
    
    System.out.println(name.concat(empty));
    System.out.println("+++++++++count");
    System.out.println(name.indexOf('k'));
    System.out.println(name.lastIndexOf('e'));
    System.out.println(name.replace('k', 'T'));
    
    String break1 = "My , Deepak";
    
    System.out.println(break1.split(","));
    
	}
	
	

}
