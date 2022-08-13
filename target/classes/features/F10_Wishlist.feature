@smoke

Feature: F10_Wishlist - user could add different products to Wishlist

  Background:user could log in with valid credentials
    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button
    Then user login is done successfully

  Scenario: user could add different products to Wishlist
    Given user opens homepage
    When user selects MacBook
    And user clicks on add to wishlist for MacBook
    Then product is added successfully to Wishlist
    And user selects Books category
    When user selects pies book
    And user clicks on add to wishlist for book
    Then product is added successfully to Wishlist