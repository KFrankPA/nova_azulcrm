@regression
Feature: As a user, I want to access the Employees page.


  Scenario: verify that user can access 'Employee' page
    Given user on login page
    When user successfully logs in
    Then user clicks 'Employee' page and clicks
    And verify that user access 'Employee' page
