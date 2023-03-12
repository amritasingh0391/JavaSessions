package Encapsulation;

public class Application {

	String name;

	public void m1(String name1) {
		this.name = name1;
		System.out.println("m1 metthod");
		System.out.println(name1);
		m3();
		t1();
	}

	public void m2() {
		System.out.println("m2 metthod");
	}

	public void m3() {
		System.out.println("m3 metthod");
	}
	
	public static void t1() {
		Application a1 = new Application();
		a1.m2();
		System.out.println("t1 method");
		Application.t2();
	}

	public static void t2() {
		System.out.println("t2 method");
	}
	
	public static void main(String[] args) {
		
		Application app = new Application();
		System.out.println(app.name);
		app.m1("Amrita");
		System.out.println(app.name);
		
	}

}
