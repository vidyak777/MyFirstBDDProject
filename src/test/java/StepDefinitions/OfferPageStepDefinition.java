package StepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import PageObjects.LandingPage;
import PageObjects.OffersPage;
import PageObjects.PageObjectManager;
import Utils.TestContextSteup;
import io.cucumber.java.en.Then;


public class OfferPageStepDefinition {
	public String offerpageProductName;
	public TestContextSteup testcontextSetup;
	public PageObjectManager pageObjectManager;
	public WebDriver driver;
	
	public OfferPageStepDefinition(WebDriver driver) {
		this.driver = driver;
	}

	@Then("user go and serach the same short name {string} on offers page to check if product exists")
	public void user_go_and_serach_the_same_short_name_on_offers_page_to_check_if_product_exists(String shortName)
			throws Throwable {

		swithToOffersPage();

		OffersPage op = new OffersPage(driver);
		op.searchItem(shortName);
	
		Thread.sleep(2000);
		offerpageProductName = op.getProductName();
		Assert.assertEquals(testcontextSetup.landingpageProductName, offerpageProductName);

	}

	public void swithToOffersPage() {

		//PageObjectManager pom = new PageObjectManager(testcontextSetup.driver);
		LandingPage landingPage = testcontextSetup.pageObjectManager.getLandingPage();
	//	LandingPage landingPage = new LandingPage(testcontextSetup.driver);
		landingPage.selectTopDealsPage();
		testcontextSetup.genericUtils.switchWindowToChild();

	}

}
