package com.suyal;

public class StringEquals {

	public static void main(String[] args) {
		String a="Avani";
		String b="Avani";
		String c=new String("Avani");
		String d=new String("Avani");
		
		System.out.println(a==b);//it compares reference here reference is same because of object in constant pool
		System.out.println(a.equals(b));//String class this method is ovrrided to compare contents
		System.out.println(a==c);//different reference a in constant pool and c in Heap region
		System.out.println(c==d);//two diff object in heap
		System.out.println(c.equals(d));//contents compared
		

	}

}
