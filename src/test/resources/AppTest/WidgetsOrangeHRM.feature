Feature: Access and interact with OrangeHRM Dashboard widgets

Background: 
Given user is login OrangeHRM using valid credential
When user is at Dashboard page

Scenario: view dashboard widgets
Then user should see "Time at work" , "My Actions" , "Quick Launch"

Scenario: launch leave Apply from Quick launch
And user clicks on "Apply leave" from Quick Launch wedget
Then user should be redirected to the "Apply Leave" webpage 
