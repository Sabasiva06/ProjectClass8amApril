package org.step;

import java.net.MalformedURLException;

import org.base.LibGlobal;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends LibGlobal {

	@Before
	public void beforeClass() throws MalformedURLException {
		getChromeDriver();
//		cloudExecution();
		launchUlr("https://www.naukri.com/");

	}

	@After
	public void afterClass(Scenario sc) {

		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);

		sc.embed(screenshotAs, "login.png");

	}
}
