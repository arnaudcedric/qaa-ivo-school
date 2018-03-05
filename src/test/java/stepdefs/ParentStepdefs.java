package stepdefs;

import acceptance.Runner;
import acceptance.client.IvoSchoolDbClient;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import pages.ParentPage;

public class ParentStepdefs {

    private ParentPage parentPage;
    private IvoSchoolDbClient dbclient;
    public ParentStepdefs(Runner runner){
        parentPage = new ParentPage(runner);
        dbclient = IvoSchoolDbClient.getInstance();
    }

    @And("^user enter parent's full name as \"([^\"]*)\" on parent page$")
    public void userEnterParentFullNameAsOnParentPage(String fullname) {
        parentPage.enterFullName(fullname);

    }

    @And("^user enter parent's email as \"([^\"]*)\" on parent page$")
    public void userEnterParentEmailAsOnParentPage(String email)  {
        parentPage.enterEmail(email);
    }

    @And("^user enter parent's phone number as (\\d+) on parent page$")
    public void userEnterParentPhoneNumberAsOnParentPage(String phoneNumber)  {
        parentPage.enterPhoneNumber(phoneNumber);

    }

    @And("^user enter parent's address as \"([^\"]*)\" on parent page$")
    public void userEnterParentAddressAsOnParentPage(String address) {
        parentPage.enterAddress(address);
    }

    @And("^user clicks on create button on parent page$")
    public void userClicksOnCreateButton() {
        parentPage.clickCreateButton();
    }
}
