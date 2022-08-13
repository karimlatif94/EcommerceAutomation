@smoke

Feature: F11_CompareList - user could add different products to CompareList

  Background:user could log in with valid credentials
    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button
    Then user login is done successfully

  Scenario: user could add different products to Comparelist
    Given user opens homepage
    And user selects Books category
    When user selects pride Book
    And user clicks on add to CompareList
    Then product is added successfully to Comparelist

    And user selects Books category
    When user selects pies book
    And user clicks on add to CompareList
    Then product is added successfully to Comparelist