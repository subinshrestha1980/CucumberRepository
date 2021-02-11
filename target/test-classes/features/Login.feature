@Login
 Feature: Validate Techfios Login Functionality

Background:
	Given User is on the Techfios login page 
	
@Senario1
Scenario: 1  User should be able to login with the valid credentials
	When User enters username as "demo@techfios.com" 
	When User enter password as "abc123" 
	And User clicks on the signin button
	Then User should land on the Dashboard page
	
@Senario2
Scenario: 2  User should be able to login with the valid credentials
	When User enters username as "demo2@techfios.com" 
	When User enter password as "abc123" 
	And User clicks on the signin button
	Then User should land on the Dashboard page
	
@Senario3
Scenario: 3  User should be able to login with the valid credentials
	When User enters username as "demo@techfios.com" 
	When User enter password as "abc1234" 
	And User clicks on the signin button
	Then User should land on the Dashboard page