package com.automation.testcases;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.annotation.en.*;

public class Steps {
	ChromeDriver driver;
	@Given("^User is on login Page$")
	public void User_is_on_login_Page() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver2.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.facebook.com");
	}

	@When("^User enters username$")
	public void User_enters_username() throws Throwable {
	    driver.findElementById("email").sendKeys("hello");
	}

	@When("^User enters password$")
	public void User_enters_password() throws Throwable {
		driver.findElementById("pass").sendKeys("hello");
	}

	@When("^User clicks on signin button$")
	public void User_clicks_on_signin_button() throws Throwable {
		//driver.findElementById("email").sendKeys("hello");
	}

	@Then("^User should login successfully$")
	public void User_should_login_successfully() throws Throwable {
	   
	}

	@Then("^User should get welcome message$")
	public void User_should_get_welcome_message() throws Throwable {
	   
	}

	@When("^User enters invalid username$")
	public void User_enters_invalid_username() throws Throwable {
	    
	}
	
}
