package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking_Information {

	public static WebDriver driver;
	
	
	public Booking_Information(WebDriver driver1) {
		this.driver = driver1;
	PageFactory.initElements(driver1, this);
}

@FindBy(id = "my_itinerary")
private WebElement my_itinerary;


public WebElement getMy_itinerary() {
	return my_itinerary;
}
	
	
}
