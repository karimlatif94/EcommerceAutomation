@smoke
Feature: F07_ColorFilter - user could filter with color

  Background:user could log in with valid credentials

    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button

    Then user login is done successfully

  Scenario: user could filter with color
    Given user opens homepage
    When user selects Apparel category then hover to Shoes subcategory
    And user selects Shoes subcategory

    Then user filter by Red color