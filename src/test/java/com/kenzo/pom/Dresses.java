package com.kenzo.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dresses {
	public static WebDriver driver;

	@FindBy(xpath = "//*[@id=\"content\"]/section[2]/aside/ul/li[1]/ul/li[4]/a")
	private WebElement click;

	public Dresses(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getClick() {
		return click;
	}

}
