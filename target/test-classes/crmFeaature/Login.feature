Feature: login to app from prop path

  Scenario: login to zoho
    Given browser open
    When login application
    Then navigates to requiredPage
