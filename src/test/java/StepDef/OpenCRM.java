package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class OpenCRM {
	WebDriver driver;
	
	@Given("User enters the Orange HRM url")
	public void user_enters_the_orange_hrm_url() {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.manage().window().maximize();
	}

	@When("Enters the Username {string} and password {string}")
	public void enters_the_username_and_password(String string, String string2) {
		 driver.findElement(By.xpath("//*[@id='txtUsername']")).sendKeys(string);
		    driver.findElement(By.xpath("//*[@id='txtPassword']")).sendKeys(string2);
	}

	@When("Clicks on the login button")
	public void clicks_on_the_login_button() {
		driver.findElement(By.xpath("//*[@id='btnLogin']")).click();
	}

	@Then("User should be navigated to OrangeHRM Homescreen")
	public void user_should_be_navigated_to_orange_hrm_homescreen() {
		String actualHomescreen=driver.findElement(By.xpath("//a[@id='welcome']")).getText();
		
		   Assert.assertEquals("Welcome Screen","Welcome Automation", actualHomescreen);
		   driver.quit();
	}


}
