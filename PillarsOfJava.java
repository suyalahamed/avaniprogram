/**
 * 
 */
package com.suyal;
import java.util.*;

/**
 
	 * this is one program which implements object orientation
	 * encapsulation inheritance abstraction and polymorphism 
 
 */

  abstract class Shape{    //abstract class to achive polimorphism
	    float area;
	    public abstract void acceptInput();
	    public abstract void compute();
	    public abstract void disp();
	    
  }
  
  
final class Square extends Shape{//inheritance
	private float length;   // encapsulation
	float area;
	public void acceptInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of square");
	      length = sc.nextFloat();
	}
	public void compute() {
	      area =length*length;
	
	}
	public void disp() {
		System.out.println(area);
	}
}

final class Rectangle extends Shape{
	private float length,breath;
	float area;
	public void acceptInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter length of rect");
	      length = sc.nextFloat();
	      System.out.println("enter breath of rect");
	      breath=sc.nextFloat();
	}
	public void compute() {
		area =length*breath;
	
	}
	public void disp() {
		System.out.println(area);
	}
}



final class Circle extends Shape{
	private float radius;
	float area;
	public void acceptInput(){
		Scanner sc = new Scanner(System.in);
		System.out.println("enter radius of circ");
	      radius = sc.nextFloat();
	}
	public void compute() {
		 area =(float) (3.14*radius*radius);
	
	}
	public void disp() {
		System.out.println(area);
	}
}
class Geomentry{
	
	public void permit (Shape ref)  //loose coupling to achieve polimorphism
	{
		ref.acceptInput();
		ref.compute();
		ref.disp();
	}
}

public class PillarsOfJava {

	/**
	 */
	public static void main(String[] args) {
		Square s= new Square();
		Rectangle r= new Rectangle();
		Circle c = new Circle();
		Geomentry g =new Geomentry();
		g.permit(s);
		g.permit(r);
		g.permit(c);
		System.out.println("thank you for using our application");

	}

}
