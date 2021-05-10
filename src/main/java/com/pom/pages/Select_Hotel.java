package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Select_Hotel {
	
	
	public static WebDriver driver;
	
	public Select_Hotel(WebDriver driver1) {
	this.driver = driver1;
	PageFactory.initElements(driver1, this);
}

@FindBy(id = "radiobutton_0")
private WebElement radiobutton_0;

@FindBy(id = "continue")
private WebElement continue1;

public WebElement getRadiobutton_0() {
	return radiobutton_0;
}

public WebElement getContinue1() {
	return continue1;
}

}
