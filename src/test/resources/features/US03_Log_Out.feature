@logout
Feature: As a user, I should be logout

  Background: For all user is on the login page of the AzulCRM application
    Given User is on the login page
    Then User is logged in to the app homepage

    Scenario: Verify the users log out from the app
      Given the users are on the homepage
      When users click the user profile name
      And users select the "Log out" option
      Then verify the user back to the login page