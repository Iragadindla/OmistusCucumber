Feature: Feature to Test  Lead creation

  Scenario: To check lead created are not
    Given browser is avalable
    When giving valid user login credentials
    And user clicking leadmodule
    And user created lead with valid Data
    Then user navigated to leads details page
