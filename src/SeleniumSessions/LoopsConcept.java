package SeleniumSessions;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1 to 10
		//1. while
		
		int i = 1;
		
		while (i<=10) {
			System.out.println(i);
			i=i+1;
			
		}
		
		//Welcome to Taj Hotel
		
		while(true) {
			System.out.println("Welcome to Taj Hotel");
			break;
		}
		// Odd numbers
		
		int p=1;
		System.out.println("Odd Numbers:");
		while(p<=100) {
			
			System.out.println(p);
			p= p+2;
			
		}
		
		//
		
		int num =1;
		
		while(num<=100) {
			System.out.println(num);
			if (num % 5 == 0) {
				System.out.println("HI");
				break;
			}
			num++;
		}
		
		// Print name 5 time 
		
		int n = 1;
		
		while(n<=5) {
			System.out.println("Amrita");
			n++;
		}
		
		//
		int counter =100;
		
		while(counter >= 100) {
			System.out.println(counter);
			if (counter == 200) {
				System.out.println("BYE");
				break;
			}
			counter++;
		}

	}

}
