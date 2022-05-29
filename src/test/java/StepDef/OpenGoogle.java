package StepDef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class OpenGoogle {
	
	WebDriver driver;
	@Given("User enters the google URL")
	public void user_enters_the_google_url() {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
	    driver.get("https://www.google.com");
	    driver.manage().window().maximize();
		
	}

	@When("user searches the Car details")
	public void user_searches_the_car_details() {
	   driver.findElement(By.name("q")).sendKeys("Cars");
	}

	@When("Clicks on the Search button")
	public void clicks_on_the_search_button() {
		 driver.findElement(By.name("btnk")).click();
	}

	@Then("User should be navigated to Search result Page")
	public void user_should_be_navigated_to_search_result_page() {
	    System.out.println("Result shown successfully");
	}
}
