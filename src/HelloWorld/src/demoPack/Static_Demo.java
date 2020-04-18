package demoPack;

public class Static_Demo {

	public static void main(String[] args) {
		Three t1=new Three();
		
		t1.method3();
		
		Three.method4("vinodh");
		
		System.out.println(t1.method5());
		String s1 = t1.method5();
		
		
	

	}
}
	
	
	 class Three{
		public void method3(){
			System.out.println("this is method 3");
		}
		public static void method4(String s1) {
			System.out.println(s1+"---this is my name");
				}
		public String method5() {
			String s2="my name is vinodh";
			return s2;		}
	


	

}
