package com.adactin.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.base_class.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= "src//test//java//com//featurefile", glue="com.adactin.stepdefinition")
public class Test_Runner {
	
	public static WebDriver driver;
	
    @BeforeClass
	public static void set_Up() {
driver = Base_Class.browserlaunch("chrome");
		

	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}
	
	
}
