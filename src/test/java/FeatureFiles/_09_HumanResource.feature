Feature: Entrance Human Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should be login successfuly


  Scenario Outline:Create and Delete a Human
    And Click on the element in the left Nav
      | humanResources |
      | employees      |


    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | firstName | <FirstName> |
      | lastName  | <LastName>  |

    And Click on the element in the Form Content
      | gender         |
      | <Gender>       |
      | employeeType   |
      | <EmployeeType> |


#     And Click on the element in the Dialog
#       | saveButton |

#     Then Success message should be displayed

#     And User delete item from Dialog
#       | <FeeName> |

#     Then Success message should be displayed

    Examples:
      | FirstName | LastName | Gender | EmployeeType |
      | engin     | kandemir | male   | other        |
