package demoPack;

public class Constructor_Overloading
{

	public static void main(String[] args)
	{
		new ConstructorOverload ();
		new  ConstructorOverload (10,10);

	}

}

class ConstructorOverload 
{
	ConstructorOverload()
	{
		
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println("addition of two numbers = "+c);
	}
	
	ConstructorOverload(int a, int b)
	{
		
		int c=a*b;
		System.out.println("multiplication of two numbers = "+c);
	}
}
