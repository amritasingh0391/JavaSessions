package Constructor;

public class Employee {
	String name;
	String employeeId;
	String department;
	int age;

	public Employee(String name, int age) {

		this.name = name;
		this.age = age;
	}

	public Employee(String name1, String employeeId1, int age1) {
		
		this.name = name1;
		this.employeeId = employeeId1;
		this.age = age1;

	}

	public Employee(String name, String employeeId, String department, int age) {
		
		this.name = name;
		this.employeeId = employeeId;
		this.department = department;
		this.age = age;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee("Amrita", 20);
		System.out.println(e1.name + " " + e1.age);

		Employee e2 = new Employee("Naveen", "23101", 25);
		System.out.println(e2.employeeId + " " + e2.age);
		

		Employee e3 = new Employee("Rashmi", "23102", "CS", 24);
		System.out.println(e3.name + " " + e3.employeeId + " " + e3.department + " " + " " + e3.age);

	}

}
