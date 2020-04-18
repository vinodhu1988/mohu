package demopack1;

import demopack2.Fifteen;
import demopack2.Fourteen;

public class DemoCall
{

	public static void main(String[] args)
	{
		Thirteen t1=new Thirteen();
		System.out.println("Thirteen is a class in same package demopack1 but in different class");
		t1.banglore();
		t1.chennai();
		 
		Fourteen f1=new Fourteen();
		System.out.println("Fouteen is a class in different package so we have to import to this class");
		f1.hyd();
		f1.vizag();
		
		Fifteen f2=new Fifteen();
		System.out.println("Fifteen is a class in different package so we have to import to this class");

		f2.pune();
		f2.delhi();
		

	}

}
