/*
 * File       :abstraction.java
 * Description:Java program to implement abstraction
 * Author     :Emitta Mathew
 * Version    :1.0
 * Date       :20/10/23
 *              
 */
package javalab;

public class abstraction {
	public static void main(String [] args) {
		
		Rectangle rectangle=new Rectangle();
		Triangle triangle=new Triangle();
		Hexagon hexagon=new Hexagon();
	    rectangle.numberOfSides();
	    triangle.numberOfSides();
	    hexagon.numberOfSides();
	}
}
abstract class Shapes{
	abstract public void numberOfSides();	
}
  class Rectangle extends Shapes{
	  public void numberOfSides() {
	  System.out.println("The number of sides of rectangle is 4");
	  }
  }
  class Triangle extends Shapes{
	  public void numberOfSides() {
		  System.out.println("The number of sides of triangle is 3");
	  }
  }
  class Hexagon extends Shapes{
	  public void numberOfSides() {
		  System.out.println("The number of sides of hexagon is 6");
	  }
  }
