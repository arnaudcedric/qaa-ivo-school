package pages;

import acceptance.Runner;
import acceptance.type.LecturerType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;
import java.util.logging.Logger;

public class LecturerPage extends BasePage {


    @FindBy(id = "first_name")
    private WebElement firstName;

    @FindBy(id = "last_name")
    private WebElement last_name;

    @FindBy(id = "qualification")
    private WebElement qualification;

    @FindBy(id = "email")
    private WebElement email;

    @FindBy(id = "phone_number")
    private WebElement phone_number;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement dob;

    @FindBy(xpath = "//select[@name='nationality']")
    private WebElement countryOfOrigin;

    @FindAll({@FindBy(xpath = "//div[@class='switch']/div")})
    public List<WebElement> ListOfGender;

    @FindBy(id = "previous_work_place")
    private WebElement previousWorkPlace;

    @FindBy(id = "address")
    private WebElement address;

    @FindAll({@FindBy(xpath = "//div[2]/div[11]/div[2]/div[2]/div")})
    public List<WebElement> listOfCourses;

    @FindBy(xpath = ".//*[@id='app-container']/div[3]/div/div[2]/div/div[1]/div[2]/div[11]/div[2]/div[1]/div[2]")
    private WebElement coursesDropDown;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButtonOnLecturerPage;

    @FindBy(xpath = "//div[contains(text(),'Error in form, check highlighted fields')]")
    private WebElement errorMessage;

    @FindBy(xpath = "//div[contains(text(),'Error encountered trying to create')]")
    private WebElement dberrorMessage;

    public WebElement getDberrorMessage() {
        return dberrorMessage;
    }

    public void setDberrorMessage(WebElement dberrorMessage) {
        this.dberrorMessage = dberrorMessage;
    }

    public WebElement getErrorMessage() {
        return errorMessage;
    }

    private WebDriver driver;
    private Select select;
    private List<WebElement> options;
    private final Logger log = Logger.getLogger(getClass().getName());
    public LecturerPage(Runner runner) {
        this.runner = runner;
        driver = getDriver();
        PageFactory.initElements(driver, this);
    }


    public void createANewLecturer(LecturerType lectuer) {
        firstName.sendKeys(lectuer.getFirst_name());
        last_name.sendKeys(lectuer.getLast_name());
        qualification.sendKeys(lectuer.getQualification());
        email.sendKeys(lectuer.getEmail());
        phone_number.sendKeys(lectuer.getPhone_Number());
        dob.clear();
        dob.sendKeys(lectuer.getDob());
        selectACountryOfOrigin(lectuer.getNationality());
        selectGender(lectuer.getGender());
        previousWorkPlace.sendKeys(lectuer.getPrevious_work_place());
        address.sendKeys(lectuer.getAddress());
        selectCourse(lectuer);

    }

    private void selectACountryOfOrigin(String country) {
        countryOfOrigin.click();
        select = new Select(countryOfOrigin);
        options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(country)) {
                option.click();
                break;
            }
        }
    }


    private void selectCourse(LecturerType lectuer) {
        coursesDropDown.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfCourses));
        for (String studentCourse : lectuer.getCourses()) {
            for (WebElement element : listOfCourses) {
                if (element.getText().equalsIgnoreCase(studentCourse)) {
                    scrollElementInToView(element);
                    element.click();
                    break;
                }
            }
        }

    }

    public void selectGender(String studentGender) {
        for (WebElement gender : ListOfGender) {
            if (gender.getText().equalsIgnoreCase(studentGender)) {
                gender.click();
            }
        }
    }

    public void selectDate(){

    }

    public void clickCreateButton() {
        createButtonOnLecturerPage.click();
    }
}