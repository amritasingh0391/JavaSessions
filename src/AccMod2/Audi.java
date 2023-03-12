package AccMod2;

import AccMod1.Car;

public class Audi extends Car{

	public static void main(String[] args) {
		
		Audi a = new Audi();
		System.out.println(a.name);
		System.out.println(a.price);
		a.m1();
		a.m3();

	}

}
