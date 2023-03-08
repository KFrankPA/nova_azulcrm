@Regression
Feature: As a user, I want to access the Drive page.

  Background:
    Given the user is on the login page

  Scenario Outline: Verify the users view all modules in the Drive page.
    Given the user with "<userType>" enters valid username and password and click the login button

    When users click the Drive module
    Then verify the users see flowing 6 options:
      | My Drive                   |
      | All Documents              |
      | Company Drive              |
      | Sales and Marketing        |
      | Top Management’s documents |
      | Drive Cleanup              |
    Examples:
      | userType       |
      | hr_user        |
      | helpdesk_user  |
      | marketing_user |






