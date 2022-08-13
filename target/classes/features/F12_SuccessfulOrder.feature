@smoke

Feature: F12_SuccessfulOrder - user could create successful order
  Background: user could add different products to shopping cart
    Given user opens homepage
    When user selects HTC mobile
    And user clicks on add to cart button for mobile
    Then product is added successfully

    When user selects Portable Sound Speakers
    And user clicks on add to cart button for speakers
    Then product is added successfully

  Scenario: user could create successful order
    Given user clicks on shopping cart link
    And user accepts the agreement
    When user clicks on checkout button
    And user enters correct email
    And user enters correct password
    And user clicks on login button
    Then user login is done successfully
    And user accepts the agreement
    When user clicks on checkout button
    And user fills all fields
    And user clicks on continue button
    And user select delivery method and click continue button
    And user select payment method and click continue button
    And user clicks continue button
    And user clicks confirm button

    Then order is processed successfully