package Inheritance;

public class Max extends Hospital {

	@Override
	public void doctorList() {
		System.out.println("Max Doctor list");
	}
	
	@Override
	public void registerDoctor() {
		System.out.println("Max Register Doctor");
	}
	
	public void PatientList() {
		System.out.println("Max hospital Patients List");
	}
}
