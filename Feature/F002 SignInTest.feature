@Login
Feature: F002-Tricentis webshop LoginTest

  @ValidLogin
  Scenario: 001_Login with valid username and password
    Given F002 S001 User is on Home Page
    When F002 S001 User Navigate to LogIn Page
    And F002 S001 User enters UserName and Password
    Then F002 S001 Message displayed Login Successfully

  @InvalidLogin
  Scenario: 002_Login with Invalid username and password
    Given F002 S002 User is on Home Page
    When F002 S002 User Navigate to LogIn Page
    And F002 S002 User enters invalid UserName and Password
    Then F002 S002 Invalid Message displayed
