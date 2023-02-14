package com.psptech.unitech.cucumber.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.psptech.unitech.cucumber.baseClass.BaseClass;
import com.psptech.unitech.cucumber.pages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {

	public StepDefinition() {
		super(driver);	
	}
	LoginPage login;
	@Given("User enters the url of the Mercury Tour Application")
	public void user_enters_the_url_of_the_mercury_tour_application() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\nandi\\eclipse-workspace\\com.psptech.unitech.cucumber\\src\\test\\resources\\driver\\chromedriver.exe");
		driver = new ChromeDriver ();
		driver.get("https://demo.guru99.com/test/newtours/");
		driver.manage().window().maximize();
		System.out.println("Main Page initialized");
		String actualPageTitle = driver.getTitle();
		System.out.println("Actual Title of the page is: " + actualPageTitle);
		String expectedPageTitle = "Welcome: Mercury Tours";
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
	}
	
	@And("User navigates to the registration page")
	public void user_navigates_to_the_registration_page() {
	System.out.println("Navigates to Registration page");
	driver.findElement(By.xpath("(//a[@href='register.php'])[1]")).click();
	String actualURL = driver.getCurrentUrl();
	System.out.println("Current URL is: " + actualURL);
	String expectedURL = "https://demo.guru99.com/test/newtours/register.php";
	Assert.assertEquals(actualURL, expectedURL);    
	}
	
	@When("User enters all the required data")
	public void user_enters_all_the_required_data() {
	 driver.findElement(By.)    
	}
	@And("User clicks on the submit button")
	public void user_clicks_on_the_submit_button() {
	    
	}
	@Then("User successfully registers into the Mercury Tour Application")
	public void user_successfully_registers_into_the_mercury_tour_application() {
	    
	}

	
	
	
	
}
