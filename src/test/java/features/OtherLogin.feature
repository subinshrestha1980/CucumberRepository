 @OtherLogin
 Feature: Validate Techfios Login Functionality
	
Background:
	Given User is on the Techfios login page 
		
@Scenario1   
Scenario Outline: 1 User should be able to login with the valid credentials
	When User enters "<userName>" and "<password>"        
	And User clicks on the signin button
	Then User should land on the Dashboard page
 
 	Examples: 
 	|userName 			|password |
 	|demo@techfios.com	|abc123 |
 	|demo1@techfios.com	|abc123 |
 	|demo@techfios.com	|abc1234 |
 	|demo@2techfios.com	|abc1231 |