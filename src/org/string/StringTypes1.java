package org.string;
public class StringTypes1
{
	public static void main(String[] args)
	{
////////NON LITERAL AND MUTABLE STRING  /////// 
String s=new String ("java");                                    
System.out.println(s);
int identityHashCode = System.identityHashCode(s);
System.out.println(identityHashCode);

String s1=new String ("java");
System.out.println(s1);
int identityHashCode2 = System.identityHashCode(s1);
System.out.println(identityHashCode2);

String s2=new String ("python");
System.out.println(s2);
int identityHashCode3 = System.identityHashCode(s2);
System.out.println(identityHashCode3);

StringBuffer s3=new StringBuffer ("java");
System.out.println(s3);
int identityHashCode4 = System.identityHashCode(s3);
System.out.println(identityHashCode4);

StringBuffer s4=new StringBuffer ("java");
System.out.println(s4);
int identityHashCode5 = System.identityHashCode(s4);
System.out.println(identityHashCode5);

StringBuffer s5=new StringBuffer ("python");
System.out.println(s5);
int identityHashCode6 = System.identityHashCode(s5);
System.out.println(identityHashCode6);

StringBuffer append = s4.append(s3);
System.out.println(append);
int identityHashCode7 = System.identityHashCode(append);
System.out.println(identityHashCode7);
   
	}
}
