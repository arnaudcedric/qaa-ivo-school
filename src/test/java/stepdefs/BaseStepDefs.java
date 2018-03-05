package stepdefs;

import acceptance.Runner;
import cucumber.api.java.en.And;
import pages.BasePage;

public class BaseStepDefs {

    private BasePage basePage;
    public BaseStepDefs(Runner runner){
        basePage = new BasePage(runner);
    }

    @And("^clicks on \"([^\"]*)\" icon$")
    public void clicksOnStudentIcon(String linkName) {
        basePage.clickRightNavigatorLinkByName(linkName);

    }

    @And("^clicks on \"([^\"]*)\" icon on the left$")
    public void clicksOnIconOnTheLeft(String linkName)  {
        basePage.clickLeftNavigatorLink(linkName);
    }

}
