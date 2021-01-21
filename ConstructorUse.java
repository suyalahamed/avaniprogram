package com.suyal;

//constructer is used to initialize instance members on creating objects
class Student{
	    String name;
	    double height;
		String place;
	    String talent;
 public Student(String name,double height, String place ,String talent){
		this.height=height;
		this.place=place;
		this.talent=talent;
		this.name= name;
		
	}
 @Override
public String toString() {
   
return name+" "+height+" "+place+" "+talent;
}

	}



public class ConstructorUse {

	public static void main(String[] args) {
		Student st1= new Student("suyal",6.3,"krishnagiri","coding");
	     System.out.println(st1);   

	}

}
