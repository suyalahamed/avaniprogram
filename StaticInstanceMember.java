package com.suyal;

public class StaticInstanceMember {
 
	   String name="Full Creative";// instance member
	   String location="chennai";//instance member
	   static int no_of_employees=1000;//static instance member
	   
	   public void details()
	   {
		   System.out.println(name+" located in "+location+" with capacity of "+no_of_employees+" employees");
	   }
	   
	public static void main(String[] args) {
		StaticInstanceMember f1= new StaticInstanceMember();//object created of f1
		f1.details();
		no_of_employees=1005;//5 new employees joinned 
		StaticInstanceMember f2=new StaticInstanceMember();
		f2.details();
		no_of_employees=1010;//totally 10 new employees joinned
		StaticInstanceMember f3= new StaticInstanceMember();
		f3.details();
		no_of_employees=2000;//totally 1000 new employees joinned
		// no of employees changed in all objects
		f1.details();
		f2.details();
		f3.details();
		

	}

}
