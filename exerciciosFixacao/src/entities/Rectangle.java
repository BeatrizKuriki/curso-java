
package entities;

public class Rectangle {
	public double width;
	public double height;
	
	public double perimeter() {
		return (width + height)*2;
	
		
	}
	
	public double area() {
		double area  = width * height;
		return area;
	}
	
	public double diagonal() {
		double diagonal = Math.sqrt(width*width + height * height);
		return diagonal;
	}

}
