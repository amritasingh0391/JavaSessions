package Inheritance;

public class Fortis extends Hospital{

	@Override
	public void  doctorList() {
		System.out.println("Fortis Doctor list");
	}
	
	@Override
	public void registerDoctor() {
		System.out.println("Fortis Register Doctor");
	}
	
	public void retrieveDoctorInfo() {
		System.out.println("Fortis Hospital Doctor infomation");
	}
}
