package INTERFACE;

public class Example2 {

	public static void main(String[] args) {
		
	Cube s1=new Cube();
	System.out.println("The Area of Cube is "+s1.Area());
	System.out.println("The Volume of Cube is "+s1.Volume());
	Circle s2=new Circle();
	System.out.println("The Area of Cirlce is "+s2.Area());
	System.out.println("The Volume of Circle is "+s2.Volume());
	

	}

}
class Cube implements Shape
{
	int x=10;
	public double Area()
	{
		return(6*x*x);
		
	}
	public double Volume()
	{
		return(x*x*x);
		
	}
}
class Circle implements Shape
{
	int radius =10;
	public double Area()
	{
		return (Math.PI*radius*radius);
	}
	public double Volume()
	{
		return 0;
	}
}
