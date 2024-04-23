package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckoutInformationTest extends BaseTest {

	@Test(description = "fillform test", dataProvider = "getData")
	public void tc01_fillform(String firstName, String lastName, String zip, String expected) {
		productsPage.chooseProducts("Sauce Labs Bike Light");
		productsPage.goToCart();
		yourCartPage.checkout();
		checkInformation.fillform(firstName, lastName, zip);
		String actual = checkInformation.errorMsg();
		Assert.assertEquals(actual, expected);

	}

	@DataProvider
	public Object[][] getData() {
		Object[][] myData = { { "", "ddd", "", "Error: First Name is required" },
				{ "aaaa", "", "34343", "Error: Last Name is required" },
				{ "aaaa", "1#444", "", "Error: Postal Code is required" }, { "aadf", "", "fgdgfg", "234234" },
				{ "galfdf", "1234", "", "234234" },

		};
		return myData;
	}

}
