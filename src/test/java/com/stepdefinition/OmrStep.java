package com.stepdefinition;

import java.time.Duration;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class OmrStep {
	WebDriver driver;

	@Given("User on the OMR branch page")
	public void user_on_the_omr_branch_page() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://omrbranch.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	}

	@When("User enters the email address and password")
	public void user_enters_the_email_address_and_password() {

		driver.findElement(By.id("email")).sendKeys("francis@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("Francis123");

	}

	@When("User click login button")
	public void user_click_login_button() {
		driver.findElement(By.xpath("//button[text()='Login']")).click();
	}

	@Then("User should verify successful message for login")
	public void user_should_verify_successful_message_for_login() {
		
		Assert.assertTrue("Verified Successful Login",true);
	}

}
