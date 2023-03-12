package SeleniumSessions;

public class MethodInJava {

	// 1. no input and no return:

	public void test() {
		System.out.println("Test Method");
		int a = 10;
		int h = 20;
		System.out.println(a+h);
	}
	
	//2. no input and some return:
		//return type: int
	
	public int getBillAmount() {
		System.out.println("get billing amount");
		int foodbills = 100;
		int drinkbills =120;
		int total = foodbills+drinkbills;
		return total;
		
	}
	

	public static void main(String[] args) {
		MethodInJava obj = new MethodInJava();
		obj.test();
		
		int m = obj.getBillAmount();
		System.out.println(m);
	}

}
