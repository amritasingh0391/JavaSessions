package Inheritance;

public class BMW extends Car{
	
	@Override
	public void start(int a) {
		System.out.println("Car --- Start" + " " + a );
	}
	
	
	public void autoParking() {
		System.out.println("Car --- AutoParking");
	}

}
