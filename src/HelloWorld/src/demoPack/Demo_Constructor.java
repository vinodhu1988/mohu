package demoPack;

public class Demo_Constructor 
{

	public static void main(String[] args)
	{
		Calculator c=new Calculator();
		int a=c.add(10, 20, "----addition");
		int b=c.sub(40, 20, "----subtraction");
		int c1=Calculator.mul(20, 10, "multiplication");
		
		System.out.println(a+" "+b+" "+c1);
	
	}
}
class Calculator
{
	public int add(int a,int b,String s)
	{
	int c=a+b;
	return c;
	}
	public int sub(int a,int c,String s)
	{
	int d=a-c;
	return d;
	}
	public static int mul(int a,int b,String s)
	{
	int m=a*b;
		return m;
	}
	public static void div(int a,int b,String s)
	{
	int m=a/b;
		System.out.println(m);
	}
	Calculator()
	{
		System.out.println("addition of 2 numbers with int return type");
		System.out.println("SUbtraction of 2 numbers with int return type");
		System.out.println("multiplication of 2 numbers with int return type with static");
		System.out.println("division of 2 numbers with int return type with static");

	}
}
