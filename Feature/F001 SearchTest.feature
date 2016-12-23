@MultiTest
Feature: F001-Test MultiFeature

  @Multi
  Scenario: 001_Login with Invalid username and password
    Given F001 S001 User is on Home Page
    When F001 S001 User Navigate to LogIn Page
    And F001 S001 User enters invalid UserName and Password
    Then F001 S001 Invalid Message displayed
