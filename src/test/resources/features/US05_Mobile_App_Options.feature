@mobile_app_options
Feature: As a user, I want to see mobile app options to download.

  Background:
    Given the user is on the login page

  Scenario Outline: Verify all user types see following 2 mobile app options
    Given the user with "<userType>" enters valid username and password and click the login button
    And verify the user should be at the home page
    Then verify the users see following 2 mobile app options
      | APP STORE   |
      | GOOGLE PLAY |
    Examples:
      | userType       |
      | hr_user        |
      | helpdesk_user  |
      | marketing_user |

