package com.suyal;

public class StringMethods {

	public static void main(String[] args) {
		String s1="RajaRamMohanRoy";
		String s2="  suy al  ";
		System.out.println(s1.charAt(5));
		System.out.println(s1.concat("Rama"));
		System.out.println(s1);
		System.out.println(s1.equals("RajaRamMohanRoy"));
		System.out.println(s1.equalsIgnoreCase("rajarammohanroy"));
		System.out.println(s1.isEmpty());
		System.out.println(s1.length());
		System.out.println(s1.replace('a', 'o'));
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.substring(2));
		System.out.println(s1.substring(2, 9));
		System.out.println(s1.subSequence(2, 9));
		System.out.println(s1.lastIndexOf('o'));
		System.out.println(s1.indexOf('R'));
		System.out.println(s2.trim());
		System.out.println(s1.startsWith("Raja"));
		System.out.println(s1.endsWith("Roy"));
		System.out.println(s1.contains("Ram"));
		System.out.println(s1);
		

	}

}
