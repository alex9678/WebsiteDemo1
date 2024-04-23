package tests;

import org.testng.annotations.Test;

public class CheckOutTest extends BaseTest {

	@Test(description = "checkout test")
	public void checkout() {
		productsPage.chooseProducts("Sauce Labs Fleece Jacket");
		productsPage.goToCart();
		yourCartPage.checkout();
		checkInformation.fillform("Alex", "aaaa", "727272");
		checkoutOverview.backMenu();
		

	}

}
