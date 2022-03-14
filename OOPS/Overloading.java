package OOPS;

public class Overloading {
	
	static int method(int a, int b)
	{
	return a+b;
	}
	static double method(double a, double b)
	{
		return a+b;
	}
	

	public static void main(String[] args) {
		int num1= method(7,8);
		double num2=method(1.1,2.2);
		System.out.println("int:"+num1);
		System.out.println("double:"+num2);
		
		
	}

}
