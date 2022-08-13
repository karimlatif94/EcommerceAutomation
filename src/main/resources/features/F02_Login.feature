@smoke
Feature: F02_Login - user could login with valid email and password

  Scenario: user could log in with valid email and password

    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button

    Then user login is done successfully