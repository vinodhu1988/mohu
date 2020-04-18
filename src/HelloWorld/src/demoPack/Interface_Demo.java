package demoPack;

public class Interface_Demo
{

	public static void main(String[] args)
	{
	Interface_Class ic=new Interface_Class();
	ic.display();
	ic.display(40, 50);
	}
}
	interface Demo_Interface
	{
		public void display();
	}
	
	class Interface_Class implements Demo_Interface
	{
		public void display(int a, int b) 
		{
		int c=a+b;
			System.out.println(c);
		}

		@Override
		public void display() {
			
			int a=10;
			int b=20;
			int c=a+b;
			System.out.println(c);
					
		}
	}


