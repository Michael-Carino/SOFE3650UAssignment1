package Store;

public class testPattern {
	
	public static void main (String[] args) {
		abstractFactory itemFactory = generator.getFactory(false);
		groceryProd prodOne = itemFactory.getgroceryProd("BANANA");
		prodOne.prodInfo();
		groceryProd prodTwo = itemFactory.getgroceryProd("Apple");
		prodTwo.prodInfo();
	}

}
