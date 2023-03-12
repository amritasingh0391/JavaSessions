package Assignment;

public class PositiveNegativeNumber {

	public static void main(String[] args) {
		
		// Write a Java program to test a number is positive or negative.
		
		int num1 = 10;
		int num2 = 0;
		
		if (num1 > 0  && num2 < 0) {
			System.out.println("Positive Number: "+ num1 +  " " + "Negative Number: " + num2 );
		}
		
		else if(num1 < 0 && num2 >0){
			System.out.println("Negative Number: " + num1 + " " +"Positive Number: "+ num2);
		}
		
		else if(num1 < 0 && num2 < 0){
			System.out.println("Negative Number: " + num1 + " " +"Negative Number: "+ num2);
		}
		
		else if(num1 > 0 && num2 > 0){
			System.out.println("Positive Number: " + num1 + " " +"Positive Number: "+ num2);
		}
		
		else  {
	   System.out.println("Both number positive: " + num1 +" " + num2);
		}

	}

}
