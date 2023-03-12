package DynamicArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Customer {

	public static void main(String[] args) {
		
		List<String> ar = new ArrayList<String>();
		ar.add("100");
		ar.add("200");
		ar.add("300");
		ar.add("400");
		System.out.println(ar);
		Collections.reverse(ar);
		System.out.println(ar);
		Collections.sort(ar);
		System.out.println(ar);
		Collections.swap(ar, 2, 3);
		System.out.println(ar);
		ar.remove(3);
		System.out.println(ar);
		System.out.println(ar.get(2));
		System.out.println(ar);
		List<String> browserList = Arrays.asList("chrome", "firefox", "Mozilla", "Safari","IE");
		System.out.println(browserList.size());
		
	}
	

}
