@smoke
Feature: F06_Categories - user could select different categories

  Background:user could log in with valid credentials

    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button

    Then user login is done successfully

  Scenario: user could select different categories

    Given user opens homepage
    When user selects Digital Downloads category
    And user selects Electronics category then hover to Others subcategory
    And  user selects Books category