package Abstraction;

import java.util.Scanner;

public class StudentReg {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Registration");
		
		System.out.println(" Enter Your Name");
		String name=s.next();
		System.out.println(" Enter Your Age");
		int age=s.nextInt();
	
		System.out.println(" Enter Your Address");
		String address=s.next();
		System.out.println(" Contact Number");
		int contactnumber=s.nextInt();
		System.out.println(" E-Mail ID");
		String email=s.next();
		
		Registration r=new Registration();
		r.display(name, age, address, contactnumber, email);
		r.update(name, age, address, contactnumber, email);
		
		

	}

}
