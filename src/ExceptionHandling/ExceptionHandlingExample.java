package ExceptionHandling;

public class ExceptionHandlingExample {
	String Name = "Naveen";
	public static void main(String[] args) {
		
		try {
		int data[] = new int[5];
		 data[5]  = 50/0;
	     System.out.println("rest of the code");  
		}
		catch(ArithmeticException e) {
			System.out.println("AE is coming");
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("AIOB is coming");
			e.printStackTrace();
		}

		ExceptionHandlingExample eh = new ExceptionHandlingExample();
		try {
		eh = null;
		System.out.println(eh.Name);
	     System.out.println("rest of the code");  
		}
		catch (NullPointerException e) {
			System.out.println("Null Pointer Exception is coming");
			e.printStackTrace();
		}
		
		finally {  
			System.out.println("finally block is always executed");  
			}    
	
		
		

	}

}
