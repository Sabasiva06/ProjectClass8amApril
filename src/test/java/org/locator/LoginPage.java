package org.locator;

import org.base.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends LibGlobal {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBys({ @FindBy(id = "username"), @FindBy(xpath = "//input[@id='username']") })
	private WebElement txtUserName;

	@FindAll({ @FindBy(id = "password"), @FindBy(name = "123") })
	private WebElement txtPassword;

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	@FindBy(name = "login")
	private WebElement btnLogin;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPassword() {
		return txtPassword;
	}

}
