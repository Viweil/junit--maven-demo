package selenium;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class stepDefinition {
	
	WebDriver driver;
	
	@Given("^I go to \"([^\"]*)\"$")
	public void i_go_to(String arg1) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "D:\\Download\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.navigate().to("http://supervi.net");
	}

	@Then("^I should be on \"([^\"]*)\" home page$")
	public void i_should_be_on_home_page(String arg1) throws Throwable {
	    Assert.assertTrue(driver.getTitle().contains("asdf"));
	    driver.close();
	}
}
