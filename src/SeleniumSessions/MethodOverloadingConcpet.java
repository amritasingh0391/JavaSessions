package SeleniumSessions;

public class MethodOverloadingConcpet {
	// 0 Param
	public void test() {
		System.out.println("Test method with 0 Param");
	}

	// 1 Param
	public void test(int i) {
		System.out.println("Test method with 1 Param" + " " + i);
	}

	// 1 Param
	public void test(String i) {
		System.out.println("Test method with 1 Param" + " " + i);
	}
	
	// 1 Param
	public void test(float f) {
		System.out.println("float value"  + f);
	}

	public void test(double f) {
		System.out.println("double value" + f);

	}

	// 2 Param
	public void test(int i, int j) {
		System.out.println("Test method with 2 Param" + " " + i + " " + j);
	}

	// 2 Param
	public void test(String i, String j) {
		System.out.println("Test method with 2 Param" + " " + i + " " + j);
	}

	// 2 Param
	public void test(String i, int j) {
		System.out.println("Test method with 2 Param" + " " + i + " " + j);
	}

	// 2 Param
	public void test(int i, String j) {
		System.out.println("Test method with 2 Param" + " " + i + " " + j);
	}
	
	

	public static void main(String[] args) {
		MethodOverloadingConcpet MOL = new MethodOverloadingConcpet();
		MOL.test();
		MOL.test(1);
		MOL.test("AMI");
		MOL.test(10, 20);
		MOL.test("AMI", "Naveen");
		MOL.test(30, "Amrita");
		MOL.test("Amrita", 30);
		MOL.test(0f);
		MOL.test(0.0);
	}

}
