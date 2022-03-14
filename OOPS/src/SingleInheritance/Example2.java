package SingleInheritance;

import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println(" Enter Your Name");
    String name=s.next();
    System.out.println(" Enter Your Age");
    int age=s.nextInt();
    System.out.println(" Enter Your Dept");
    String dept=s.next();	
    
    registration obj=new registration();
    System.out.println("Enter Your Mark");
    int M1=s.nextInt();
    System.out.println("Enter Your Mark");
    int M2=s.nextInt();
    System.out.println("Enter Your Mark");
    int M3=s.nextInt();
   
    obj.reg(name,age,dept);
    obj.mark(M1,M2,M3);


	}

}
      class Student
      {
    	  
       public static void mark(int m1, int m2, int m3)
      
      {
    	  System.out.println("mark1="+m1 );
    	  System.out.println("mark2="+m2);
    	  System.out.println("mark3="+m3);
    	  int total=m1+m2+m3;    
      }
       }
       
      class registration extends Student
      {
    	  public static void reg(String name,int age,String dept)
    	  {
    		  System.out.println("Student Details");
    		  System.out.println("----------------");
    		  System.out.println( "name=" +name);
    		  System.out.println( "name=" +age);
    		  System.out.println( "name=" +dept);  
      }
    	  
      }