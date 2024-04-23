package tests;

import org.testng.annotations.Test;

public class RemoveTest2 extends BaseTest {
	
	@Test(description = "remove products from item page")
	public void tc02_removeitems() {
		productsPage.chooseProducts("Sauce Labs Bike Light");
		itemPage.addToCart();
		itemPage.remove();
		productsPage.remove();
		productsPage.chooseProducts("Sauce Labs Fleece Jacket");
		itemPage.addToCart();
		itemPage.remove();
		productsPage.remove();
		productsPage.chooseProducts("Test.allTheThings() T-Shirt (Red)");
		itemPage.addToCart();
		itemPage.remove();
		productsPage.remove();
		productsPage.chooseProducts("Sauce Labs Backpack");
		itemPage.addToCart();
		itemPage.remove();
		productsPage.remove();
		productsPage.chooseProducts("Sauce Labs Bolt T-Shirt");
		itemPage.addToCart();
		itemPage.remove();
		productsPage.remove();
		productsPage.chooseProducts("Sauce Labs Onesie");
		itemPage.addToCart();
		itemPage.remove();
		productsPage.remove();
		
		
		
		
	}

}
