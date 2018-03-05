package pages;

import acceptance.Runner;
import acceptance.type.StudentClassType;
import acceptance.type.StudentType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class ClassPage extends BasePage {

    @FindBy(id = "name")
    private WebElement className;

    @FindBy(id = "short_name")
    private WebElement classAcronym;

    @FindBy(id = "location")
    private WebElement classLocation;

    @FindBy(id = "about")
    private WebElement classAbout;

    @FindBy(id = "colour")
    private WebElement classColour;

    @FindBy(id = "level")
    private WebElement classLevel;

    @FindBy(xpath = "//select[@name='lecturer']")
    private WebElement lecturer;

    @FindBy(xpath = "//div[2]/div[8]/div[2]/div[1]/div[2]")
    private WebElement coursesDropDown;

    @FindAll({@FindBy(xpath = "//div[8]/div[2]/div[2]/div")})
    public List<WebElement> listSubjectsOfferedInClass;


    private WebDriver driver;
    private Select select;
    private List<WebElement> options;

    public ClassPage(Runner runner) {
        this.runner = runner;
        this.driver = runner.getDriver();
        PageFactory.initElements(driver, this);
    }

    // What is color
    public void createANewClass(StudentClassType studentClass){
        className.sendKeys(studentClass.getName());
        classAcronym.sendKeys(studentClass.getShort_name());
        classLocation.sendKeys(studentClass.getLocation());
        classAbout.sendKeys(studentClass.getAbout());
        classColour.sendKeys(studentClass.getColour());
        classLevel.sendKeys(studentClass.getLevel());
        selectStudentCurrentClass(studentClass.getLecturerName());
        selectMultipleClasses(studentClass);



    }

    private void selectStudentCurrentClass(String studentCurrentClass) {
        select = new Select(lecturer);
        options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(studentCurrentClass)) {
                option.click();
                break;
            }
        }

    }

    public void selectMultipleClasses(StudentClassType studentClass) {
        coursesDropDown.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(listSubjectsOfferedInClass));
        for (String studentCourse : studentClass.getOfferedClass()) {
            for (WebElement element : listSubjectsOfferedInClass) {
                if (element.getText().equalsIgnoreCase(studentCourse)) {
                    element.click();
                    break;
                }
            }
        }

    }


}
