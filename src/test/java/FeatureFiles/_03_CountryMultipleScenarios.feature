Feature: Country Multi Scenario

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should be login successfuly
    And Navigate to country page

  @SmokeTest
  Scenario: Create a country
    When Create a country
    Then Success message should be displayed

  Scenario: Create a country parameter data
    When Create a country name as "enginnYeni1" code as "codee1"
    Then Success message should be displayed