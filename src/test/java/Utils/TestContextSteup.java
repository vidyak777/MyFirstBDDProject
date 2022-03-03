package Utils;

import org.openqa.selenium.WebDriver;

import PageObjects.OffersPage;
import PageObjects.PageObjectManager;

public class TestContextSteup {
	public WebDriver driver;
	public String landingpageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	public OffersPage offersPage;

	public TestContextSteup() throws Throwable {

		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebDriverManager());
		genericUtils = new GenericUtils(testBase.WebDriverManager());
		offersPage = new OffersPage(testBase.WebDriverManager());
	}

}
