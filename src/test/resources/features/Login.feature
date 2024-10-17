Feature: Login

  Scenario: Verify the Login with valid username and password
    Given The user is in the login page
    When enter valid email
    And enter valid password
    And click on Login button
    Then the user should be successfully login and redirected to dashboard page

  Scenario: Verify the Login with valid username and empty password
    Given The user is in the login page
    When enter valid email
    And enter empty password
    And click on Login button
    Then the user should be displayed with empty password error message

  Scenario: Verify the Login with empty username and valid password
    Given The user is in the login page
    When enter empty username
    And enter valid password
    And click on Login button
    Then the user should be displayed with empty email error message

  Scenario: Verify the Login with empty username and empty password
    Given The user is in the login page
    When enter empty username
    And enter empty password
    And click on Login button
    Then the user should be displayed with empty user and password error messages


  @ignore
  Scenario: Verify the Login with invalid username and password
    Given The user is in the login page
    When enter invalid username
    And enter invalid password
    And click on Login button
    Then the user should be displayed with invalid user/password error message

  @ignore
  Scenario: Verify the Login with username and password in upper case
    Given The user is in the login page
    When enter valid username in upper case
    And enter valid password in upper case
    And click on Login button
    Then the user should be displayed with invalid user/password error message