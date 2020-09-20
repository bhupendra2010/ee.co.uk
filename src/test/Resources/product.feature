Feature: Check the mobile deal

  Scenario: Mobile deal
    Given User is on homepage
    When User is going to paymonthly phone
    And  search the different mobile phone deal
    Then User should see all the deal with description
