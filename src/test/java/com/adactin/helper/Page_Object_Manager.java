package com.adactin.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.pom.pages.Book_Hotel;
import com.pom.pages.Booked_Itinerary;
import com.pom.pages.Booking_Information;
import com.pom.pages.Login_page;
import com.pom.pages.Search_Hotel;
import com.pom.pages.Select_Hotel;

public class Page_Object_Manager {
	public static WebDriver driver;
	private Login_page login;
	private Search_Hotel sh;
	private Select_Hotel sch;
	private Book_Hotel bh;
	private Booking_Information bi;
	private Booked_Itinerary bit;
	
	
	
	public Page_Object_Manager(WebDriver driver2) {
		this.driver = driver2;
		PageFactory.initElements(driver, this);
	}



	public Login_page getinstanceLoginpage() {
		login = new Login_page(driver);
		return login;

	}
	
	public  Search_Hotel getinstanceSearchhotel() {
		sh = new Search_Hotel(driver);
		return sh;

	}
	
	public  Select_Hotel getinstanceSelecthotel() {
		sch = new Select_Hotel(driver);
		return sch;

	}
	
public Book_Hotel getinstancebookhotel() {
	bh = new Book_Hotel(driver);
	return bh;

}

public Booking_Information getinstancebookinginfo() {
	bi = new Booking_Information(driver);
	return bi;

}

public Booked_Itinerary getinstancebookinglogout() {
bit	 = new Booked_Itinerary(driver);
	return bit;

}














}
