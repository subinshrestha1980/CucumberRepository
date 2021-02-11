 @BankLogin
 Feature: Validate Techfios Login Functionality
	
Background:
	Given User is on the Techfios login page 
		
@Scenario1   
Scenario Outline: 1 User should be able to login with the valid credentials
	When User enters "<userName>" and "<password>"        
	And User clicks on the signin button
	Then User should land on the Dashboard page
 	Then User click in bank and cash
 	Then User click on new account
 	Then User fill the form entnering "<accountTitle>" and "<discription>" and "<initalBalance>" and "<accountnumber>" and "<contactPerson>" and "<phone>" 
 	And User click in Submit Button
 	Then User Should land on Account Page 
 	
 	Examples: 
 	|userName 			|password | |accountTitle|		|discription|		|initalBalance| |accountnumber|	|contactPerson|			|phone|
 	|demo@techfios.com	|abc123 |	|Larisha Shresthaa|	|Personal Account|	|USD 5000|		|1382040|		|Prajwalta Rajbhandari|	|9779841657440|
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	
 	