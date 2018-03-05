#@studentTest
Feature: enter Student detail
  Background:
    Given user login with correct username as "admin" and password as "password"
    And clicks on "student" icon
    And wait "1000" milliseconds
#TODO at the moment the test chooses only one course later a test should be written to choose multiple courses
#  Scenario: user entering student details on student page
#
#    Given user login with correct username as "admin" and password as "password"
#    And clicks on "student" icon
#    And wait "1000" milliseconds
#    Then the following text are spelled correctly on student page
#      | Prenom                    |
#      | Last Name                 |
#      | Email                     |
#      | Phone Number              |
#      | Date Of Birth(yyyy-mm-dd) |
#      | Country of Origin         |
#      | Gender                    |
#      | Previous School           |
#      | Address                   |
#      | Student's Current Class   |
#      | Courses                   |
#      | Parents                   |
#    And student details are entered on student page
#      | firstName | lastName | email            | phoneNumber | previousSchool | address          | date       | countryOfOrigin | studentsCurrentClass       | courses | gender | parent       |
#      | Arnaud    | Cedric   | cedric@gmail.com | 07852237856 | GEPS           | 23 salford quays | 1999-12-01 | Monaco          | Junior Secondary School 1A | S3A-CHM | Male   | Ivo Sengohol |

  Scenario: user entering student details on student page
    # this should normally be in background

    Then the following text are spelled correctly on student page
      | Prenom                    |
      | Last Name                 |
      | Email                     |
      | Phone Number              |
      | Date Of Birth(yyyy-mm-dd) |
      | Country of Origin         |
      | Gender                    |
      | Previous School           |
      | Address                   |
      | Student's Current Class   |
      | Courses                   |
      | Parents                   |
    And student has multiple courses with id "1"
      | S3A-CHM |
      | S2B-ENG |
    And student details are entered on student page
      | firstName | lastName | email            | phoneNumber | previousSchool | address          | date       | countryOfOrigin | studentsCurrentClass       | coursesId | gender | parent       |
      | Arnaud    | Cedric   | cedric@gmail.com | 07852237856 | GEPS           | 23 salford quays | 1999-12-01 | Monaco          | Junior Secondary School 1A | 1         | Male   | Ivo Sengohol |




#    And user clicks on create button
#    And wait "2000" milliseconds
#    And user verifies student with "Arnaud Cedric" is present on the left hand panel
#    Then verify student with email "cedric@gmail.com" is present in the database
#    And wait "1000" milliseconds
#    And student is deleted from the database with email "cedric@gmail.com"



#  Scenario: User entering student details with out the correct dob
#
#    And user login with correct username as "admin" and password as "password"
#    And clicks on student icon
#    And wait "1000" milliseconds
#    Then the following text are spelled correctly on student page
#      | Prenom                    |
#      | Last Name                 |
#      | Email                     |
#      | Phone Number              |
#      | Date Of Birth(yyyy-mm-dd) |
#      | Country of Origin         |
#      | Gender                    |
#      | Previous School           |
#      | Address                   |
#      | Student's Current Class   |
#      | Courses                   |
#      | Parents                   |
#
#    And student details are entered on student page
#      | firstName | lastName | email            | phoneNumber | previousSchool | address          | date       | countryOfOrigin | studentsCurrentClass       | courses | gender | parent       |
#      | Arnaud    | Cedric   | cedric@gmail.com | 07852237856 | GEPS           | 23 salford quays | 2001-12-01 | Monaco          | Junior Secondary School 1A | J1A-ENG | Male   | Ivo Sengohol |
#
#    And user clicks on create button
#    And wait "1000" milliseconds
#    And error message is displayed
#    And wait "1000" milliseconds
#    Then verify student with email "cedric@gmail.com" is not present in the database
#
#  Scenario: User entering student details with out parent
#
#    And user login with correct username as "admin" and password as "password"
#    And clicks on student icon
#    And wait "1000" milliseconds
#    Then the following text are spelled correctly on student page
#      | Prenom                    |
#      | Last Name                 |
#      | Email                     |
#      | Phone Number              |
#      | Date Of Birth(yyyy-mm-dd) |
#      | Country of Origin         |
#      | Gender                    |
#      | Previous School           |
#      | Address                   |
#      | Student's Current Class   |
#      | Courses                   |
#      | Parents                   |
#
#    And student details are entered on student page with out parent
#      | firstName | lastName | email            | phoneNumber | previousSchool | address          | date       | countryOfOrigin | studentsCurrentClass       | courses | gender |
#      | Arnaud    | Cedric   | cedric@gmail.com | 07852237856 | GEPS           | 23 salford quays | 2001-12-01 | Monaco          | Junior Secondary School 1A | J1A-ENG | Male   |
#    And user clicks on create button
#    And wait "1000" milliseconds
#    And error message is displayed
#    And wait "1000" milliseconds
#    Then verify student with email "cedric@gmail.com" is not present in the database
#
#  Scenario: User entering student details with out gender
#
#    And user login with correct username as "admin" and password as "password"
#    And clicks on student icon
#    And wait "1000" milliseconds
#    Then the following text are spelled correctly on student page
#      | Prenom                    |
#      | Last Name                 |
#      | Email                     |
#      | Phone Number              |
#      | Date Of Birth(yyyy-mm-dd) |
#      | Country of Origin         |
#      | Gender                    |
#      | Previous School           |
#      | Address                   |
#      | Student's Current Class   |
#      | Courses                   |
#      | Parents                   |
#
#    And student details are entered on student page with out order
#      | firstName | lastName | email            | phoneNumber | previousSchool | address          | date       | countryOfOrigin | studentsCurrentClass       | courses | parent       |
#      | Arnaud    | Cedric   | cedric@gmail.com | 07852237856 | GEPS           | 23 salford quays | 2001-12-01 | Monaco          | Junior Secondary School 1A | J1A-ENG | Ivo Sengohol |
#    And user clicks on create button
#    And wait "1000" milliseconds
#    And error message is displayed
#    And wait "1000" milliseconds
#    Then verify student with email "cedric@gmail.com" is not present in the database
#
#  Scenario: User entering student details with out gender and parent
#
#    And user login with correct username as "admin" and password as "password"
#    And clicks on student icon
#    And wait "1000" milliseconds
#    Then the following text are spelled correctly on student page
#      | Prenom                    |
#      | Last Name                 |
#      | Email                     |
#      | Phone Number              |
#      | Date Of Birth(yyyy-mm-dd) |
#      | Country of Origin         |
#      | Gender                    |
#      | Previous School           |
#      | Address                   |
#      | Student's Current Class   |
#      | Courses                   |
#      | Parents                   |
#
#    And student details are entered on student page with out parent and order
#      | firstName | lastName | email            | phoneNumber | previousSchool | address          | date       | countryOfOrigin | studentsCurrentClass       | courses |
#      | Arnaud    | Cedric   | cedric@gmail.com | 07852237856 | GEPS           | 23 salford quays | 2001-12-01 | Monaco          | Junior Secondary School 1A | J1A-ENG |
#    And user clicks on create button
#    And wait "1000" milliseconds
#    And error message is displayed
#    And wait "1000" milliseconds
#    Then verify student with email "cedric@gmail.com" is not present in the database