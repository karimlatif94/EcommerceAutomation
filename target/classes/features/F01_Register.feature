@smoke
Feature: F01_Register - users could register with new account

  Scenario: user could register with valid data successfully

    When user opens homepage
    And user clicks on register to open register page
    And user enters first name and last name
    And user enters valid Email address
    And user enters valid password and confirm it
    And user clicks on register button

    Then success message is displayed