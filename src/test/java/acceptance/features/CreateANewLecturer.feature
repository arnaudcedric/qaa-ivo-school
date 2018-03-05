Feature: create new Lecturer

#  Scenario: user entering Lectuer details on Lectuer page
#
#    Given user login with correct username as "admin" and password as "password"
#    And clicks on "lecturer" icon
#    And wait "1000" milliseconds
#    And lecturer has multiple courses with id "1"
#      | S3A-CHM |
#      | S2B-ENG |
#    And lectuer details are entered on lecturer page
#      | first_name | last_name | qualification | email            | phoneNumber  | dob        | nationality | gender | previous_work_place | address         |id|
#      | Arnaud     | cedric    | agile testing | cedric@gmail.com | 078522387855 | 1982-12-12 | cameroon    | male   | SIS                 | douala cameroon |1 |

  Scenario Outline: user entering Lecturer's details on Lecturer's page

    Given user login with correct username as "admin" and password as "password"
    And wait "2000" milliseconds
    And clicks on "lecturer" icon
    And wait "2000" milliseconds
    And lecturer has multiple courses with id "1"
      | S3A-CHM |
      | S2B-ENG |

    And lecturer has multiple courses with id "2"
      | J2C-ENG |
      | J1C-MTH |
#    TODO check for "error in form, highlighted fields" text after click
    And lectuer details are entered on lecturer page
      | first_name   | last_name   | qualification    | email    | phone_Number    | dob    | nationality    | gender    | previous_work_place    | address    | id    |
      | <lFirstName> | <lLastName> | <lQualification> | <lEmail> | <lPhone_Number> | <ldob> | <lNationality> | <lGender> | <lPrevious_work_place> | <lAddress> | <lId> |
    And user clicks on create button on Lecturer Page
    Then verify lecturer with "cedric@gmail.com" email exist in db
    And delete lecturer with "cedric@gmail.com" email address
    Examples:
      | lFirstName | lLastName | lQualification | lEmail           | lPhone_Number | ldob       | lNationality | lGender | lPrevious_work_place | lAddress        | lId |
      | Arnaud     | cedric    | agile testing  | cedric@gmail.com | 07852238785   | 1982-12-12 | cameroon     | male    | SIS                  | douala cameroon | 1   |
#      | Arnaud22   | cedric22  | agile testing22 | cedric@gmail22.com | 07852238785  | 1982-12-12 | india        | female  | SIS 22               | Abuja Nigeria   | 2   |