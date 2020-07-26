package com.kenzo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	public static WebDriver driver;

	@FindBy(xpath = "//*[@class=\"iconkz-account header-icon account-toggle\"]")
	private WebElement account;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "pwd")
	private WebElement password;

	@FindBy(id = "loginForm")
	private WebElement loginbtn;

	public Login(WebDriver driver1) {
		this.driver = driver1;
		PageFactory.initElements(driver, this);
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}

}
