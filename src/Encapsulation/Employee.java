package Encapsulation;

public class Employee {
	
	private String name;
	private int age;
	private double salary;
	private boolean isActive;
	private String Gender;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {                                                                             
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	
	
	public void getEmployeeInfo() {
		
		System.out.println(getName());
		System.out.println(getName() + " " +getAge()  + " " +getSalary()+ " " + isActive()+ " " +getGender());
		
	}
	
	
	
	
	

}
