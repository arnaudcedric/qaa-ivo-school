package stepdefs;

import acceptance.Runner;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.GradePage;

public class GradeStepdefs {

    private GradePage gradePage;
    public GradeStepdefs(Runner runner){
        gradePage = new GradePage(runner);
    }

    @And("^user enter grade's name as \"([^\"]*)\" on grade page$")
    public void userEnterGradeSNameOnGradePage(String gradeName) {
        gradePage.enterGradeName(gradeName);
    }

    @And("^enter acronym as \"([^\"]*)\"$")
    public void enterAcronymAs(String acronym) {
        gradePage.enterGradeAcronym(acronym);
    }

    @And("^enter top margin as \"([^\"]*)\"$")
    public void enterTopMarginAs(String topMargin) {
        gradePage.enterGradeTopMargin(topMargin);
    }

    @And("^enter bottom margin as \"([^\"]*)\"$")
    public void enterBottomMarginAs(String bottomMargin) {
        gradePage.enterGradeBottomMargin(bottomMargin);

    }

    @And("^point equivalence as \"([^\"]*)\"$")
    public void pointEquivalenceAs(String pequivalence) {
        gradePage.enterGradePointEquivalence(pequivalence);
    }

    @And("^user click's on create button$")
    public void userClickSOnCreateButton() {
        gradePage.clickCreateButton();
    }
}
