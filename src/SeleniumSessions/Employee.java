package SeleniumSessions;

public class Employee {

	// class variables

	String Name;
	int age;
	String city;
	double salary;

	public static void main(String[] args) {

		Employee e = new Employee();
		e.Name = "Tom";
		e.age = 25;
		e.city = "Noida";
		e.salary = 15.25;

		System.out.println(e.Name + " "+  e.age + " "+ e.city + " " + e.salary);
		
		//Employee e1 = new Employee();
		//e1= null; //Null reference object
		//System.out.println(e1); 
		//System.out.println(e1.Name); //NullPointer Exception
		//System.out.println(e1.age);
		//System.out.println(e1.city);
		//System.out.println(e1.salary);
		
		// object without references - No ref object
				new Employee().Name = "Naveen";
				new Employee().age = 25;
				new Employee().salary = 12.33;
				new Employee().city = "Pune";
				
				System.out.println(new Employee().age);

	}

}
