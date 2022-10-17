Feature: Entrance Exam Functionality

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should be login successfuly


  Scenario:Create and Delete a Exam
    And Click on the element in the left Nav
      | entranceExamsOne |
      | setupTwo         |
      | extranceExamsTwo |

    And Click on the element in the Dialog
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | sinaav1 |

    And Click on the element in the Form Content
      | academicPeriod  |
      | academicPeriod1 |
      | gradeLevel      |
      | gradeLevel2     |

    And Click on the element in the Dialog
      | saveButton |

    Then Success message should be displayed

    And Click on the element in the left Nav
      | entranceExamsOne |
      | setupTwo         |
      | extranceExamsTwo |

    And User delete item from Dialog
      | sinaav1 |

    Then Success message should be displayed











