package com.suyal;

public class StringBuilderMethods {
public static void main(String[] args) {
	StringBuilder sb= new StringBuilder("suyal");
	System.out.println(sb.capacity());
	System.out.println(sb.length());
	System.out.println(sb.charAt(4));
	System.out.println(sb.append(true));
	System.out.println(sb.insert(1, false));
	System.out.println(sb.replace(1, 5, "suyal"));
	System.out.println(sb.replace(0,15,"suyalahamed"));
	System.out.println(sb.reverse());
	System.out.println(sb.reverse());
	System.out.println(sb.delete(0, 4));
	System.out.println(sb.deleteCharAt(0));
	
	
}
}
