Feature: enter news details

  Background:
    Given user login with correct username as "admin" and password as "password"
    And wait "1500" milliseconds

#    TODO VERY IMPORTANT need to update this in all feature files
    And clicks on "news" icon on the left
    And wait "1000" milliseconds

  Scenario: user entering new details
    And enter topic name as "students"
    And enter content as "you need to read"
    And user select the following list of classes from list
      | J2C |
      | J1C |
    And user select the following Courses from list
      | J1A-ENG |
      | J1B-Ven |
    And user chooses a lecturer "Orkuma Ivo"
