package stepdefs;

import acceptance.Runner;
import cucumber.api.java.en.Given;
import pages.LoginPage;


public class LoginStepDef {

    private LoginPage page;
//    private DashboardPage dashboardPage;

    public LoginStepDef(Runner runner) {
        this.page = new LoginPage(runner);
//        this.dashboardPage = new DashboardPage(runner);

    }

//    pages.LoginPage pages = new pages.LoginPage();
    //pages.LoginPage pages = new pages.LoginPage();
    @Given("^user login with correct username as \"([^\"]*)\" and password as \"([^\"]*)\"$")
    public void userLoginWithCorrectUsernameAsAndPasswordAs(String username, String password) {
//        page.loadChromeDriver(username);
        page.loadApplicationPage();
        page.login(username, password);
    }
}