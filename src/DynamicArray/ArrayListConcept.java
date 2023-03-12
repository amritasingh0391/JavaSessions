package DynamicArray;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		
		ArrayList ar = new ArrayList();
		ar.add("Naveen");
		ar.add("Rabina");
		ar.add("Rashmi");
		System.out.println(ar);
		System.out.println(ar.get(1));
		System.out.println(ar.size());
		System.out.println("***** ArrayList*****");
		for(Object e: ar) {
			System.out.println(e);
		}
		
		System.out.println("***** ArrayList*****");
		for(int i=0; i<ar.size();i++) {
			
			System.out.println(ar.get(i));
			
		}
		
	}

}
