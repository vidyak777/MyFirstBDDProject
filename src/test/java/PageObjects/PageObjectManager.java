package PageObjects;

import org.openqa.selenium.WebDriver;

public class PageObjectManager {

	public LandingPage landingPage;
	public WebDriver driver;
	public OffersPage offersPage;
	
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;

	}

	public LandingPage getLandingPage() {

		LandingPage landingPage = new LandingPage(driver);
		return landingPage;
	}
   public OffersPage getOfferPage() {
	  OffersPage offersPage = new OffersPage(driver);
		return offersPage;
   }
   
   
}
