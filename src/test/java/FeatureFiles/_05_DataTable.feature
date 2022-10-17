Feature: Datatable Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should be login successfuly


  Scenario: Create Country
    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | countries  |

    And Click on the element in the Dialog

      | addButton |

    And User sending the keys in Dialog content

      | nameInput | Cerooountry1 |
      | codeInput | 1231222312 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog

      | Cerooountry1 |


  Scenario: Create a Nationality
    And Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | nationalities |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | CerNatt1 |

    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog

      | CerNatt1 |

    And Success message should be displayed

  Scenario: Create a Fee, delete Fee

    And Click on the element in the left Nav
      | setupOne   |
      | parameters |
      | fees       |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput       | feeeer1      |
      | codeInput       | 123123123 |
      | integrationCode | 43212     |
      | priorityCode    | 221231231 |


    And Click on the element in the Dialog
      | saveButton |

    And Success message should be displayed

    And User delete item from Dialog

      | feeeer1 |

    And Success message should be displayed





