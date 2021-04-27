package org.step;

import java.util.concurrent.TimeUnit;

import org.base.LibGlobal;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.openqa.selenium.remote.RemoteWebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDef extends LibGlobal {

	@Given("I am on facebook application")
	public void i_am_on_facebook_application() {

	}

	@When("I enter uesrname and password")
	public void i_enter_uesrname_and_password() {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebElement findElement = driver.findElement(By.id("file_upload"));
		LocalFileDetector detector =new LocalFileDetector();
		((RemoteWebElement)findElement).setFileDetector(detector);
		findElement.sendKeys(getFile());

	}

	@When("I click login button")
	public void i_click_login_button() {
		System.out.println("Login Button");

	}

	@Then("I need to validate home page is vissible or not")
	public void i_need_to_validate_home_page_is_vissible_or_not() {
		System.out.println("Invalid username");

	}
}
