package demoPack;

public class Class_Methods {

	 

	public static void main(String[] args) {
		
		One o1=new One();
		o1.method1();
		o1.method2();
		Two t1=new Two();
		t1.method3();
		t1.method4("vinodh");
		System.out.println(t1.method5());
		String s1 = t1.method5();
		String s2=" upadrista";
		System.out.println(s1+s2);
		
		
	

	}
}
	
	class One{
	public void method1() {
		System.out.println("this is method1");
	}
	public void method2() {
	System.out.println("this is method2"); 
	}
	}
	
	class Two{
		public void method3(){
			System.out.println("this is method 3");
		}
		public void method4(String s1) {
			System.out.println(s1+"---this is my name");
				}
		public String method5() {
			String s2="my name is vinodh";
			return s2;		}
	}
