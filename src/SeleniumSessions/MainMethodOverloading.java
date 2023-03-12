package SeleniumSessions;

public class MainMethodOverloading {
	

	public static void main(String[] args) {
		System.out.println("Main method");
		MainMethodOverloading.main(0);
		MainMethodOverloading.main("Naveen");
		MainMethodOverloading.main(0, 0);
		//MainMethodOverloading.main(args);
	}
	
	public static void main(String i) {
		System.out.println("1 parm" + " " + i);
	}

	public static void main(int i) {
		System.out.println("1 parm" + " " +i);
	}
	
	public static void main(int i, int j) {
		System.out.println("2 parm"+ " "  + i + " " + j);
	}
	
	
}
