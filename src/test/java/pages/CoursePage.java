package pages;

import acceptance.Runner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class CoursePage extends BasePage {


    @FindBy(id = "about")
    private WebElement aboutTextBox;

    @FindBy(id = "grade_points")
    private WebElement gradePointsTextBox;

    @FindBy(id = "is_mandatory")
    private WebElement is_mandatoryTextBox;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButton;

    //button[contains(text(),'Create')]

    public void createANewCourse() {
        aboutTextBox.sendKeys();
        gradePointsTextBox.sendKeys();
        is_mandatoryTextBox.sendKeys();
//        createButton.click();
    }

    public void enterAboutTheCourse(String about) {
        aboutTextBox.sendKeys(about);
    }

    public void enterGradePoint(String gradePoint) {
        gradePointsTextBox.sendKeys(gradePoint);
    }

    public void enterIsMandatory(String isMandatory) {
        is_mandatoryTextBox.sendKeys(isMandatory);
    }

    private WebDriver driver;
    private Select select;
    private List<WebElement> options;

    public CoursePage(Runner runner) {
        this.runner = runner;
        driver = runner.getDriver();
        PageFactory.initElements(driver, this);
    }
}
