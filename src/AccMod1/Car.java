package AccMod1;

public class Car {
	
	public String name ="BMW";
	private String color ="White";
	protected int price = 11000000;
	String seller ="Car dekho";

	public void m1() {
		System.out.println("m1 method");
	}
	
	private void m2() {
		System.out.println("m2 method");
	}
	
	protected void m3() {
		System.out.println("m2 method");
	}
	
	void m4() {
		System.out.println("m4 method");
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		System.out.println(c.name);
		System.out.println(c.color);
		System.out.println(c.price);
		System.out.println(c.seller);
		c.m1();
		c.m2();
		c.m3();
		c.m4();
		

	}

}
