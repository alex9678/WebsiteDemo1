package tests;

import org.testng.annotations.Test;

public class SortListTest extends BaseTest {

	@Test(description = "sort list test")
	public void tc01_sortlist() {
		productsPage.select("za");
		productsPage.select("lohi");
		productsPage.select("hilo");

	}
}