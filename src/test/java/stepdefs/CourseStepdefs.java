package stepdefs;

import acceptance.Runner;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.CoursePage;

public class CourseStepdefs {

    CoursePage coursePage;
    public CourseStepdefs(Runner runner) {
        this.coursePage = new CoursePage(runner);
    }

    @Then("^user enter course name as \"([^\"]*)\" on course page$")
    public void enterSubjectName(String about){
        coursePage.enterAboutTheCourse(about);
    }

    @And("^user enter course acronym as \"([^\"]*)\" on course page$")
    public void userEnterSubjectAcronymAsOnSubjectPage(String gradePoint){
        coursePage.enterGradePoint(gradePoint);
    }

    @And("^user enter about the course as \"([^\"]*)\" on course page$")
    public void userEnterAboutTheSubjectAsOnSubjectPage(String isMandatory) {
        coursePage.enterIsMandatory(isMandatory);
    }

}
