package Constructor;

public class BrowserTest {

	public static void main(String[] args) {
		
		String[] plugin = { "Google Docs Offline", "My App Start", "Email Assistant", "My App Search" };

		Assignment_Browser AB = new Assignment_Browser("Chrome", "108.0.5359.125 ", plugin);
		AB.getName();
		AB.getVersion();
		AB.getPlugin();

	}

}
