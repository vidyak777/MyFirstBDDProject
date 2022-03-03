package StepDefinitions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import PageObjects.LandingPage;
import PageObjects.PageObjectManager;
import Utils.TestBase;
import Utils.TestContextSteup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LandingPageStepDefinition {
	
	public WebDriver driver;
	
	public PageObjectManager pageObjectManager;
	public String landingpageProductName;
	TestContextSteup testcontextSetup;
	public LandingPageStepDefinition(TestContextSteup testcontextSetup) {
		this.testcontextSetup= testcontextSetup;
	}
	@Given("User is on Greencart landing page")
	public void user_is_on_greencart_landing_page() throws Throwable {
		
		TestBase t = new TestBase();
		t.WebDriverManager();
	  
	
	}

	@When("user searched with short name {string} and extracted actual name of product")
	public void user_searched_with_short_name_and_extracted_actual_name_of_product(String shortName) throws Throwable {
		
		LandingPage landingPage =  testcontextSetup.pageObjectManager.getLandingPage();
		landingPage.searchItem(shortName);
		
		//testcontextSetup.driver.findElement(By.xpath("//input[@type='search']")).sendKeys(shortName);
	    Thread.sleep(2000);
	    testcontextSetup.landingpageProductName= landingPage.getProductName().split("-")[0].trim();
	   System.out.println(testcontextSetup.landingpageProductName+ " is extracted from home page");
	}
	

	
	}


