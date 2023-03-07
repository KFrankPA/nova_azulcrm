@MyTest
Feature:
  As a user, I should be able to configure the menu.
  Acceptance Criteria:

  Scenario:  Verify users can access to 6 options under the CONFIGURE MENU.
    Given users are on the Homepage
    When users click the CONFIGURE MENU option
    Then verify the users see flowing six options
      | Configure menu items               |
      | Collapse menu                      |
      | Remove current page from left menu |
      | Add custom menu item               |
      | Change primary tool                |
      | Reset menu                         |

