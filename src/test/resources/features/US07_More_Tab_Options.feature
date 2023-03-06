Feature: As a user, I should be able to see all the options under the MORE tab on the homepage

  Background:
    Given the user is on the login page

  Scenario Outline: Verify all user types see following 2 mobile app options
    Given the user with "<userType>" enters valid username and password and click the login button
    And verify the user should be at the home page
    When user clicks the "MORE" tab
    Then verify the users see following 4 options
      | File         |
      | Appreciation |
      | Announcement |
      | Workflow     |

    Examples:
      | userType       |
      | hr_user        |
      | helpdesk_user  |
      | marketing_user |