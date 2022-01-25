package org.string;

public class StringTypes 
{
	public static void main(String[] args) 
	{ 
   /////////  LITERAL AND IMMUTABLE STRING  /////// 
		String s = "java";
		System.out.println(s);
		int identityHashCode = System.identityHashCode(s);
		System.out.println(identityHashCode);

		String s1 = "java";
		System.out.println(s1);
		int identityHashCode1 = System.identityHashCode(s1);
		System.out.println(identityHashCode1);
		
		String s2 = "PYTHON";
		System.out.println(s2);
		int identityHashCode2 = System.identityHashCode(s2);
		System.out.println(identityHashCode2);
		
		
	    String concat = s1.concat(s2);
	    System.out.println(concat);
	    int identityHashCode3 = System.identityHashCode(concat);
	    System.out.println(identityHashCode3);
		
	}
}
