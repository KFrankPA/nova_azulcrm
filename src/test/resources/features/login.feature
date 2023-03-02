@login
Feature: Users should be able to login

  Background: User is already in the log in page
    Given the user is on the login page

  @wip
  Scenario: Verify login with different user type
    Given the user enters valid username as "user1" and valid password as "password"

#  @wip // can add all user types to check login feature
#  Scenario Outline:Verify login with different user type
#    Given the user logged in as "<userType>"
#    Examples:
#      | userType       |
#      | hr_user        |
#      | helpdesk_user  |
#      | marketing_user |
