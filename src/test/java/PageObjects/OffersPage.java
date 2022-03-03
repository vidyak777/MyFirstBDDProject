package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OffersPage {
	public WebDriver driver;
	
	public OffersPage(WebDriver driver) {
		this.driver= driver;
	}

	private By searchField =By.id("search-field");
	private By productName = By.cssSelector("tr td:nth-child(1)");
	private By topDeals = By.linkText("Top Deals");
public void searchItem(String name) {
		
		driver.findElement(searchField).sendKeys(name);
	}
	
public void searchFieldText() {
	 driver.findElement(searchField).getText();
}

public String getProductName() {
	return driver.findElement(productName).getText();
}
	
	
	
	
	
	
}
