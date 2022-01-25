package org.string;

public class StringMethods1
{
	public static void main(String[] args) 
	{
		String s = "welcome to java class"; 
		String s1 = "Welcome to java class";
	    String s2 = "   Welcome to paython class   ";
		System.out.println(s);
		System.out.println(s1);
        System.out.println(s2);
        
       boolean equals = s.equals(s1);
       System.out.println(equals);
       
       boolean equalsIgnoreCase = s.equalsIgnoreCase(s1);
       System.out.println(equalsIgnoreCase);
       
       String concat = s.concat(s2);
       System.out.println(concat);
       
       String trim = s2.trim();
       System.out.println(trim);
       
	}
}
