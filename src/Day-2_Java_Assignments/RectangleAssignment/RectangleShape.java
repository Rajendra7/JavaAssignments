import java.util.*;
public class RectangleShape {
private double length;
private double breadth;

public RectangleShape(double length, double breadth) {
	super();
	this.length = length;
	this.breadth = breadth;
}

	public RectangleShape() {
	super();
	
}

	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getBreadth() {
		return breadth;
	}
	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}
	public double getArea()
	{
		double area;
		area=getLength()*getBreadth();
		return area;
	}
	public double getPerimeter() {
		double perimeter;
		perimeter=2*(getLength()+getBreadth());
		return perimeter;
	}
	/*public static boolean areaComaparator(double g,double getArea2)
	{
		boolean flag=false;
		if(getArea==getArea2)
			flag=true;
		else
			flag=false;
		return flag;
	}*/

	

	public static boolean areaComaparator(double area, double area2) {
		boolean flag = false;
		if(area == area2)
			flag = true;
		else
			flag = false;
		
		return flag;
	}
	
}
