package Polymorphism;

import java.util.Scanner;

public class MethodOverloading {

	public static void main(String[] args) {
	
	Scanner s=new Scanner(System.in);
	System.out.println(" Enter 1 Number");
	int a1=s.nextInt();
	System.out.println(" Enter 2 Number");
	int a2=s.nextInt();
	System.out.println(" Enter 3 Number");
	int a3=s.nextInt();
	sum a=new sum();
	a.add(a1, a2, a3);
	a.add(a1,a2);
	a.add(a1);	
	}

}
 class sum {

	public void add(int a1, int a2, int a3) {
		
	System.out.println("sum(a1+a2+a3)="+(a1+a2+a3));
	
	}

	public void add(int a1,int a2) {
		System.out.println("sum(a1+a2)="+(a1+a2));
		
	}

	public void add(int a1) {
		System.out.println("sum(a1)="+(a1));	
			}
		
	}

