$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin App",
  "description": "",
  "id": "hotel-booking-in-adactin-app",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Logging In",
  "description": "",
  "id": "hotel-booking-in-adactin-app;logging-in",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"\u003cUsername\u003e\" In Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cPassword\u003e\" In Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-app;logging-in;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 10,
      "id": "hotel-booking-in-adactin-app;logging-in;;1"
    },
    {
      "cells": [
        "aaa",
        "123"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-app;logging-in;;2"
    },
    {
      "cells": [
        "bbb",
        "123"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-app;logging-in;;3"
    },
    {
      "cells": [
        "Dineshvikash",
        "Dinvik@93"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-app;logging-in;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 11,
  "name": "Logging In",
  "description": "",
  "id": "hotel-booking-in-adactin-app;logging-in;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"aaa\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 5464861000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aaa",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 934944600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 241194300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1223327200,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Logging In",
  "description": "",
  "id": "hotel-booking-in-adactin-app;logging-in;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"bbb\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"123\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 471025700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bbb",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 282614000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "123",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 259700000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1204828600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Logging In",
  "description": "",
  "id": "hotel-booking-in-adactin-app;logging-in;;4",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "user Launch The Application",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user Enter The \"Dineshvikash\" In Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Dinvik@93\" In Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "user Click On The Login Button And It Navigates To Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Launch_The_Application()"
});
formatter.result({
  "duration": 755076200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dineshvikash",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Username_Field(String)"
});
formatter.result({
  "duration": 397998400,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Dinvik@93",
      "offset": 16
    }
  ],
  "location": "Step_Definition.user_Enter_The_In_Password_Field(String)"
});
formatter.result({
  "duration": 299523300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1516050600,
  "status": "passed"
});
formatter.scenario({
  "line": 17,
  "name": "Searching For Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-app;searching-for-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 18,
  "name": "user Select The Hotel Location In Location Field",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "user Select The Hotel In Hotel Field",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user Select The Room Type In Room Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user Select The Number Of Rooms In Number Of Rooms Field",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "user Select The Check In Date In Check In Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "user Select The Check Out Date In Check Out Date Field",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "user Select The Adults Per Room In Adults Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "user Select The Children Per Room In Children Per Room Field",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "user Click On The Serach Button And It Navigates To Select Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_Location_In_Location_Field()"
});
formatter.result({
  "duration": 693440100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_In_Hotel_Field()"
});
formatter.result({
  "duration": 337100700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Room_Type_In_Room_Type_Field()"
});
formatter.result({
  "duration": 394985700,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Number_Of_Rooms_In_Number_Of_Rooms_Field()"
});
formatter.result({
  "duration": 364978100,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Check_In_Date_In_Check_In_Date_Field()"
});
formatter.result({
  "duration": 239322500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Check_Out_Date_In_Check_Out_Date_Field()"
});
formatter.result({
  "duration": 187555500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Adults_Per_Room_In_Adults_Per_Room_Field()"
});
formatter.result({
  "duration": 339934300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Children_Per_Room_In_Children_Per_Room_Field()"
});
formatter.result({
  "duration": 338230300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Serach_Button_And_It_Navigates_To_Select_Hotel_Page()"
});
formatter.result({
  "duration": 1120943400,
  "status": "passed"
});
formatter.scenario({
  "line": 28,
  "name": "Selecting Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-app;selecting-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 29,
  "name": "user Select The Hotel In Checkbox Field",
  "keyword": "When "
});
formatter.step({
  "line": 30,
  "name": "user Click On The Continue Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Hotel_In_Checkbox_Field()"
});
formatter.result({
  "duration": 197899300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 1118812700,
  "status": "passed"
});
formatter.scenario({
  "line": 32,
  "name": "Booking For Hotel",
  "description": "",
  "id": "hotel-booking-in-adactin-app;booking-for-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 33,
  "name": "user Enter The First Name In First Name Field",
  "keyword": "When "
});
formatter.step({
  "line": 34,
  "name": "user Enter The Last Name In Last Name Field",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "user Enter The Billing Address In Billing Address Field",
  "keyword": "And "
});
formatter.step({
  "line": 36,
  "name": "user Enter The Credit Card Number In Credit Card Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 37,
  "name": "user Select The Credit Card Type In Credit Card Type Field",
  "keyword": "And "
});
formatter.step({
  "line": 38,
  "name": "user Select The Month In Select Month Field",
  "keyword": "And "
});
formatter.step({
  "line": 39,
  "name": "user Select The Year In Select Year Field",
  "keyword": "And "
});
formatter.step({
  "line": 40,
  "name": "user Enter CVV Number In CVV Number Field",
  "keyword": "And "
});
formatter.step({
  "line": 41,
  "name": "user Click On The Book Now Button And It Navigates To Booking Confirmation Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_First_Name_In_First_Name_Field()"
});
formatter.result({
  "duration": 329586300,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Last_Name_In_Last_Name_Field()"
});
formatter.result({
  "duration": 232810000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Billing_Address_In_Billing_Address_Field()"
});
formatter.result({
  "duration": 274130400,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_The_Credit_Card_Number_In_Credit_Card_Number_Field()"
});
formatter.result({
  "duration": 395979900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Credit_Card_Type_In_Credit_Card_Type_Field()"
});
formatter.result({
  "duration": 374083900,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Month_In_Select_Month_Field()"
});
formatter.result({
  "duration": 382653500,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Select_The_Year_In_Select_Year_Field()"
});
formatter.result({
  "duration": 309911000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Enter_CVV_Number_In_CVV_Number_Field()"
});
formatter.result({
  "duration": 192622000,
  "status": "passed"
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page()"
});
formatter.result({
  "duration": 148816600,
  "status": "passed"
});
formatter.scenario({
  "line": 43,
  "name": "Booking Confirmation",
  "description": "",
  "id": "hotel-booking-in-adactin-app;booking-confirmation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 44,
  "name": "user Click On The My Itinerary Button And It Navigates To Book A Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_My_Itinerary_Button_And_It_Navigates_To_Book_A_Hotel_Page()"
});
formatter.result({
  "duration": 7658897800,
  "status": "passed"
});
formatter.scenario({
  "line": 46,
  "name": "Booked Itinerary",
  "description": "",
  "id": "hotel-booking-in-adactin-app;booked-itinerary",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 47,
  "name": "user Click On The Logout Button And It Navigates To You Have Successfully Logged Out Page",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_Definition.user_Click_On_The_Logout_Button_And_It_Navigates_To_You_Have_Successfully_Logged_Out_Page()"
});
formatter.result({
  "duration": 1170774500,
  "status": "passed"
});
});