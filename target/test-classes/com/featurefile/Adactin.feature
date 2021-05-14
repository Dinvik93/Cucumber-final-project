Feature: Hotel Booking In Adactin App

Scenario Outline: Logging In
    Given user Launch The Application
    When user Enter The "<Username>" In Username Field
    And user Enter The "<Password>" In Password Field
    Then user Click On The Login Button And It Navigates To Search Hotel Page
    
    Examples:
    |Username|Password|
    |aaa|123|
    |bbb|123|
    |Dineshvikash|Dinvik@93|
    
    

Scenario: Searching For Hotel
    When user Select The Hotel Location In Location Field 
    And user Select The Hotel In Hotel Field
    And user Select The Room Type In Room Type Field
    And user Select The Number Of Rooms In Number Of Rooms Field
    And user Select The Check In Date In Check In Date Field
    And user Select The Check Out Date In Check Out Date Field
    And user Select The Adults Per Room In Adults Per Room Field
    And user Select The Children Per Room In Children Per Room Field
    Then user Click On The Serach Button And It Navigates To Select Hotel Page
    
    Scenario: Selecting Hotel
    When user Select The Hotel In Checkbox Field 
    Then user Click On The Continue Button And It Navigates To Book A Hotel Page
    
    Scenario: Booking For Hotel
    When user Enter The First Name In First Name Field 
    And user Enter The Last Name In Last Name Field
    And user Enter The Billing Address In Billing Address Field
    And user Enter The Credit Card Number In Credit Card Number Field
    And user Select The Credit Card Type In Credit Card Type Field
    And user Select The Month In Select Month Field
    And user Select The Year In Select Year Field
    And user Enter CVV Number In CVV Number Field
    Then user Click On The Book Now Button And It Navigates To Booking Confirmation Page
    
    Scenario: Booking Confirmation
    Then user Click On The My Itinerary Button And It Navigates To Book A Hotel Page
    
    Scenario: Booked Itinerary
    Then user Click On The Logout Button And It Navigates To You Have Successfully Logged Out Page
    
    
    
    
    
