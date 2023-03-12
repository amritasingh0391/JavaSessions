package DynamicArray;

import java.util.ArrayList;

public class ArrayListGenerics {

	public static void main(String[] args) {
		
		ArrayList<String> ar = new ArrayList<String>();
		ar.add("Naveen");
		ar.add("Amrita");
		ar.add("Ashutosh");
		ar.add(null);
		System.out.println(ar);
		System.out.println(ar.get(0));
		System.out.println(ar.get(1));
		System.out.println(ar.get(2));
		
		System.out.println("***ArrayList***");
		for(int i=0; i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("***ArrayList***");
		for(String e: ar) {
			System.out.println(e);
		}
	}

}
