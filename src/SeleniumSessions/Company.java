package SeleniumSessions;

public class Company {

	String Name;
	int empCount;
	String hq;
	boolean status;

	public static void main(String[] args) {

		System.out.println(new Company().Name = "TCS");
		System.out.println(new Company().empCount = 1000);

		Company obj = new Company();
		obj.Name = "IBM";

		System.out.println(obj.Name);
		System.out.println(obj.status);

	}

}
