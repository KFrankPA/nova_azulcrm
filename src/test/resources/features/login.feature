@all
Feature: As a user, I should be able to log in to the with valid credentials

  Background: User is already in the log in page
    Given the user is on the login page

  @all
  Scenario Outline: Verify user login with valid credentials
    Given the user with "<userType>" enters valid username and password and click the login button
    Then verify the user should be at the home page
    Examples:
      | userType       |
      | hr_user        |
      | helpdesk_user  |
      | marketing_user |

  @hrUser
  Scenario Outline: Verify user login with valid credentials
    Given the user with "<userType>" enters valid username and password and click the login button
    Then verify the user should be at the home page
    Examples:
      | userType       |
      | hr_user        |

  @hdUser
  Scenario Outline: Verify user login with valid credentials
    Given the user with "<userType>" enters valid username and password and click the login button
    Then verify the user should be at the home page
    Examples:
      | userType       |
      | helpdesk_user  |

  @marketingUser
  Scenario Outline: Verify user login with valid credentials
    Given the user with "<userType>" enters valid username and password and click the login button
    Then verify the user should be at the home page
    Examples:
      | userType       |
      | marketing_user |

  @invalid
  Scenario Outline: Verify user can not login with invalid credentials
    Given the user enters invalid "<username>" or "<password>" and click the login button
    Then users see "Incorrect login or password" on the page
    Examples:
      | username     | password         |
      | hr_user      | invalid_password |
      | invalid_user | hd_password      |
      | invalid_user | invalid_password |
