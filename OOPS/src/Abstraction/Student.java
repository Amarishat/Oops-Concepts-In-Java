package Abstraction;

import java.util.Scanner;

abstract public class Student {
	Scanner s=new Scanner(System.in);
	
abstract void display(String name,int age,String address,int contactnumber,String email);
public void update(String name,int age,String address,int contactnumber,String email)

{
System.out.println(" Thank You For Registration");
int i=1;
System.out.println(" Your Registration Id is "+i);
System.out.println(" Do You Want To Update Your E-Mail");
System.out.println(" y-yes/n-no");
String str=s.next();
if(str.equals("y")==true)
{
	System.out.println("Update Email");
	System.out.println("Enter New Email");
	String email1=s.next();
	System.out.println("New email Created is"+email1);
	System.out.println("Student Detail");
	System.out.println("name"+name);
	System.out.println("name"+age);
	System.out.println("name"+address);
	System.out.println("contactnumber"+contactnumber);
	System.out.println("email1"+email1);

	

	
}
else
	
{
	return;
	
}

}





}
