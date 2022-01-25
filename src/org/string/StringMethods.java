package org.string;
public class StringMethods 
{
	public static void main(String[] args) 
	{    //         0123456789
		String s = "welcome to java class";
	System.out.println(s);
	
	int a = s.length();
	System.out.println(a);
	
	boolean b = s.startsWith("welocme");
    System.out.println(b);	
	
    boolean c = s.endsWith("class");
    System.out.println(c);
	
    String upperCase = s.toUpperCase();
	System.out.println(upperCase);
	
	String lowerCase = s.toLowerCase();
	System.out.println(lowerCase);
	
	int indexOf = s.indexOf("o");
	System.out.println(indexOf);
	
	int indexOf2 = s.indexOf("f");
	System.out.println(indexOf2);
	
	int indexOf3 = s.indexOf("a");
	System.out.println(indexOf3);
	
	int lastIndexOf = s.lastIndexOf("a");
	System.out.println(lastIndexOf);
	
    char charAt = s.charAt(3);
    System.out.println(charAt);
     
    boolean empty = s.isEmpty();
    System.out.println(empty);
    
    boolean contains = s.contains("k");
    System.out.println(contains);
    
    String substring = s.substring(3);
    System.out.println(substring);
    
    String substring1 = s.substring(3,15);
    System.out.println(substring1);
	}

}
