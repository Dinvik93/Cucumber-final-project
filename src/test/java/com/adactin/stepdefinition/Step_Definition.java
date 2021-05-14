package com.adactin.stepdefinition;

import org.openqa.selenium.WebDriver;

import com.adactin.helper.File_Reader_Manager;
import com.adactin.helper.Page_Object_Manager;
import com.adactin.testrunner.Test_Runner;
import com.base_class.Base_Class;
import com.pom.pages.Book_Hotel;
import com.pom.pages.Booked_Itinerary;
import com.pom.pages.Booking_Information;
import com.pom.pages.Login_page;
import com.pom.pages.Search_Hotel;
import com.pom.pages.Select_Hotel;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step_Definition extends Base_Class {
	
	public static WebDriver driver = Test_Runner.driver;
	public static Page_Object_Manager pom = new Page_Object_Manager(driver);
	
	
	
	
	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {
		String url = File_Reader_Manager.getInstance().getInstanceCR().geturl();
	  launchUrl(url);  
	   
	}

	@When("^user Enter The \"([^\"]*)\" In Username Field$")
	public void user_Enter_The_In_Username_Field(String Username) throws Throwable {
	 sendkeys(pom.getinstanceLoginpage().getUsername(), Username);  
	}

	@When("^user Enter The \"([^\"]*)\" In Password Field$")
	public void user_Enter_The_In_Password_Field(String Password) throws Throwable {
	  sendkeys(pom.getinstanceLoginpage().getPassword(), Password);
	}

	@Then("^user Click On The Login Button And It Navigates To Search Hotel Page$")
	public void user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
	 clickon(pom.getinstanceLoginpage().getLogin());   
	}

	@When("^user Select The Hotel Location In Location Field$")
	public void user_Select_The_Hotel_Location_In_Location_Field() throws Throwable {
	   singledropdowntext(pom.getinstanceSearchhotel().getLocation(), "Sydney");
	}

	@When("^user Select The Hotel In Hotel Field$")
	public void user_Select_The_Hotel_In_Hotel_Field() throws Throwable {
		singledropdowntext(pom.getinstanceSearchhotel().getHotels(), "Hotel Sunshine");
	    
	}

	@When("^user Select The Room Type In Room Type Field$")
	public void user_Select_The_Room_Type_In_Room_Type_Field() throws Throwable {
	    singledropdowntext(pom.getinstanceSearchhotel().getRoom_type(), "Super Deluxe");
	}

	@When("^user Select The Number Of Rooms In Number Of Rooms Field$")
	public void user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Field() throws Throwable {
	   singledropdowntext(pom.getinstanceSearchhotel().getRoom_nos(), "2 - Two"); 
	}

	@When("^user Select The Check In Date In Check In Date Field$")
	public void user_Select_The_Check_In_Date_In_Check_In_Date_Field() throws Throwable {
	    sendkeys(pom.getinstanceSearchhotel().getDatepick_in(), "12/05/2021");
	}

	@When("^user Select The Check Out Date In Check Out Date Field$")
	public void user_Select_The_Check_Out_Date_In_Check_Out_Date_Field() throws Throwable {
	    sendkeys(pom.getinstanceSearchhotel().getDatepick_out(), "15/05/2021");
	}

	@When("^user Select The Adults Per Room In Adults Per Room Field$")
	public void user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field() throws Throwable {
	    singledropdowntext(pom.getinstanceSearchhotel().getAdult_room(), "2 - Two");
	}

	@When("^user Select The Children Per Room In Children Per Room Field$")
	public void user_Select_The_Children_Per_Room_In_Children_Per_Room_Field() throws Throwable {
	  singledropdowntext(pom.getinstanceSearchhotel().getChild_room(), "1 - One");  
	}

	@Then("^user Click On The Serach Button And It Navigates To Select Hotel Page$")
	public void user_Click_On_The_Serach_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
	    clickon(pom.getinstanceSearchhotel().getSubmit());
	}

	@When("^user Select The Hotel In Checkbox Field$")
	public void user_Select_The_Hotel_In_Checkbox_Field() throws Throwable {
	 clickon(pom.getinstanceSelecthotel().getRadiobutton_0());
	}

	@Then("^user Click On The Continue Button And It Navigates To Book A Hotel Page$")
	public void user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
	   	   clickon(pom.getinstanceSelecthotel().getContinue1());
	}

	@When("^user Enter The First Name In First Name Field$")
	public void user_Enter_The_First_Name_In_First_Name_Field() throws Throwable {
	    sendkeys(pom.getinstancebookhotel().getFirst_name(), "Dinesh");
	}

	@When("^user Enter The Last Name In Last Name Field$")
	public void user_Enter_The_Last_Name_In_Last_Name_Field() throws Throwable {
	   sendkeys(pom.getinstancebookhotel().getLast_name(), "Kumar");
	}

	@When("^user Enter The Billing Address In Billing Address Field$")
	public void user_Enter_The_Billing_Address_In_Billing_Address_Field() throws Throwable {
	    sendkeys(pom.getinstancebookhotel().getAddress(), "Cuddalore");
	}

	@When("^user Enter The Credit Card Number In Credit Card Number Field$")
	public void user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field() throws Throwable {
	    sendkeys(pom.getinstancebookhotel().getCc_num(), "9876543210987654");
	}

	@When("^user Select The Credit Card Type In Credit Card Type Field$")
	public void user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field() throws Throwable {
		String cvvtype = File_Reader_Manager.getInstance().getInstanceCR().getcvvtype();
	  singledropdowntext(pom.getinstancebookhotel().getCc_type(), cvvtype); 
	}

	@When("^user Select The Month In Select Month Field$")
	public void user_Select_The_Month_In_Select_Month_Field() throws Throwable {
	 singledropdowntext(pom.getinstancebookhotel().getCc_exp_month(), "March");  
	}

	@When("^user Select The Year In Select Year Field$")
	public void user_Select_The_Year_In_Select_Year_Field() throws Throwable {
	    singledropdowntext(pom.getinstancebookhotel().getCc_exp_year(), "2014");
	}

	@When("^user Enter CVV Number In CVV Number Field$")
	public void user_Enter_CVV_Number_In_CVV_Number_Field() throws Throwable {
		String cvv = File_Reader_Manager.getInstance().getInstanceCR().getcvv();
	   sendkeys(pom.getinstancebookhotel().getCc_cvv(), cvv);
	}

	@Then("^user Click On The Book Now Button And It Navigates To Booking Confirmation Page$")
	public void user_Click_On_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
	  clickon(pom.getinstancebookhotel().getBook_now());
	}

	@Then("^user Click On The My Itinerary Button And It Navigates To Book A Hotel Page$")
	public void user_Click_On_The_My_Itinerary_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
		implicitwait(20);
	  
	   clickon(pom.getinstancebookinginfo().getMy_itinerary());
	}

	@Then("^user Click On The Logout Button And It Navigates To You Have Successfully Logged Out Page$")
	public void user_Click_On_The_Logout_Button_And_It_Navigates_To_You_Have_Successfully_Logged_Out_Page() throws Throwable {
	    clickon(pom.getinstancebookinglogout().getLogout());
	}
	

}
