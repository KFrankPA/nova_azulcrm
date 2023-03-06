
Feature:As a use, I should see "Remember me on this computer", and click the check box on the login page
  @wip
  Scenario: Verify the users can check the "Remember me on this computer" checkbox
    Given the user is on the login page
    Then click the check box
    Then see "Remember me on this computer" message displayed