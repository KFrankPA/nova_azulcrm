@regression
@my_profile_page
Feature: As a user, I want to access my profile page.

  Background:
    Given the user is on the login page

  Scenario Outline: Verify the users view all options on my profile page
    Given  the user with "<userType>" enters valid username and password and click the login button

    When users click the user profile
    Then verify the users see flowing 5 options:
      | General       |
      | Drive         |
      | Tasks         |
      | Calendar      |
      | Conversations |

    Examples:
      | userType       |
      | hr_user        |
      | helpdesk_user  |
      | marketing_user |