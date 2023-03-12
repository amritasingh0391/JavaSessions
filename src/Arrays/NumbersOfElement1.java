package Arrays;

public class NumbersOfElement1 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };

		int Count = 0;
		int i =0;
		
		while (i < a.length) {
			i++;
			Count++;
		}
		System.out.println("Number of elements in array:" + " "+ Count);
		

	}

}
