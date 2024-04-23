package tests;

import org.testng.annotations.Test;

public class MenuTest extends BaseTest {
	
	@Test(description = "menu test 1")
	public void tc01_menutest() {
		productsPage.chooseProducts("Sauce Labs Bike Light");
		itemPage.addToCart();
		itemPage.resetAppState();
		
		
	}
	
	@Test(description = "menu test 2")
	public void tc02_menutest2() {
		productsPage.addToCart("Sauce Labs Bike Light");
		productsPage.goToCart();
		yourCartPage.backMenu();
		productsPage.logout();
		
		
	}
	
	

}
