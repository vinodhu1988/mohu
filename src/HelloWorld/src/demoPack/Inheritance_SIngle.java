package demoPack;

public class Inheritance_SIngle
{

	public static void main(String[] args)
	{
		ChildClass c1=new ChildClass();
		System.out.println("Child class starts");
		c1.banglore();
		c1.chennai();
		c1.hyd();
		c1.vizag();
		ParentClass p1=new ParentClass();
		System.out.println("parent class starts");
		p1.hyd();
		p1.vizag();

	}
	
}
class ChildClass extends ParentClass
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

class ParentClass
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
