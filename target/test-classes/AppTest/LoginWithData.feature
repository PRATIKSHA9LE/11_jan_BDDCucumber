Feature: OrangeHRM login functionality
Scenario: valid login with Username and Data
Given user is at the OrangeHRM login page
When user is Enter Username as "Admin"
And user is enter Password as "admin123"
And user is click on login button
Then user should redirected to the dashboard
