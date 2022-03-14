package Polymorphism;

import java.util.Scanner;

public class OverLoading {

	public static void main(String[] args) {
		
	shop a=new shop();
	a.display();
	}

}
class shop {
	public void display() {
		Scanner s=new Scanner(System.in);
		
		System.out.println("                   Collections                     ");
		System.out.println();
		
		System.out.println("********************************************************* ");
		System.out.println("    Mens Wear     ||    Ladies Wear      ||    Kids Wear  |");
		System.out.println("----------------------------------------------------------|");
		System.out.println("    1- Shirts     | 6-    Tops           | 11-   Pants    |");
		System.out.println("    2- T Shirts   | 7-    Skirts         | 12-   Shorts   |");
		System.out.println("    3- Jeans      | 8-    Gown           |                |");
		System.out.println("    4- Jackets    | 9-    Kurti          |                |");
		System.out.println("    5- Hoodies    | 10-   Saree          |                |");
		System.out.println("----------------------------------------------------------|");
		
		System.out.println();
		
		System.out.println("         Select A Dress      ");
		
		int a=s.nextInt();
		coll c=new coll();
		c.show(a);
		c.show();
		
        
            
		}
		
	}
class coll{
	public void show(int a) {
		switch(a)
		{
		case 1:
			System.out.println("Shirt Price:999");
			break;
		case 2:
			System.out.println("T Shirt Price:999");
			break;
		case 3:
			System.out.println("");
		}
	}
	public void show() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Bill Amount");
		int b=sc.nextInt();
		System.out.println("Total Amount "+b);
		}
	
}
	


