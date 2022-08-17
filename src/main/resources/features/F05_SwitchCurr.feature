@smoke
Feature: F05_SwitchCurr - user could switch between currencies US-Euro

  Background:user could log in with valid email and password

    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button

    Then user login is done successfully

  Scenario: user could switch between currencies to Euro
    Given user opens homepage

    When user switches currency to Euro
    Then Products currency is switched to Euro successfully

  Scenario: user could switch between currencies to US Dollar
    Given user opens homepage
    When user switches currency to Dollar
    Then Products currency is switched to Dollar successfully
