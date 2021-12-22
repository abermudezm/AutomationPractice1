Feature: Login

  @SmokeTest
  Scenario: Verify the Login with valid username and password
    Given the user is in the main page
    When click on My Account menu
    And enter valid username
    And enter valid password
    And click on Login button
    Then the user should be successfully login to the web page

  Scenario: Verify the Login with invalid username and incorrect password
    Given the user is in the main page
    When click on My Account menu
    And enter invalid username
    And enter invalid password
    And click on Login button
    Then the user should be displayed with invalid user/password error message

  Scenario: Verify the Login with valid username and empty password
    Given the user is in the main page
    When click on My Account menu
    And enter valid username
    And enter empty password
    And click on Login button
    Then the user should be displayed with empty password error message

  Scenario: Verify the Login with empty username and valid password
    Given the user is in the main page
    When click on My Account menu
    And enter empty username
    And enter valid password
    And click on Login button
    Then the user should be displayed with empty user error message

  Scenario: Verify the Login with empty username and empty password
    Given the user is in the main page
    When click on My Account menu
    And enter empty username
    And enter empty password
    And click on Login button
    Then the user should be displayed with empty user/password error message

  Scenario: Verify the Password word is masked
    Given the user is in the main page
    When click on My Account menu
    And enter a password
    Then the password should be masked

  Scenario: Verify the Login with username and password in upper case
    Given the user is in the main page
    When click on My Account menu
    And enter valid username in upper case
    And enter valid password in upper case
    And click on Login button
    Then the user should be displayed with invalid user/password error message