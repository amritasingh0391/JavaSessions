package Inheritance;

public class TestHospital {

	public static void main(String[] args) {

		//1. Child class Object

		Apollo Ap = new Apollo();
		
		System.out.println("*********Apollo Hospital***********");
		Ap.doctorList(); //Method override 
		Ap.registerDoctor(); // inherited method
		Ap.releasePatient(); // Individual method
		Ap.hospitalizePatient(); //Method override
		Ap.PatientInfo(); //Method Hiding 
		
		
		//2. Child class Object
		
		Fortis Fo = new Fortis();
		System.out.println("*********Fortis Hospital***********");
		Fo.doctorList(); //Method override
		Fo.hospitalizePatient(); // inherited method
		Fo.registerDoctor(); //Method override
		Fo.retrieveDoctorInfo(); //Individual method
		
		
		//3. Child class Object
		
		Max Mx = new Max();
		System.out.println("*********Max Hospital***********");
		Mx.doctorList(); //Method override
		Mx.hospitalizePatient(); // inherited method
		Mx.registerDoctor(); //Method override
		Mx.PatientList(); //Individual method
		
		//4. Parent class object
		
		Hospital Hs = new Hospital();
		System.out.println("*********Hospital***********");
		Hs.doctorList();
		Hs.hospitalizePatient();
		Hs.registerDoctor();
		
		// Top Casting : Child class object can be referred by the parent class reference variable
		
		Hospital Hs1 = new Apollo ();
		System.out.println("*********Top Casting***********");
		Hs1.doctorList();
		Hs1.hospitalizePatient();
		Hs1.registerDoctor();
	
	
		//Hs1.releasePatient();  type cast check
		
		//Down Casting : Parent Class object can be referred by the child class reference variable (Class Cast Exception)
		
		//Apollo Ap1 = (Apollo)new Hospital();
		//Ap1.doctorList();
		
		
	
		
		

	}

}
