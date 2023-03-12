package Constructor;

public class LoginPage {

	String userName;
	String password;
	
	public LoginPage(String un, String pwd) {
		System.out.println("Constructor with 2 parms");
		this.userName = un;
		this.password = pwd;
	}
	
	public boolean doLogin() {
		System.out.println("Enter the username" + " " + userName);
		System.out.println("Enter the username" + " " + password);
		System.out.println("Click on login button");
		System.out.println("user is logged in");
		return true;
	}
	
	public void restPassword() {
		System.out.println("Rest the password" + " " + password);
		
	}

}
