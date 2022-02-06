Feature: LoginPage

@ValidCredentials
   Scenario Outline: Login with valid credentials
     
    Given User is on Saucedemo page
    When User enters <username> and <password>
    Then user click on login button
    And User should be able to login sucessfully and new page open
    
   Examples:
   
   |username|password|
   |standard_user|secret_sauce|
    