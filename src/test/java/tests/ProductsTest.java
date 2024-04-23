package tests;

import org.testng.annotations.Test;

public class ProductsTest extends BaseTest {

	@Test(description = "add products test")
	public void tc01_addproducts() {
		productsPage.addToCart("Sauce Labs Bike Light");
		productsPage.addToCart("Sauce Labs Fleece Jacket");
		productsPage.addToCart("Test.allTheThings() T-Shirt (Red)");
		productsPage.addToCart("Sauce Labs Backpack");
		productsPage.addToCart("Sauce Labs Bolt T-Shirt");
		productsPage.addToCart("Sauce Labs Onesie");
		productsPage.resetAppState();

	}

	@Test(description = "add products from item page")
	public void tc02_addproductitem() {
		productsPage.chooseProducts("Sauce Labs Bike Light");
		itemPage.addToCart();
		itemPage.back();
		productsPage.chooseProducts("Sauce Labs Fleece Jacket");
		itemPage.addToCart();
		itemPage.back();
		productsPage.chooseProducts("Test.allTheThings() T-Shirt (Red)");
		itemPage.addToCart();
		itemPage.back();
		productsPage.chooseProducts("Sauce Labs Backpack");
		itemPage.addToCart();
		itemPage.back();
		productsPage.chooseProducts("Sauce Labs Bolt T-Shirt");
		itemPage.addToCart();
		itemPage.back();
		productsPage.chooseProducts("Sauce Labs Onesie");
		itemPage.addToCart();
		itemPage.back();
	}

}
