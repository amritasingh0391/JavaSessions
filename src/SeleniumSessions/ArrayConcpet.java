package SeleniumSessions;

import java.util.Arrays;

public class ArrayConcpet {

	public static void main(String[] args) {

		int i[] = new int[4];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i.length);
		System.out.println(i[0]);
		System.out.println(i[2]);
		// System.out.println(i[4]); AIOB
		// System.out.println(i[-4]); AIOB
		System.out.println("---------");

		// to print all the values from array:
		// index based loop:;

		for (int k = 0; k <= i.length - 1; k++) {
			System.out.println(i[k]);
		}
		// to print all the values from array without loop:

		System.out.println("---------");
		System.out.println(Arrays.toString(i));

		// for each:
		System.out.println("---------");
		for (int e : i) {
			System.out.println(e);
		}

		// 2. double array:

		double d[] = new double[4];

		d[0] = 12.22;
		d[1] = 23.44;
		d[2] = 34.55;
		d[3] = 45.66;
		System.out.println("---------");
		System.out.println(d[0] + d[1]);

		// char:

		char ch[] = new char[4];
		ch[0] = 'a';
		ch[1] = '1';
		ch[2] = '$';
		ch[3] = 'd';
		System.out.println("---------");
		System.out.println(ch.length);
		for (int m = 0; m <= ch.length - 1; m++) {
			System.out.println(ch[m]);
		}
		for (char e : ch) {
			System.out.println(e);
		}

		// String array:
		String lang[] = new String[4];
		lang[0] = "Java";
		lang[1] = "Python";
		lang[2] = "JavaScript";
		lang[3] = "DotNet";

		System.out.println("---------");

		for (String e : lang) {
			System.out.println(e);
			if (e.equals("Java")) {
				System.out.println("I Love Java");
			}
			if (e.equals("JavaScript")) {
				System.out.println("I Hate JavaScript");
			}
		}

		// Object Array:

		Object emp[] = new Object[4];

		emp[0] = "Rishmi";
		emp[1] = 25;
		emp[2] = 15.23;
		emp[3] = "f";

		System.out.println("-----");
		for (Object e : emp) {
			System.out.println(e);
		}

		for (int n = 0; n <= emp.length - 1; n++) {
			System.out.println(emp[n]);
		}

		// array literals:

		int num[] = { 11, 2, 3, 4, 5, 654, 30, 25 };
		System.out.println(Arrays.toString(num));

		Object data[] = { "macbook", 1000, 23.44, 'g', true };
		for (Object e : data) {
			System.out.println(e);
		}
		System.out.println(Arrays.toString(data));

	}
}
