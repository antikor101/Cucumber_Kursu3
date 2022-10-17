Feature: Entrance Fee Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should be login successfuly


  Scenario Outline:Create and Delete a Fee
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput       | <FeeName>         |
      | codeInput       | <Code>            |
      | integrationCode | <IntegrationCode> |
      | priorityCode    | <Priority>        |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed
    
    And User delete item from Dialog
      | <FeeName> |

    Then Success message should be displayed

    Examples:
      | FeeName | Code  | IntegrationCode | Priority |
      | denme1  | 7655  | 33222           | 112233   |
      | denme2  | 4433  | 5422323         | 123123   |
      | denme3  | 9876  | 123123          | 4124211  |
      | denme4  | 09887 | 54333           | 1232123  |

