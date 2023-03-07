Feature: As a user, I want to access the Time and Reports page


  @TimeAndReport
  Scenario: Verify the users view all modules in the Time and Reports page

    Given enters valid username and password
    And click the login button
    Given Given users are on the homepage
    When users click the Time and Reports module
    Then verify the users see flowing five options:

