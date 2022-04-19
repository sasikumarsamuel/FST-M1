@BackgroundExample
Feature: Login Test

Background:
	Given User is on Login page

Scenario: Testing Login with correct credentials
  When User enters "admin" and "password"
  Then Read the page title and confirmation message
  
Scenario: Testing Login with wrong credentials
  When User enters "Admin" and "Password"
  Then Read the page title and confirmation message
  And Close the browser