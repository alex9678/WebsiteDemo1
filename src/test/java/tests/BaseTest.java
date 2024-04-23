package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.CheckInformation;
import pages.CheckoutComplete;
import pages.CheckoutOverview;
import pages.ItemPage;
import pages.LoginPage;
import pages.ProductsPage;
import pages.YourCartPage;

public class BaseTest {
	WebDriver driver;
	LoginPage loginPage;
	ProductsPage productsPage;
	ItemPage itemPage;
	YourCartPage yourCartPage;
	CheckInformation checkInformation;
	CheckoutOverview checkoutOverview;
	CheckoutComplete checkoutComplete;

	@BeforeClass
	public void setup() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");

		loginPage = new LoginPage(driver);
		productsPage = new ProductsPage(driver);
		itemPage = new ItemPage(driver);
		yourCartPage = new YourCartPage(driver);
		checkInformation = new CheckInformation(driver);
		checkoutOverview = new CheckoutOverview(driver);
		checkoutComplete = new CheckoutComplete(driver);

	}

	@BeforeClass
	public void setupLogin() {
		loginPage.login("standard_user", "secret_sauce");
	}

	@AfterClass
	public void tearDown() {
	}

}
