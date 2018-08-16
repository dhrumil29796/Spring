package ex3;

public class ResourceProvider { // singleton  //default singleton
	public ResourceProvider() {
		System.out.println("Provider constructor");
	}

	private static ResourceProvider provider;

	public static ResourceProvider getProvider() {    
		System.out.println("Provider Singleton");
		if (provider == null) {
			provider = new ResourceProvider();

		}
		return provider;

	}
}
