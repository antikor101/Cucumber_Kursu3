Feature: Citizenship with scenario Outline

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should be login successfuly
    And Navigate to Citizenship page

  Scenario Outline: Citizenship create
    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Success message should be displayed

    When User a Citizenship name as "<CitizenshipName>" short name as "<ShortName>"
    Then Already exist message should be displayed
    And Click on close button

    When User delete the "<CitizenshipName>"
    Then Success message should be displayed

    Examples:
      | CitizenshipName | ShortName |
      | En1121          | ng1311    |
      | En2221          | ng2231    |
      | En32311         | ng3331    |
      | En4241          | ng4421    |
      | En5521          | ng5521    |