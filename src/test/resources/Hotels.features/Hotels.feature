Feature: Hotels.com

  #TC-21
  Scenario: Verify error message for invalid sign in credentials
    Given I launch webpage
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
     And I quit website


  #TC-20
  Scenario: Verify TermsAndConditions link and PrivacyStatements link open correct page on new tab
  Given I launch webpage
  When I click on Sign In link
  Then I Click  on Sign up link
  Then I Click “Terms and Conditions” link
  And I Verify “Terms and Conditions” page opens in new tab
  Then I Click “Privacy Statement” link
  And I Verify “Privacy Statement” page opens in new tab
    And I quit website


    #TC-17
    Scenario: Verify past date and back button on Current month's calendar is disabled
      Given I launch webpage
    When I Click on CheckIn Calendar
    Then I Verify For current month
    Then I Verify if Past dates (if any) are disabled.
    And I Verify if Back button on current month is disabled
      And I quit website


      #TC-18
    Scenario: Verify user can update number of guests on Home page
      Given I launch webpage
      When I Click on Guests
      Then I Select “Adults as 4
      And I Select “Children” as 2
      And I Select first child age: 4
      Then I Select second child age: <1
      And I Verify: On Rooms pop-up, number of adults and children as same as selected on step #3 and #4.
      Then I Click Apply
      And I Verify total number of guests in sum of adults and children as same as selected on step #3 and #4.
