package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutComplete extends AppBasePage {
	@FindBy(css = "#back-to-products")
	private WebElement backBtn;

	public CheckoutComplete(WebDriver driver) {
		super(driver);

	}

	public void back() {
		click(backBtn);
	}

}
