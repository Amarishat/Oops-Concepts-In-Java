package OOPS;

public class ObjectAndClass {

	public static void main(String[] args) {
	
		System.out.println("Royal Challengers Bangalore");
		Example obj=new Example();//obj create//
		obj.display();
		System.out.println(obj.a);
		
	}

}
class Example {//create a new class//
	public int a=99;
	public void display() {
		System.out.println(" RCB");//print statement//
	}
	
}

