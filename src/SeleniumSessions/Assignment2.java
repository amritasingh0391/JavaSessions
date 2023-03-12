package SeleniumSessions;

public class Assignment2 {
	/*
	 * 2.Print the following series: 
	 * 
	 * 1.0 2.0 3.0  ...... 10.0 
	 * 
	 * 0 5 10 15 20 25 …. 100
	 */

	public static void main(String[] args) {

		float i;
		int j;
		for (i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		
		System.out.println();

		for (j = 0; j <= 100; j++) {
			if (j % 5 == 0) {
				System.out.print(j + " ");
			}
		}
		
		System.out.println();
		
		/*
		 * 3. Write a Java program to divide two numbers and print on the screen.
		 * Test Data: 50/3
		 */
		
		int a = 50;
		int b = 3;
		double d ;
		
		d = a/b;
		System.out.println(d);
		
		

	}

}
