Feature: To Open Orange Hrm Website and login

@Smoke @Regression
Scenario: Open Orange HRM with right username and password
Given User enters the Orange HRM url
When  Enters the Username "Admin" and password "admin123"
And   Clicks on the login button
Then  User should be navigated to OrangeHRM Homescreen


@Regression

Scenario: Open google with right username and password
Given User enters the google URL
When  user searches the Car details
And   Clicks on the Search button
Then  User should be navigated to Search result Page