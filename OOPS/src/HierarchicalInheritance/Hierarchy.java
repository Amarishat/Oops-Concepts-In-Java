package HierarchicalInheritance;

import java.util.Scanner;

import MultiLevelInheritance.Stud;

public class Hierarchy {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		System.out.println(" Enter Name");
		String n=s.next();
		Stud ob=new Stud();
		ob.about();
		ob.princi();
		ob.teach();
		ob.details(n);

	}

}
