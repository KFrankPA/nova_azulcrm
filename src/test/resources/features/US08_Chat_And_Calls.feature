@regression
@chat_&_calls
Feature: As a user, I should be able to access the Chat and Calls module

  Background:
    Given the user is on the login page

  Scenario Outline: Verify the users view all options in the Chat and Calls module
    Given  the user with "<userType>" enters valid username and password and click the login button
    When users click the CHAT and Calls module
    Then verify the users see flowing options:
      | Message       |
      | Notifications |
      | Settings      |
      | Active Stream |


    Examples:
      | userType       |
      | hr_user        |
      | helpdesk_user  |
      | marketing_user |

