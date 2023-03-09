package ex2;

public class ex2 {
    static double sumArea (GeoShape s1,GeoShape s2,GeoShape s3)
    {
  	  return s1.area()+s2.area()+s3.area();
    }
	public static void main(String[] args) 
	{
      Rectangle r=new Rectangle(1,4);
      Circle c=new Circle(7);
      Triangle t=new Triangle(4,3);
      
      
      System.out.println(sumArea(r,c,t));
	}

}
abstract class GeoShape{
GeoShape(double dim1)
{
this.dim1=dim1;
}
private double dim1;
public abstract double area();
public void setDim1(double dim1) 
{
	this.dim1=dim1;
}
public double getDim1() {
	return dim1;
}

}
class Rectangle extends GeoShape{
 private double dim2;
 Rectangle(double dim1, double dim2)
 {
	 super(dim1);
	 this.dim2=dim2;
 }

 public double getDim2()
 {
		return dim2;
 }

 public void setDim2(double dim2)
 {
		this.dim2 = dim2;
 }
 public double area() {
	return getDim1()*dim2;
}
}
class Circle extends GeoShape{
	Circle(double dim1){
		super(dim1);
	}
	public double area() {
		return Math.PI*getDim1()*getDim1();
	}
}
class Triangle extends GeoShape{
	private double dim2;
	
	Triangle(double dim1 ,double dim2){
		super(dim1);
		this.dim2=dim2;
	}
	public double area() {
		return getDim1()*dim2;
	}
	public double getDim2() {
		return dim2;
	}
	public void setDim2(double dim2) {
		this.dim2 = dim2;
	}
}
