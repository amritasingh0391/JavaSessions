package Arrays;

public class NumbersOfElement {
	
	public static void main(String[] args) {
		
		int a[] = {1,2,3,4,5};
		
		int Count = 0;
		int i;

		for(i=0 ; i< a.length; i++) {
			Count++;
		}
		
		System.out.println("Number of elements in array:" + " "+ Count);

	}
	

}
