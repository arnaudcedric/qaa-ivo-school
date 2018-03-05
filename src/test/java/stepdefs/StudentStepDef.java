package stepdefs;

import acceptance.Runner;
import acceptance.client.IvoSchoolDbClient;
import acceptance.type.StudentType;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.StudentPage;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;


public class StudentStepDef {

    private StudentPage studentPage;
    private IvoSchoolDbClient dbClient;
    Map<Integer, List<String>> courses = new HashMap<>();

    public StudentStepDef(Runner runner){
        this.studentPage = new StudentPage(runner);
        dbClient = IvoSchoolDbClient.getInstance();
    }

    @And("^student details are entered on student page$")
    public void studentDetailsAreEnteredOnStudentPage(List<StudentType> students) {
        for (StudentType student : students) {
            student.setCourses(courses.get(student.getCoursesId()));
            studentPage.enterStudentDetails(student);
        }
    }

    @And("^student has multiple courses with id \"([^\"]*)\"$")
    public void studentHasMultipleCoursesWithId(int id,List<String> studentCourses){
        /*this.*/courses.put(id,studentCourses);
    }

    @Then("^the following text are spelled correctly on student page$")
    public void theFollowingTextAreSpelledCorrectlyOnStudentPage(List<String> texts) {

        assertThat(studentPage.getPrenomLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getPrenomLabel().getText()));
        assertThat(studentPage.getLastNameLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getLastNameLabel().getText()));
        assertThat(studentPage.getEmailLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getEmailLabel().getText()));
        assertThat(studentPage.getPhoneNumberLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getPhoneNumberLabel().getText()));
        assertThat(studentPage.getdOBLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getdOBLabel().getText()));
        assertThat(studentPage.getCountryOfOriginLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getCountryOfOriginLabel().getText()));
        assertThat(studentPage.getGenderLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getGenderLabel().getText()));
        assertThat(studentPage.getPreviousSchoolLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getPreviousSchoolLabel().getText()));
        assertThat(studentPage.getAddressLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getAddressLabel().getText()));
        assertThat(studentPage.getStudentsCurrentClassLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getStudentsCurrentClassLabel().getText()));
        assertThat(studentPage.getCoursesLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getCoursesLabel().getText()));
        assertThat(studentPage.getParentsLabel().getText() + " is the correct spelling ", texts.contains(studentPage.getParentsLabel().getText()));

    }

    @And("wait \"(.*)\" milliseconds")
    public void waitForTopicsMessages(long millis) {
        try {
            Thread.sleep(millis);
        } catch (Exception var4) {
            var4.printStackTrace();
        }
    }

    @And("^user clicks on create button$")
    public void userClicksOnCreateButton() {
        studentPage.clickOnCreateButtonOnStudentPage();
    }

    @And("^error message is displayed$")
    public void errorMessageIsDisplayed() {
        assertTrue(studentPage.getErrorMessage().isDisplayed());
    }

    @Then("^verify student with email \"([^\"]*)\" is not present in the database$")
    public void verifyStudentWithEmailIsNotPresentInTheDatabase(String email){
        assertThat("student exist in the db ", !dbClient.hasStudent(email));
    }

    @Then("^verify student with email \"([^\"]*)\" is present in the database$")
    public void verifyStudentWithEmailIsPresentInTheDatabase(String email) {
        assertThat("student exist in the db ", dbClient.hasStudent(email));

    }

    @And("^student is deleted from the database with email \"([^\"]*)\"$")
    public void studentIsDeletedFromTheDatabaseWithEmail(String email)  {
        dbClient.deleteStudentRecord(email);
    }

    @And("^student details are entered on student page with out parent$")
    public void studentDetailsAreEnteredOnStudentPageWithOutParent(List<StudentType> students) {
        for (StudentType student : students) {
            studentPage.enterStudentDetailswWithOutParent(student);
        }
    }

    @And("^student details are entered on student page with out order$")
    public void studentDetailsAreEnteredOnStudentPageWithOutOrder(List<StudentType> students) {
        for (StudentType student : students) {
            studentPage.enterStudentDetailswWithOutGender(student);
        }
    }

    @And("^student details are entered on student page with out parent and order$")
    public void studentDetailsAreEnteredOnStudentPageWithOutParentAndOrder(List<StudentType> students) {
        for (StudentType student: students){
            studentPage.enterStudentDetailsWithOutGenderAndParent(student);
        }
    }

    @And("^user verifies student with \"([^\"]*)\" is present on the left hand panel$")
    public void userVerifiesStudentWithNameIsPresentOnTheLeftHandPanel(String name) {
        assertTrue(studentPage.verifyStudentNameIsPresent(name));
    }

}
