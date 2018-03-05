package stepdefs;

import acceptance.Runner;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.NewsPage;

import java.util.List;

public class NewsStepdefs {

    private NewsPage newsPage;
    public NewsStepdefs(Runner runner){
        newsPage = new NewsPage(runner);
    }

    @And("^enter topic name as \"([^\"]*)\"$")
    public void enterTopicName(String topic) {
        newsPage.enterTopicName(topic);
    }

    @And("^enter content as \"([^\"]*)\"$")
    public void enterContentAs(String content)  {
        newsPage.enterContent(content);
    }

    @And("^user select the following list of classes from list$")
    public void userSelectTheFollowingList(List<String> classes) {
        newsPage.selectMultipleClasses(classes);
    }



    @And("^user select the following Courses from list$")
    public void userSelectTheFollowingCoursesFromList(List<String> courses) {
        newsPage.selectMultipleCourses(courses);
    }

    @And("^user chooses a lecturer \"([^\"]*)\"$")
    public void userChoosesALecturer(String lecturer) {
        newsPage.selectLecturerPostingNews(lecturer);
    }
}