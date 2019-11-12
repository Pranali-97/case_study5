Feature: Login to TestMe App

Scenario Outline: Login
Given open the test me app
When user click on SignIn
And user enter UserName "<username>"
And user enter Password "<password>"
Then user click on login button

Examples:
|username|password|
|pranali|pranali123|


    


