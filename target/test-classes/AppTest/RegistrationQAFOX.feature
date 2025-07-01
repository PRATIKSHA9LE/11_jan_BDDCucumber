Feature: user Registration on QAfOX
Scenario Outline: succesful user registration with valid data
Given user is at the register Account page
When user enter <"First_Name"> in First Name field
And user enter <"Last_Name"> in Last Name feild
And user enter <"E-Mail"> in E-Mail field
And user enter <"Telephone"> in Telephone field
And user enter <"Password"> in password Field
And user enter <"Password_Confirm"> in Password confirm Field
And user selects <"Subscribe">
And user accepts Privacy Policy
And user clicks on Continue button
Then user should get created

 Examples:
 |First_Name  |Last_Name  | E-Mail       |Telephone  |Password  |Password_Confirm  |Subscribe  |
 |Virat       |Kohali     |VK@gmail.com  |9876543    |Vk@1234   |Vk@1234           |No         |
 |Rohit       |Sharma     |RS@gmail.com  |1234543    |RS@1234   |RS@1234           |Yes        |
 |Hardik      |Pandya     |HP@gmail.com  |2345543    |HP@1234   |HP@1234           |No         |
 |SuryaKumar  |yadav      |SY@gmail.com  |9045543    |SY@1234   |SY@1234           |Yes        |