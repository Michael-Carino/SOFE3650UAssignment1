package Store;

public class generator {
	public static abstractFactory getFactory(boolean rounded) {
		if (rounded) {
			return null;
		}
		else {
			return new prodFactory();
		}
	}

}
