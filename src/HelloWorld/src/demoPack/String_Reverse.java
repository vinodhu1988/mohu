package demoPack;

public class String_Reverse {

	public static void main(String[] args) {

		String s1="HELLO WORLD";
		System.out.println(s1.length());
		char[] c=s1.toCharArray();
		System.out.println(c[0]);
		for(int i=s1.length()-1;i>=0;i--) {
			System.out.print(c[i]);
			
		}
			

	}

}
