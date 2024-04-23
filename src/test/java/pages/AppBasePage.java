package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppBasePage extends BasePage {
	@FindBy(css = "#react-burger-menu-btn")
	private WebElement menuBtn;
	@FindBy(css = "#logout_sidebar_link")
	private WebElement logoutBtn;

	@FindBy(css = ".shopping_cart_link")
	private WebElement cartBtn;
	@FindBy(css = "#shopping_cart_badge")
	private WebElement cartItemLabel;

	@FindBy(css = "#reset_sidebar_link")
	private WebElement resetAppBtn;
	@FindBy(css = ".btn.btn_secondary ")
	private WebElement removeBtn;
	@FindBy(css = "#inventory_sidebar_link")
	private WebElement allItemBtn;

	public AppBasePage(WebDriver driver) {
		super(driver);

	}

	public void backMenu() {
		click(menuBtn);
		waiting(1000);
		click(allItemBtn);
	}

	public void remove() {
		click(removeBtn);
	}

	public void resetAppState() {
		click(menuBtn);
		waiting(1000);
		click(resetAppBtn);
	}

	public void goToCart() {
		click(cartBtn);
	}

	public void logout() {
		click(menuBtn);
		waiting(1000);
		click(logoutBtn);
	}

	public int getItemsInCart() {
		String s = "";
		try {
			s = getText(cartItemLabel);
		} catch (Exception e) {
			return 0;
		}
		int i = Integer.parseInt(s);
		return i;
	}

}
