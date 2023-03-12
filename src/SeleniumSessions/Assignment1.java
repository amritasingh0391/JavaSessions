package SeleniumSessions;

public class Assignment1 {

	/*
	 * 1.WAP to find out the max number from the given three different positive
	 * numbers. num1 = 100 num2 = 200 num3 = 300
	 */
	int num1 = 100;
	int num2 = 200;
	int num3 = 300;

	public void maxNumber() {
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("num1 is the max number" + " " + num1);
		} else if (num2 >= num1 && num2 >= num3) {
			System.out.println("num2 is the max number" + " " + num2);
		} else if (num3 >= num1 && num3 >= num2) {
			System.out.println("num3 is the max number" + " " + num3);
		}

	}
	
	public void minNumber() {
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("num1 is the min number" + " " + num1);
		} else if (num2 <= num1 && num2 <= num3) {
			System.out.println("num2 is the min number" + " " + num2);
		} else if (num3 <= num1 && num3 <= num2) {
			System.out.println("num3 is the min number" + " " + num3);
		}

	}

	public static void main(String[] args) {
		Assignment1 as = new Assignment1();
		as.maxNumber();
		as.minNumber();

	}

}