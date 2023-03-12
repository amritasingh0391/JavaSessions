package DynamicArray;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		
		HashMap<String,String> empData = new HashMap<String,String>();
		empData.put("Naveen", "SDET");
		empData.put("Amrita", "SDET");
		empData.put("Ravi", "Software Manager");
		empData.put("Ashutosh", "Project Manager");
		empData.put("Rashmi", "Software Engineer");
		System.out.println(empData);
		System.out.println(empData.get("Ashutosh"));

	}

}
