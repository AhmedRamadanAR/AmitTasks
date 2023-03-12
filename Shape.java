package Task2;
import java.util.ArrayList;

interface Shape {

public void draw();
public double getArea();
}
class Circle implements  Shape{
	public double dim1;
	public Circle(double dim1) 
	{
		this.dim1=dim1;
	}
 public double getArea() {
	 return Math.PI*dim1*dim1;
 }
 public void draw() {
	 System.out.println("this is Circle");
 }
}
class Rectangle implements  Shape{
	public double length;
	public double width;
	public Rectangle(double length,double width) 
	{
		this.length=length;
		this.width=width;
		
	}
	 public double getArea() {
		 return length*width;
	 }
	 public void draw() {
		 System.out.println("this is Rectangle");
	 }
}
class Triangle implements  Shape{
	public double base;
	public double height;
	public Triangle(double base,double height)
	{
		this.base=base;
		this.height=height;
	}
	 public void draw() {
		 System.out.println("this is Triangle");
	 }
	 public double getArea() {
		 return 1/2*base*height;
	 }
	 
}
class main{
	static  double sumAreas(Shape s1,Shape s2,Shape s3)
	 {
		return s1.getArea()+s2.getArea()+s3.getArea();
	 }
	public void Main() {
		ArrayList<Shape> shape = new ArrayList<Shape>(); 
		Rectangle r=new Rectangle(1,6);
		Circle c=new Circle(2);
		Triangle t=new Triangle(2,5);
		System.out.println(sumAreas(c,r,t));
		shape.add(r);
		shape.add(c);
		shape.add(t);
		for(Shape s :shape) 
		{
			s.draw();
		}
			
		
		
	}
 }
