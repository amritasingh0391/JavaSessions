package SeleniumSessions;

public class LoopsAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1.
		int i = 1;

		while (i <= 9) {
			System.out.println("I am Batman" + " " + i);
			i++;
		}

		// 2. WAP to print 10 to 1 using for, while and do-while loop

		int num = 10;

		while (num >= 1) {
			System.out.println(num);
			num--;
		}

		// 3. Write a program in Java to print "Hello World" ten times using while loop

		int n = 1;

		while (n <= 10) {
			System.out.println("Hello World");
			n++;
		}

		// 4. Write a program in Java to print 1 to 10 using while loop

		int p = 1;

		while (p <= 10) {
			System.out.println(p);
			p++;
		}

		// 5. print all odd and even numbers between 1 to 100

		int number = 1;

		while (number <= 100) {

			if (number % 2 == 0) {
				System.out.println(number + " " + "Even Number");
			}

			else {
				System.out.println(number + " " + "Odd Number");
			}

			number++;
		}

		// 6. What will be the output of this program:

		int q = 1;

		while (q <= 1) {

			System.out.println("Hi Java");
			q++;
		}

		// 7. Print A-Z , a-z, 0-9 with the respective ASCII numbers the console one
		// using while.

		char c = 'A';

		while (c <= 'Z') {
			System.out.println((int) c + ":ASCII Vlaue " + c);
			c++;
		}

		char c1 = 'a';
		while (c1 <= 'z') {
			System.out.println((int) c1 + ":ASCII Vlaue " + c1);
			c1++;
		}

		char c2 = '0';
		while (c2 <= '9') {
			System.out.println((int) c2 + ":ASCII Vlaue " + c2);
			c2++;
		}
		// 8.Print the following series: 1.0 2.0 3.0  ...... 10.0 

		float j = 1.0f;

		while (j <= 10.0) {
			System.out.println(j);
			j++;
		}
		// 9. Print the following series:0 5 10 15 20 25 …. 100

		int k = 0;

		while (k <= 100) {
			if (k % 5 == 0) {
				System.out.println(k);
			}
			k++;

		}

		// 10.Print only vowels (aeiou) using for while loop. Start the loop from ‘a‘ to
		// ‘z‘.

		char c4 = 'a';

		while (c4 <= 'z') {

			if (c4 == 'a') {
				System.out.println("Print only vowels:");
				System.out.println(c4);
			}
			if (c4 == 'e') {
				System.out.println(c4);
			}
			if (c4 == 'i') {
				System.out.println(c4);
			}
			if (c4 == 'o') {
				System.out.println(c4);
			}
			if (c4 == 'u') {
				System.out.println(c4);
			}
			c4++;

		}

		// 11.Print 1 to 10 and break the loop once you find the multiplication of 7
		// with a message "bye, see you tomorrow".

		int L = 1;

		while (L <= 10) {

			System.out.println(L);

			if (L % 7 == 0) {
				System.out.println("bye, see you tomorrow");
				break;
			}
			L++;

		}
		// 12. Write a cricket score card system using for and while loops:

		int score = 0;

		while (score <= 100) {

			if (score == 0) {
				System.out.println(score + ": " + "Zero - duck");
			}

			if (score == 25) {
				System.out.println(score + ": " + "good job");
			}

			if (score == 50) {
				System.out.println(score + ": " + "good job - half century");
			}

			if (score == 100) {
				System.out.println(score + ": " + "good job - century");
			}
			
			score++;

		}
		
	
	}
}
