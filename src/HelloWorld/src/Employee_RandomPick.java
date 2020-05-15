package com.Static.pack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Employee_RandomPick {

	public static void main(String[] args) {
		Employee_Data emp1=new Employee_Data();
		Employee_Data emp2=new Employee_Data();
		Employee_Data emp3=new Employee_Data();
		Employee_Data emp4=new Employee_Data();
		Employee_Data emp5=new Employee_Data();
		Employee_Data emp6=new Employee_Data();
		Employee_Data emp7=new Employee_Data();
		Employee_Data emp8=new Employee_Data();
		Employee_Data emp9=new Employee_Data();
		Employee_Data emp10=new Employee_Data();
		
		
		Employee_Data emp11=new Employee_Data();
		Employee_Data emp12=new Employee_Data();
		Employee_Data emp13=new Employee_Data();
		Employee_Data emp14=new Employee_Data();
		Employee_Data emp15=new Employee_Data();
		
		
		
		emp1.setName("vinodh");		emp1.setMobileNumber("7303351");		emp1.setSalary(100100);		emp1.setId(1);
		
		emp2.setName("vinodh1");	emp2.setMobileNumber("73033523");		emp2.setSalary(102000);		emp2.setId(12);
		
		emp3.setName("vinodh2");	emp3.setMobileNumber("7303354");		emp3.setSalary(100300);		emp3.setId(13);
		
		emp4.setName("vinodh3");	emp4.setMobileNumber("7303355");		emp4.setSalary(100500);		emp4.setId(14);
		
		emp5.setName("vinodh4");	emp5.setMobileNumber("7303356");		emp5.setSalary(1003000);	emp5.setId(15);
		
		emp6.setName("vinodh5");	emp6.setMobileNumber("7303357");		emp6.setSalary(103000);		emp6.setId(16);
		
		emp7.setName("vinodh6");	emp7.setMobileNumber("7303358");		emp7.setSalary(104000);		emp7.setId(71);
		
		emp8.setName("vinodh7");	emp8.setMobileNumber("7303359");		emp8.setSalary(105000);		emp8.setId(18);
		
		emp9.setName("vinodh8");	emp9.setMobileNumber("7303135");		emp9.setSalary(1006700);	emp9.setId(19);
		
		emp10.setName("vinodh9");	emp10.setMobileNumber("7303305");		emp10.setSalary(100800);	emp10.setId(10);
		
		
		ArrayList<Employee_Data> al=new ArrayList<>();
		al.add(emp1);
		al.add(emp2);
		al.add(emp3);
		al.add(emp4);
		al.add(emp5);
		al.add(emp6);
		al.add(emp7);
		al.add(emp8);
		al.add(emp9);
		al.add(emp10);
		/*
		al.add(new Employee_Data("Vinodh",1,10000,"730335"));
		al.add(new Employee_Data("Sarath",3,20000,"732335"));
		al.add(new Employee_Data("Naidu",4,40000,"630335"));
		al.add(new Employee_Data("Madhu",2,30000,"830335"));
		al.add(new Employee_Data("Bhaskar",5,50000,"930335"));
		al.add(new Employee_Data("Mohu",7,70000,"030335"));
		al.add(new Employee_Data("Guru",6,60000,"130335"));
		al.add(new Employee_Data("Munni",8,1000,"230335"));
		al.add(new Employee_Data("Swapna",0,100000,"330335"));
		al.add(new Employee_Data("Raj",9,90000,"430335"));
		*/
		
		LinkedList<Employee_Data> ll=new LinkedList<Employee_Data>();
		
		emp11.setName("vinodh11");		emp1.setMobileNumber("73033115");		emp1.setSalary(1011000);		emp1.setId(111);
		
		emp12.setName("vinodh12");		emp2.setMobileNumber("73031135");		emp2.setSalary(1012000);		emp2.setId(161);
		
		emp13.setName("vinodh13");		emp3.setMobileNumber("73120335");		emp3.setSalary(1013000);		emp3.setId(113);
		
		emp14.setName("vinodh14");		emp4.setMobileNumber("73130335");		emp4.setSalary(1001400);		emp4.setId(121);
		
		emp15.setName("vinodh15");		emp5.setMobileNumber("7303315");		emp5.setSalary(1150000);		emp5.setId(115);
		
		
		/*
		ll.add(0,new Employee_Data("Raghu",10,1000100,"7130335"));
		ll.add(1,new Employee_Data("Sachin",13,202000,"7323351"));
		ll.add(2,new Employee_Data("Dravid",41,410000,"6303315"));
		ll.add(3,new Employee_Data("Virat",22,310000,"8303315"));
		ll.add(4,new Employee_Data("Lara",51,520000,"9303135"));
		*/
		ll.addAll(al);
		//int sz=ll.size();
		//Employee_Data empData=new Employee_Data();
		//for(int i=0;i<=sz-1;i++) 
		
			if(emp1.getName().equals("vinodh")) {
				System.out.println(emp1.getId()+" "+emp1.getMobileNumber()+" "+emp1.getSalary());
		
		}
	
	}

}
