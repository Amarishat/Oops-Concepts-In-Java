package SingleInheritance;

public class Example {

	public static void main(String[] args) {
		B obj=new B();
		obj.display();
		obj.datatype();
	}
	}
	class A
	{
		public static void datatype()
		{
			System.out.println("int");
		}
	}
	class B extends A
	{
	int a;
	public static void display()
	{
		System.out.println("RCB");
	}
	}
		// TODO Auto-generated method stub

	


