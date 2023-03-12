package SeleniumSessions;

public class Car {

	String name;
	String color;
	int price;
	static final int wheel = 4;
	
	public static void speedTest() {
		System.out.println("Car --- SpeedTest");
	}
	
	public static void start() {
		System.out.println("Car --- start");
	}
	
	

	public static void main(String[] args) {

		//1. direct calling:
		System.out.println(wheel);
		speedTest();
		start();
		
		
		//2. by using class name:
		System.out.println(Car.wheel);
		Car.speedTest();
		Car.start();

		Car c1 = new Car();
		c1.name = "BMW";
		c1.color = "blue";
		c1.price = 40;
		
		Car c2 = new Car();
		c2.name = "Audi";
		c2.color = "blue";
		c2.price = 30;
		
		Car c3 = new Car();
		c3.name = "Honda";
		c3.color = "White";
		c3.price = 20;
		
		System.out.println(c1.name + " " + " " + c1.color + " "+ c1.price);
		System.out.println(c2.name + " " + " " + c2.color + " "+ c2.price);
		System.out.println(c3.name + " " + " " + c3.color + " "+ c3.price);
	}

}
