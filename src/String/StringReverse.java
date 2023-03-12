package String;

public class StringReverse {
	
	public static String reverseString(String name) {
		
		//null check
		if (name == null) {
			System.out.println("null is not allowed.... please provide the right value");
			return null;
		}
		int len = name.length()-1;
		//length check
		if(len== 1) {
			return name;
		}
		String rev = "";
		for(int i =len ; i>= 0 ; i--) {
			rev = rev + name.charAt(i);
		}
		return rev;
		
	}

	public static void main(String[] args) {
		String r1 =  reverseString("Selenium");
		System.out.println(r1);
		
		String r2 =  reverseString("Selenium Automation");
		System.out.println(r2);
		
		String r3 =  reverseString("N");
		System.out.println(r3);
		
		String r4 =  reverseString("123");
		System.out.println(r4);
		
		String r5 =  reverseString("45556");
		System.out.println(r5);



	}

}
