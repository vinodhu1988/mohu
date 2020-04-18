package demoPack;

public class Multiple_Intheritance
{

	public static void main(String[] args) 
	{
		Child_Class c1=new Child_Class();
		System.out.println("this is child class");
		c1.banglore();
		c1.chennai();
		c1.hyd();
		c1.vizag();
		c1.delhi();
		c1.pune();
		
		Parent_Class p1=new Parent_Class();
		System.out.println("this is parent class");
		p1.vizag();
		p1.hyd();
		p1.pune();
		p1.delhi();
		
		Grand_Parent_Class g1=new Grand_Parent_Class();
		System.out.println("this is grand parent class");
		g1.delhi();
		g1.pune();

	}
}
	class Child_Class extends Parent_Class
	{
		public void banglore()
		{
			System.out.println("this is banglore");
		}
		public void chennai()
		{
			System.out.println("this is chennai");
		}
	}
	
	class Parent_Class extends Grand_Parent_Class
	{
		public void vizag()
		{
			System.out.println("this is vizag");
		}
		public void hyd()
		{
			System.out.println("this is hyderabad");
		}
	}

	class Grand_Parent_Class
	{
		public void pune()
		{
			System.out.println("this is pune");
		}
		public void delhi()
		{
			System.out.println("this is delhi");
		}
	}



