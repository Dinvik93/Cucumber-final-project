package com.adactin.testrunner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.base_class.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= "src//test//java//com//featurefile", glue="com.adactin.stepdefinition", strict=true,
plugin= {"html:Report/Cucumber_Html_Report", "pretty", "json:Reports/Final_Project.json", 
		"com.cucumber.listener.ExtentCucumberFormatter:Report/ExtentReport.html" }
)
public class Test_Runner {
	
	public static WebDriver driver;
	
    @BeforeClass
	public static void set_Up() throws Throwable {
    	String browser = File_Reader_Manager.getInstance().getInstanceCR().getbrowser();
driver = Base_Class.browserlaunch(browser);
		

	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}
	
	
}
