#TC-21
Feature: Error Msg
  Scenario: Verify error message for invalid sign in credentials
    Given I open website
    When I click on Sign In link
    Then I enter incorrect email address
    And I enter incorrect password
    Then I click on Sign In button
    And I verify error message is displayed
    And I quit website



#TC-19

   Scenario: Verify at the end of search results, "change dates" button is displayed and enabled.
     Given I launch webpage
     When I select"“Bora Bora, Leeward Islands, French Polynesia” from auto suggestion
     Then I select November 1, 2021 as Check-in
     Then I select November 30, 2021 as Check-out
     And I click Apply button
     Then I click on "Search" button
     And I verify if change dates button is displayed and enabled
     And I quit webpage

