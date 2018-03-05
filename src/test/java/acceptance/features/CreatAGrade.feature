Feature: create new Grade

  Scenario: user entering a Grade on the Grade page

    Given user login with correct username as "admin" and password as "password"
    And clicks on "grade" icon
    And wait "1000" milliseconds
    And user enter grade's name as "Distinction" on grade page
    And enter acronym as "D+"
    And enter top margin as "100"
    And enter bottom margin as "80"
    And point equivalence as "3"
#    And user click's on create button