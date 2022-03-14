package INTERFACE;

import java.util.Scanner;

public class Example1 {
	

	public static void main(String[] args) {
	
		Scanner s=new Scanner(System.in);
		System.out.println("Enter The Name");
		String name=s.next();
		System.out.println("Enter The Id");
		int id=s.nextInt();
		System.out.println("Enter The Total");
		int total=s.nextInt();
		Student1 st=new Student1();
		st.detail(name,id);
		st.total(total);
	}

}
interface rank{
	public void detail(String name,int id);
}
interface total{
	public void total(int total);
	
}
class Student1 implements rank,total
{
	public void detail(String name,int id)
	{
		System.out.println("Name"+name);
		System.out.println("Studentt Id"+id);
	}
		public void total(int total)
		{
			System.out.println("total"+total);
		}
		}
	
