package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booked_Itinerary {

	public static WebDriver driver;
	public Booked_Itinerary(WebDriver driver1) {
		
	this.driver = driver1;
	PageFactory.initElements(driver1, this);
}

@FindBy(id = "logout")
private WebElement logout;


public WebElement getLogout() {
	return logout;
}


}
	
	

