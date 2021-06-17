Feature: feature to test multiple scenarios

  Background: user is logged in
    Given user is on login page
    When user Pass valid username and password
    Then user navigates to home page

  Scenario Outline: To check campaign is created are Not
    When user click on campaign module
    Then campaign list page is displayed
    When user click on <Newcampaign button
    Then create Newcampaign page is displayed`
    When give valid campaignName and Numvalue
    And click on saveBtn
    Then user is navigated to campaign details page

  Scenario Outline: To check Potential is created are Not
    When user click on Potentials module
    Then Potential list page is displayed
    When user clicks on Potential button
    Then create Potential page is displayed
    When user give valid <Potential Name>
    And user clicks on saveBtn
    Then user is navigated to Potential details page

    Examples: 
      | Potential Name |
      | Srikant        |
