



package com.suyal;

//constructer is used to initialize instance members on creating objects
class Student{
	    String name="suyal";
	    double height=6.3;
		String place="krishnagiri";
	    String talent="coding";

	    @Override
	    public String toString() {

	    	return name+" "+height+" "+place+" "+talent;}
	    public void finalize() //its a method where garbage collector calls
	    { 
	        System.out.println("finalize method overriden"); 
	    } 
	    	

	}


public class FinalFinallyFinalize {
	
	
	public static void main(String[] args) {
		Student st=new Student();
		
		System.out.println(st);
		final int a=10;
		int b=0;
		//a=20;// if you assign or change any value to final it will throw exception
		System.out.println(a);
		try {
			int c=a/b;
		} catch (Exception e) {

			System.out.println(e);
		}
		finally {   //mainly used to close the open resources
			System.out.println("finally executed");
		}
		
		System.out.println("program compleated");
		//before terminating garbage collector calls finalize method to close all resources before deleting object
		
	}

}
