package Strings;

public class MyString {

	
static	String d = "Production is";
	
	public static void main(String[] args) {
		
		String a = "deepak";
		String b ="harale";
		
		
		System.out.println(a.length());
		System.out.println(a.toUpperCase());
		System.out.println(a.compareToIgnoreCase(b));
		System.out.println(b.charAt(3));
		System.out.println(a.concat(b));
		System.out.println(a.codePointAt(5));
		System.out.println(d.indent(2));
		System.out.println(d.indexOf('o'));
		System.out.println(d.indexOf('d'));
		System.out.println(d.stripTrailing());
	}
}
