Feature: create new course

  Scenario: user is creating a new course

    Given user login with correct username as "admin" and password as "password"
    And clicks on "course" icon
    And wait "1000" milliseconds
    And user enter course name as "course" on course page
    And user enter course acronym as "100" on course page
    And user enter about the course as "about literature" on course page
