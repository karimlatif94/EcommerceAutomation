@smoke
Feature: F05_SwitchCurr - user could switch between currencies US-Euro

  Background:user could log in with valid email and password

    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button

    Then user login is done successfully

  Scenario:logged user could switch between currencies US-Euro
    Given user opens homepage

    And user selects Euro from menu
    Then user selects Euro successfully
    And user selects US Dollar from menu
    Then user selects US Dollar successfully
