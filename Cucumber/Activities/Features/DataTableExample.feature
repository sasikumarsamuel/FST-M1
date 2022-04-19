@DataTableExample
Feature: Data driven test with Example

Scenario: Testing with Data from Scenario
  Given User completes the requirement
  When User enters the following username and password
  	| admin     | password  |
    | adminUser | Password  |
    | adminUser |           |
  Then Verify results