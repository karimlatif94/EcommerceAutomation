@smoke

Feature: F09_ShoppingCart - user could add different products to shopping cart

  Background:user could log in with valid credentials
    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button
    Then user login is done successfully

  Scenario: user could add different products to shopping cart
    Given user opens homepage
    When user selects HTC mobile
    And user clicks on add to cart button for mobile
    Then product is added successfully

    When user selects Portable Sound Speakers
    And user clicks on add to cart button for speakers
    Then product is added successfully
