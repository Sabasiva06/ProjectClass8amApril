package org.sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SampleLaunch {
	@Test
	private void test() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://adactinhotelapp.com/index.php");
		driver.manage().window().maximize();
		WebElement txtUsername = driver.findElement(By.cssSelector("input[id*=me]"));
		txtUsername.sendKeys("kaidhzhb");
		

	}

}