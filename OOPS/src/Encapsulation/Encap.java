package Encapsulation;

import java.util.Scanner;

public class Encap {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Student st=new Student();
		System.out.println("Enter the Name");
		st.setName(s.next());
		System.out.println("Enter the Id");
		st.setId(s.nextInt());
	    System.out.println("Enter the Depmt");
	    st.setDepmt(s.next());
		System.out.println("name "+st.getName());
		System.out.println("Id "+st.getId());
		System.out.println("Depmt"+st.getDepmt());
		

	}

}
