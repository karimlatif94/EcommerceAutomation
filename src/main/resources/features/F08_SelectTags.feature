@smoke

Feature: F08_Select Tags | user selects different tags

  Background:user could log in with valid credentials

    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button
    Then user login is done successfully


  Scenario:
    Given user selects electronics category
    And user clicks camera tag
    And user clicks cell tag



