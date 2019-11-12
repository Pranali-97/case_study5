Feature: Test registration
  
  
  Scenario: Test registration with valid data
   Given User opens application newtours.demoaut.com
   When User clicks on Registration
   And User enters first name
   And User enters password
   And User enters confirms password
   And User clicks on register button
   Then Registration is succesful
    
