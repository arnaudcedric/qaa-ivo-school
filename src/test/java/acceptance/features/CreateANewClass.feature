Feature: create new Class

#  Scenario: user entering Class details on Class page
#
#    Given user login with correct username as "admin" and password as "password"
#    And clicks on "class" icon
#    And wait "1000" milliseconds
#    And class has multiple subjects with id "1"
#      | CHM |
#      | FRE |
#    And class details are entered on class page
#      | name        | short_name | location         | about         | colour | level | lecturerName | id |
#      | Class one A | C1         | near Class one B | Best IT class | Black  | 10    | admin admin  | 1  |


  Scenario Outline: user entering Class details on Class page

    Given user login with correct username as "admin" and password as "password"
    And clicks on "class" icon
    And wait "1000" milliseconds
    And class has multiple subjects with id "1"
      | CHM |
      | FRE |
    And class has multiple subjects with id "2"
      | CHM |
      | PHY |
    And class details are entered on class page
      | name         | short_name         | location | about         | colour         | level         | lecturerName         | id |
      | <class_name> | <class_short_name> | <near>   | <class_about> | <class_colour> | <class_level> | <class_lecturerName> | <class_id>  |

    Examples:
      | class_name  | class_short_name | near             | class_about            | class_colour | class_level | class_lecturerName |class_id|
      | Class one A | C1               | near Class one B | Best IT class          | Black        | 10          | admin admin        |1       |
      | Class one B | C2               | near Class one C | Best engineering class | blue         | 90          | Noble Elekwa       |2       |
