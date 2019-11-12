Feature: Login Test
 
 Scenario: Login with valid test data
    Given User launches chrome browser And navigates to application url
    When user enters username as "mercury" in username field
    When user enters password as "mercury" in password field
    And click Signin
    Then validates login success
    
 
    