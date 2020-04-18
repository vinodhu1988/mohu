package demoPack;

public class Method_Overloading
{

	public static void main(String[] args) 
	{
		System.out.println("this is method overloading");
		Method_Overloading mo=new Method_Overloading();
		mo.add();
		mo.add(40, 50);

	}
	public void add()
	{
		int a=10,b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b)
	{
			int c=a+b;
		System.out.println(c);
	}


}
