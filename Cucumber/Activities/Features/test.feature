@FirstTest
Feature: Basic Syntax

  @FirstScenario
  Scenario: This is scenario 1
    Given user is on the TS homepage
    When user clicks on the About Us button
    Then user is taken to About Us page
    And Close the browser