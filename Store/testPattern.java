package Store;

public class testPattern {
	
	public static void main (String[] args) {
		
//Gets product factory
		abstractFactory itemFactory = generator.getFactory(false);
		
//Gets product "banana"
		groceryProd prodOne = itemFactory.getgroceryProd("BANANA");
		
//Calls the prodInfo method for object "banana"
		prodOne.prodInfo();
		
//Gets product "apple"
		groceryProd prodTwo = itemFactory.getgroceryProd("Apple");
		
//Calls prodInfo method for object "apple"
		prodTwo.prodInfo();
	}

}
