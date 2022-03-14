package OOPS;

import java.util.Scanner;

public class Add {
	public static void myMethod() {
		System.out.println(" Executed ");
	}

	public static void main(String[] args) 
	{
	myMethod();//calling a method myMethod()//
	
	Scanner s=new Scanner(System.in);
	System.out.println(" Enter first number");
	int a=s.nextInt();
	
	System.out.println(" Enter second number");
	int b=s.nextInt();
	
	int result=add(a,b);
	System.out.println("a+b="+result);
	}
	public static int add(int a,int b)
	{
		return a+b;
	}
	
}
