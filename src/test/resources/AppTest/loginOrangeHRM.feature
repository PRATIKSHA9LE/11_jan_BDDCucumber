Feature: login functionality of OrangeHRM
Scenario: sucessful login with valid credentials
Given user is at the login screen
When user enters a valid Username
And user enters a valid Password
And user clicks on Login button
Then user should be landed on Dashboard page 



Scenario: Title verification of an application
Given user is at login Screen of an application
Then Title of an application should be displayed on the browser tab