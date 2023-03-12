package Inheritance;

public class MethodCalling {

	public static void main(String[] args) {
		BMW b1 = new BMW();
		b1.start(10); //Method Overridden
		b1.stop(); //Inheritance
		b1.refuel(); //Inheritance
		b1.autoParking(); //Individual 
		
		Car c1 = new Car();
		c1.start(0);
		c1.stop();
		Car c2 = new BMW();
		 

	}

}
