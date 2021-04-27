package org.sample;

import org.base.LibGlobal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class B extends LibGlobal{
	
	@BeforeClass
	private void beforeClass() {
		getChromeDriver();
		launchUlr("https://www.facebook.com/");
	}
	@Parameters({"userName"})
	@Test
	private void test(@Optional("Vicky")String s1) {
		WebElement txtUser = driver.findElement(By.id("email"));
		enterText(txtUser, s1);
	
	}
	
	@Parameters({"PassWord"})
	@Test
	private void test1(String pass) {
		WebElement txtPass = driver.findElement(By.name("pass"));
		enterText(txtPass, pass);
	}
	
	@AfterClass
	private void aftterClass() {
		driver.quit();
	}
}
