package stepdefs;

import acceptance.Runner;
import acceptance.client.IvoSchoolDbClient;
import acceptance.type.LecturerType;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.apache.bcel.ExceptionConstants;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pages.LecturerPage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class LecturerStepdefs {

    private LecturerPage lecturerpage;
    private IvoSchoolDbClient dbclient;

    public LecturerStepdefs(Runner runner) {
        this.lecturerpage = new LecturerPage(runner);
        dbclient = IvoSchoolDbClient.getInstance();


    }

    Map<Integer, List<String>> courses = new HashMap<>();

    @And("^lecturer has multiple courses with id \"([^\"]*)\"$")
    public void lecturerHasMultipleCoursesWithId(int id, List<String> lecturerCourses) {
        this.courses.put(id, lecturerCourses);

    }

    @And("^lectuer details are entered on lecturer page$")
    public void lectuerDetailsAreEnteredOnLecturerPage(List<LecturerType> lecturers) {

        for (LecturerType lecturer : lecturers) {
            lecturer.setCourses(courses.get(lecturer.getId()));
            lecturerpage.createANewLecturer(lecturer);
        }
    }

    @Then("^verify lecturer with \"([^\"]*)\" email exist in db$")
    public void verifyLecturerExistInDb(String email) {
        assertThat("Lecturer with " + email + " does exist in the db ", dbclient.hasLecturer(email));

    }

    //TODO if a lecturer already exist in the db update the db info
    @And("^user clicks on create button on Lecturer Page$")
    public void userClicksOnCreateButton() {
        lecturerpage.clickCreateButton();
    }

    @And("^delete lecturer with \"([^\"]*)\" email address")
    public void deleteLecturerRecord(String email) {
        dbclient.deleteLecturerRecord(email);
    }


}