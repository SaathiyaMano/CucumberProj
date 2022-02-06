Feature: Multiple options selection

Scenario Outline:

Given user is successfully logged into Daucedemo page
When user is on Homepage
And user selects product "Sauce Labs Backpack" and "Sauce Labs Bolt T-shirt"
And user clicks on Add to cart option
And navigates to "Your Cart"Page
And user clicks on checkout option
Then user navigates to Checkout:Your information Page
And user enters <Firstname > and <Lastname>
And user enters <postcode>
And user clicks on Continue button
Then user navigates to Checkout:overview page
And user clicks on finish button

Examples:

|Firstname|Lastname|postcode|
|Saathiya|Mano|600094|



