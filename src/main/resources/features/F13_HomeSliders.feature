@smoke
Feature: F13_HomeSliders - user could access products through sliders

  Scenario: user could access Lumia product through first slider

    When user opens homepage
    And user clicks on Lumia slider
    Then user opens Lumia product successfully
  Scenario: user could access iPhone product through second slider
    When user opens homepage
    And user clicks on iPhone slider
    Then user opens iPhone product successfully