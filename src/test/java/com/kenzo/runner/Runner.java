package com.kenzo.runner;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.kenzo.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src\\test\\java\\com\\kenzo\\feature", glue = "com\\kenzo\\stepdefinition", dryRun = false, monochrome = true)

public class Runner {
	public static WebDriver driver;

	@BeforeClass
	public static void browserSetup() {
		driver = BaseClass.getDriver("chrome");
	}
}
