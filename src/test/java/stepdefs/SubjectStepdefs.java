package stepdefs;

import acceptance.Runner;
import acceptance.client.IvoSchoolDbClient;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import pages.SubjectPage;

import javax.security.auth.Subject;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SubjectStepdefs {

    private IvoSchoolDbClient dbClient;
    SubjectPage subjectPage;

    public SubjectStepdefs(Runner runner){
        subjectPage = new SubjectPage(runner);
        dbClient = IvoSchoolDbClient.getInstance();
    }


    @Then("^user enter subject name as \"([^\"]*)\" on Subject page$")
    public void enterSubjectName(String subjectName){
        subjectPage.enterSubjectName(subjectName);
    }

    @And("^user enter subject acronym as \"([^\"]*)\" on Subject page$")
    public void userEnterSubjectAcronymAsOnSubjectPage(String subjectAcronym){
        subjectPage.enterAcronym(subjectAcronym);
    }

    @And("^user enter about the subject as \"([^\"]*)\" on Subject page$")
    public void userEnterAboutTheSubjectAsOnSubjectPage(String aboutSubject) {
        subjectPage.enterAboutSubject(aboutSubject);
    }

    @And("^user choose \"([^\"]*)\" from the list of classes$")
    public void userChooseFromAListOfClasses(String classes) {
        subjectPage.selectClass(classes);
    }

    @And("^user chooses the following classes$")
    public void userChoosesTheFollowingClasses(List<String> classes) {
        subjectPage.selectMultipleClasses(classes);
    }


}
