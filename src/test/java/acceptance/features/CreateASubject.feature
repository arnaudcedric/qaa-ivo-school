Feature: enter Subject details

  Scenario: user entering subject details on Subject page
    Given user login with correct username as "admin" and password as "password"
    And clicks on "subject" icon
    And wait "1000" milliseconds
    And user enter subject name as "literature" on Subject page
    And user enter subject acronym as "LIT" on Subject page
    And user enter about the subject as "about literature" on Subject page
    And wait "1000" milliseconds
    And user choose "J2C" from the list of classes

  Scenario: user entering subject details on Subject page with multiple class selections
    Given user login with correct username as "admin" and password as "password"
    And clicks on "subject" icon
    And wait "1000" milliseconds
    And user enter subject name as "literature" on Subject page
    And user enter subject acronym as "LIT" on Subject page
    And user enter about the subject as "about literature" on Subject page
    And wait "1000" milliseconds
    And user chooses the following classes
    |J1C|
    |J2C|

#     TODO check label name spelling
