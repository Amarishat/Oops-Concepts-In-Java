package OOPS;

public class Recursion {

	public static void main(String[] args)
	{
		int result=sum(10
				);
		System.out.println(result);
	}
	public static int sum(int a)//a=10.a=9
	{
		if(a>0)
		{
			return a+sum(a-1);//a+sum(9)+sum(8)  //10+9+8+.....0
			
		}
		else {
			return 0;
		}
		
		// TODO Auto-generated method stub

	}

}
