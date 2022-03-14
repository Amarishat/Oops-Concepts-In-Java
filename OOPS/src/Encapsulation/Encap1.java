package Encapsulation;

import java.util.Scanner;

public class Encap1 {
	public static void main(String[] args) {
		
		
		Scanner s=new Scanner(System.in);
		Ticket t=new Ticket();
		System.out.println("Enter Price of Ticket");
		t.setPrice(s.nextInt());
		int t1=t.getPrice();
		
		
		
		System.out.println("Enter Number of Person");
		t.setPerson(s.nextInt());
		int n1=t.getPerson();
		int i=1;
		int sum=t1*n1;
		
		do {
			
		
		
		System.out.println("Enter Details of Person"+i);
		
		
		System.out.println("Enter the Name");
		t.setName(s.next());
		
		System.out.println("Enter  Gender (M/F");
		t.setGender(s.next());
		
	    System.out.println("Enter the Age");
	    t.setAge(s.nextInt());
	    i++;
	    n1--;
		}
		while(n1!=0);
		
			
		
		
		System.out.println("Ticket Details Are....");
		System.out.println(" Persons"+t.getPerson());
		System.out.println(" Price of ticket");
		System.out.println(" Total price "+sum);
		

}
}