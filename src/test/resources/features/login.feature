Feature: Login Test

Scenario: User should be able to login with Valid Credentials

	Given User is on Udemy WebSite
	When User click on Login
	And Enters User Name
	And Enters Password
	And Clicks on Login
	Then User logins to the Home Page