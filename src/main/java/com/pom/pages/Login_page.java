package com.pom.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class Login_page {
	
	
public static WebDriver driver;

		public Login_page(WebDriver driver1) {
			this.driver = driver1;
			PageFactory.initElements(driver1, this);
		}

		@FindBy(id = "username")
		private WebElement username;

		@FindBy(id = "password")
		private WebElement password;

		@FindBy(id = "login")
		private WebElement login;

		public WebElement getUsername() {
			return username;
		}

		public WebElement getPassword() {
			return password;
		}

		public WebElement getLogin() {
			return login;
		}

	}


