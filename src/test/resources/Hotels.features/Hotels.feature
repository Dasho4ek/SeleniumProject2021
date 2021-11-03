Feature: Hotels.com
  Background: I launch webpage


  #TC-21
  Scenario: Verify error message for invalid sign in credentials
    #Given I launch webpage
    When I click on Sign In link
    Then I enter incorrect email address
    And I enter incorrect password
    Then I click on Sign In button
    And I verify error message is displayed
    #And I quit website



#TC-19
   Scenario: Verify at the end of search results, "change dates" button is displayed and enabled.
    # Given I launch webpage
     When I select"“Bora Bora, Leeward Islands, French Polynesia” from auto suggestion
     Then I select November 1, 2021 as Check-in
     Then I select November 30, 2021 as Check-out
     And I click Apply button
     Then I click on "Search" button
     And I verify if change dates button is displayed and enabled
     #And I quit website


  #TC-20
  Scenario: Verify TermsAndConditions link and PrivacyStatements link open correct page on new tab
  #Given I launch webpage
  When I click on Sign In link
  Then I Click  on Sign up link
  Then I Click “Terms and Conditions” link
  And I Verify “Terms and Conditions” page opens in new tab
  Then I Click “Privacy Statement” link
  And I Verify “Privacy Statement” page opens in new tab
    #And I quit website


    #TC-17
    Scenario: Verify past date and back button on Current month's calendar is disabled
     # Given I launch webpage
    When I Click on CheckIn Calendar
    Then I Verify For current month
    Then I Verify if Past dates (if any) are disabled.
    And I Verify if Back button on current month is disabled
      #And I quit website


      #TC-18
    Scenario: Verify user can update number of guests on Home page
      #Given I launch webpage
      When I Click on Guests
      Then I Select “Adults as 4
      And I Select “Children” as 2
      And I Select first child age: 4
      Then I Select second child age: <1
      And I Verify: On Rooms pop-up, number of adults and children as same as selected on step #3 and #4.
      Then I Click Apply
      And I Verify total number of guests in sum of adults and children as same as selected on step #3 and #4.
      #And I quit website






      #TC-22
  Scenario: Verify error message for invalid data in SignUp form
    #Given I launch webpage
    When I click on Sign In link
    Then I click on Sign Up link
    Then I enter incorrect email address with at least '@' symbol
    And I verify error is displayed- Please check your email address
    Then I enter incorrect password with less than 6-characters
    And I verify if error message is displayed- Please enter a password containing at least six characters
    Then I enter password greater than 20-characters
    And I verify error is displayed- Your password cannot be more than 20 characters long
    Then I enter invalid first name
    And I verify error is displayed-Please check your first name
    Then I enter invalid last name
    And I verify error is displayed- Please check your last name
    #And I quit website

    #TC-23
  Scenario: Verify tick-mark when user enters correct data in SignUp form
    #Given I launch webpage
    When I click on Sign In link
    Then I click on Sign Up link
    Then I enter valid email address
    And I verify tick-mark is displayed
    Then I enter password between 6 and 20 characters
    And I verify tick-mark is displayed
    Then I Enter valid first name
    And I Verify tick-mark is displayed
    Then I Enter valid last name
    And I verify tick-mark is displayed
    #And I quit website

    #TC-24
  Scenario: Verify error is displayed when user submits the empty feedback form
    #Given I launch webpage
    When I select “Website feedback” from Help dropdown
    Then I click on Submit button
    Then I verify error message is displayed (Please fill in the required information highlighted below.)
    And I verify star boxes section is in a red dotted box.
    #And I quit website

    #TC-25
  Scenario: Verify user can submit feedback after completing the feedback form
    #Given I launch webpage
    When I select “Website feedback” from Help dropdown
    Then I select any star-rating
    And I enter any comment
  When I select any option for “How likely are you to return to Hotels.com?”
  Then I select any answer for “Prior to this visit, have you ever booked on Hotels.com?”
  Then I select any answer for ”Did you accomplish what you wanted to do on this page?”
  And I click on Submit button
  Then I verify “THANK YOU FOR YOUR FEEDBACK.“ is displayed
    #And I quit website

    #TC-26
  Scenario: Verify text/link on "Why book with Hotels.com?" section
    #Given I launch webpage
    When I go to “Why book with Hotels.com?” section
    Then I verify “Free cancellation on most hotels*” text with icon is displayed
    Then I verify “Our price guarantee find out more“ link with icon is displayed
    Then I verify “Get a reward night For every 10 nights you stay” link with icon is displayed
    And I click on “Our price guarantee find out more“ link
    Then Verify “Price Guarantee” heading is displayed
    When I go to “Why book with Hotels.com?” section
    Then I click on “Get a reward night For every 10 nights you stay” link
    And  I verify “Instant savings. Reward* nights. And more..” heading is displayed
    #And I quit website




