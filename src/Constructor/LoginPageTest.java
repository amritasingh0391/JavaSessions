package Constructor;

public class LoginPageTest {

	public static void main(String[] args) {
		LoginPage lp = new LoginPage("amritasingh0391@gmail.com", "ami@1234");
		System.out.println(lp.userName);
		System.out.println(lp.password);
		lp.doLogin();
		lp.restPassword();
	}

}
