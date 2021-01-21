package com.suyal;
class Students{
	 String name;
	    double height;
		String place;
		static int count;
		{//no of objects created each time it is called non static block
			count++;
		}
	
}
public class CountObjectsCreated {

	public static void main(String[] args) {
	  Students s1=new Students();
	  Students s2= new Students();
	  Students s3= new Students();
	  System.out.println("no of objects created ="+Students.count);

	}

}
