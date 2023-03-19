Feature: Access to the Documentation Page

Scenario: Verify user can access Doc page
    Given user is logged inside
    When user clicks "POSManager30" button
    And user clicks "Documentation" option
    Then user sees  "documentation" in the url
    And user sees "Odoo Documentation" message is displayed
    And there are 4 main documents topics are listed
