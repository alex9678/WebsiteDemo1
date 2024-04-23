package tests;

import org.testng.annotations.Test;

public class RemoveTest extends BaseTest {

	@Test(description = "remove products test")
	public void tc01_removeproducts() {
		productsPage.addToCart("Sauce Labs Bike Light");
		productsPage.remove();
		productsPage.addToCart("Sauce Labs Fleece Jacket");
		productsPage.remove();
		productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
		productsPage.remove();
		productsPage.addToCart("Sauce Labs Backpack");
		productsPage.remove();
		productsPage.addToCart("Sauce Labs Bolt T-Shirt");
		productsPage.remove();
		productsPage.addToCart("Sauce Labs Onesie");
		productsPage.remove();
	}

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
