package demoPack;

public class Static_Overloading 
{

	public static void main(String[] args)
	{
		int x=Static_Overload.vinodhAdd();
		System.out.println("first method    =    "+x);
		
		int y=Static_Overload.vinodhAdd(30, 50);
	}

}

class Static_Overload
{
	public static int vinodhAdd()
	{
		int a=10;
		int b=20;
		int c=a+b;
		return c;
	}
		
	
	public static int vinodhAdd(int a, int b)
	{
		int c=a+b;
		System.out.println("second method   =  "+c);
		return c;
	}
}
