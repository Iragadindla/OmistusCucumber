Feature: Feature to test login with invalid data

  Background: Different times opening
    Given Open the browser
    When Enter the url

  Scenario Outline: Try to  login with invalied Data
    Given I am in login page
    When gives valid <username> and <password>
    Then I am navigated to home page

    Examples: 
      | username  | password |
      | rashmi    |   raghav |
      | sreekanth |   123456 |
      | abc       |   123456 |
      | Raghav    | Raghav   |
