Feature: As a user, I should be able to access to the Company page

  @wip_Andrey
  Scenario:  Verify users see the 7 modules in the Company page shown as design
    Given users are on the homepage
    When users click the Company module
    Then verify the users see following Company options:
      | Official Information |
      | Our Life             |
      | About Company        |
      | Photo Gallery        |
      | Video                |
      | Career               |
      | Business News (RSS)   |
