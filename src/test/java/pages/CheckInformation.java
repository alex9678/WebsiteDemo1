package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckInformation extends AppBasePage {
	@FindBy(css = "#first-name")
	private WebElement firstNameField;
	@FindBy(css = "#last-name")
	private WebElement lastNameField;
	@FindBy(css = "#postal-code")
	private WebElement zipField;
	@FindBy(css = "#continue")
	private WebElement continueBtn;
	@FindBy(css = "#cancel")
	private WebElement cancelBtn;
	@FindBy(css = ".error-message-container.error")
	private WebElement errorLabel;

	public CheckInformation(WebDriver driver) {
		super(driver);

	}

	public void fillform(String firstName, String lastName, String zip) {
		fillText(firstNameField, firstName);
		fillText(lastNameField, lastName);
		fillText(zipField, zip);
		click(continueBtn);

	}

	public void cancel() {
		click(cancelBtn);
	}

	public String errorMsg() {
		return getText(errorLabel);

	}

}
