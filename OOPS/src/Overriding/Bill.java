package Overriding;

import java.util.Scanner;

public class Bill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	System.out.println("              Enter Telephone Bill Details ");
	System.out.println("-------------------------------------------");
	System.out.println(" Enter Telephone Bill Number");
    int a=s.nextInt();
    System.out.println(" Enter Customer Name");
    String b=s.next();
    System.out.println(" Enter The Number Of Calls Made");
    int c=s.nextInt();
    System.out.println(" Enter The Cost Per Call");
    int d=s.nextInt();
    
    System.out.println();
    System.out.println("              Enter Current Bill Details      ");
	System.out.println("--------------------------------------------- ");
	System.out.println(" Enter Current Bill Number");
    int e=s.nextInt();
    System.out.println(" Enter Customer Name");
    String f=s.next();
    System.out.println(" Enter The Number Of Units Made");
    int g=s.nextInt();
    System.out.println(" Enter The Cost Per Units");
    int h=s.nextInt();
    TelephoneBill tb=new TelephoneBill();
    CurrentBill cb=new CurrentBill();
    tb.Bill(a, b, c,d);
    cb.Bill(e, f, g,h);
    }

}

class TelephoneBill extends Bill{
	
	public void Bill(int a,String b,int c,int d) {
		System.out.println(" Telephone Bill Details");
		System.out.println("------------------------");
		
		
		System.out.println("Bill Number"   +a);
		System.out.println("Customer Name" +b);
		
		int cost=c*d;
		System.out.println("Telephone Bill Cost" +cost);
		
		
	}
}

class CurrentBill extends Bill{
	public void Bill(int e,String f,int g,int h) {
		System.out.println(" Current Bill Details");
		System.out.println("------------------------");
		
		
		System.out.println("Bill Number"   +e);
		System.out.println("Customer Name" +f);
		
		int cost=g*h;
		System.out.println("Current Bill Cost" +cost); 
		
		
		
	
	}}
	
	
	
	