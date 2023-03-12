package Inheritance;

public class Apollo extends Hospital{

	@Override
	public void  doctorList() {
		System.out.println("Apollo hospital Doctor list");
	}
	
	@Override
	public void hospitalizePatient() {
		System.out.println("All the Hospitalized Patient list of Apollo");
	}
	
	public void releasePatient() {
		System.out.println("Release patient list of Apollo Hospital");
	}
	
	//Method Hiding 
	public static void PatientInfo() {
		System.out.println("Hopital Patient Info List");
	}
	

	
}
