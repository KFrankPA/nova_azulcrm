Feature: As a user, I want to access the Time and Reports page


  @TimeAndReport
  Scenario: Verify the users view all modules in the Time and Reports page
    Given users are on the Homepage
    When users click the Time and Reports module
    Then verify the users see flowing 5 options
      | Absence Chart          |
      | Worktime               |
      | BITRIX24.Time          |
      | Work Reports           |
      | Meetings and Briefings |


