package demoPack;

public class If_Shortcut
{

	public static void main(String[] args)
	{
	String name1="vinodh";	
	String name2="vinodh";
	boolean status=name1.equals(name2);
	if(status)
	{
		System.out.println("Both the strings are same");
	}
	else
	{
		System.out.println("Both the strings are not same");
	}
	
	if(!status)
	{
		System.out.println("Both the strings are same");
	}
	else
	{
		System.out.println("Both the strings are not same");
	}
	
	}

}
