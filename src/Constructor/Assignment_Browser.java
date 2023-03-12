package Constructor;

import java.util.Arrays;

public class Assignment_Browser {
	
	private String name;
	private String version;
	public String [] plugin ;

	public Assignment_Browser(String name, String version, String[] plugin) {
		this.name = name;
		this.version = version;
		this.plugin = plugin;
	}

	public String getName() {
		System.out.println(name);
		return name;
		
	}
	public void setName(String name) {
	 this.name = name;
	}

	public String getVersion() {
		System.out.println(version);
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String[] getPlugin() {
		System.out.println("plugin:" + Arrays.toString(plugin));
		return plugin;
	}

	public void setPlugin(String[] plugin) {
		this.plugin = plugin;
	}


}
