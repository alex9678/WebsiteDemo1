package tests;

import org.testng.annotations.Test;

public class EndtoEndTest extends BaseTest {
	
	@Test(description = "end to end test")
	public void endtoend() {
		productsPage.chooseProducts("Sauce Labs Bike Light");
		productsPage.chooseProducts("Sauce Labs Fleece Jacket");
		productsPage.goToCart();
		yourCartPage.checkout();
		checkInformation.fillform("Alex", "Aaa", "72727");
		checkoutOverview.finish();
		checkoutComplete.back();
	}

}
