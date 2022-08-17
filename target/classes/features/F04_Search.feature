@smoke
Feature: F04_Search - user could search for product

  Background: user could log in with valid email and password

    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button

    Then user login is done successfully

  Scenario: user could search for any product

    When user opens homepage
    And user searches by product name for NIKE SHOES
    Then user finds product results successfully
    When user searches by SKU for NIKE SHOES
    Then user finds product result by SKU successfully
