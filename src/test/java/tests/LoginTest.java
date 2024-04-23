package tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

	@Override
	public void setupLogin() {
		loginPage.login("standard_user", "secret_sauce");
	}

	@Test(description = "login failed test",dataProvider="getData")
	public void tc01_loginfailed(String user, String password, String expected) {
		loginPage.login(user, password);
		//String expected = "Epic sadface: Username and password do not match any user in this service";
		String actual = loginPage.getErrorMsg();
		Assert.assertEquals(actual, expected);

	}
	
	@DataProvider
	public Object[][] getData(){
		Object[][] myData = {
				{"user1","123","Epic sadface: Username and password do not match any user in this service"},
				{"gal","123","234234234"},
				{"yonit","1#444","fasdfsdfsd"},
				{"aadf","123456878","fgdgfg"},
				{"galfdf","123456878","fgdgfg"},
				{"galdd","123456878","fgdgfg"},
				
		};
		return myData;
	}

	@Test(description = "login passed")
	public void tc02_loginpassed() {
		loginPage.login("standard_user", "secret_sauce");
	}

	@Test(description = "logout test")
	public void tc03_logout() {
		productsPage.logout();
	}

}
