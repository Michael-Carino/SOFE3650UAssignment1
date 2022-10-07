package Store;

public class prodFactory extends abstractFactory {
	
	@Override
	public groceryProd getgroceryProd(String prodInfo) {
		if(prodInfo.equalsIgnoreCase("BANANA")) {
			return new banana();
		}
		else if(prodInfo.equalsIgnoreCase("APPLE")) {
			return new apple();
		}
		return null;
	}
}
