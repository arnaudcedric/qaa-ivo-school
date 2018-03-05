Feature: create new Parent

  Scenario: The Admin is creating a parent
    Given user login with correct username as "admin" and password as "password"
    And wait "1000" milliseconds
    And clicks on "parent" icon
    And wait "1000" milliseconds
    And user enter parent's full name as "arnaud cedric" on parent page
    And user enter parent's email as "cedric@gmail.com" on parent page
    And user enter parent's phone number as 12345678989 on parent page
    And user enter parent's address as "23 quays douala" on parent page
#    And user clicks on create button on parent page