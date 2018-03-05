package pages;

import acceptance.Runner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ParentPage extends BasePage {


    @FindBy(id = "name")
    private WebElement fullName;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "phone_number")
    private WebElement phoneNumber;

    @FindBy(id = "address")
    private WebElement address;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButtonOnParentPage;

    private WebDriver driver;
    private Select select;
    private List<WebElement> options;
    public ParentPage(Runner runner){
        this.runner = runner;
        driver = runner.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void enterFullName(String fullName){
        this.fullName.sendKeys(fullName);
    }
    public void enterEmail(String email){
        this.email.sendKeys(email);
    }
    public void enterPhoneNumber(String phoneNumber){
        this.phoneNumber.sendKeys(phoneNumber);
    }
    public void enterAddress(String address){
        this.address.sendKeys(address);
    }
    public void clickCreateButton(){
        createButtonOnParentPage.click();
    }






}
