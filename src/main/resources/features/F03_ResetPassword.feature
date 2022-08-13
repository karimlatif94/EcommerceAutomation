@smoke
Feature: F03_ResetPassword - user could reset password successfully

  Background:user could log in with valid email and password
    Given user navigates to login page
    And user clicks login link
    And user enters correct email
    And user enters correct password
    And user clicks on login button
    Then user login is done successfully


  Scenario: user could reset password successfully

    Given user navigates to login page
    And user clicks on forget password link
    And user enters his Email
    And user clicks on Recover button

    Then Reset message is displayed