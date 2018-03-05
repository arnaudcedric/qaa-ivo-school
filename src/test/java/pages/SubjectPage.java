package pages;

import acceptance.Runner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class SubjectPage extends BasePage {
    // TODO prerequisite not need but its good for a clean test
    // TODO Need to Create a Class in the ClassPage.java

    @FindBy(id = "name")
    private WebElement subjectNameTextBox;

    @FindBy(id = "short_name")
    private WebElement subjectacronym;

    @FindBy(id = "about")
    private WebElement subjectAbout;

    @FindBy(xpath = ".//*[@id='app-container']/div[3]/div/div[2]/div/div[1]/div[2]/div[4]/div[2]/div[1]/div[2]")
    private WebElement classesDropDown;

    @FindBy(xpath = "//div[@class='initialText']/p/span[contains(text(),'NEW')]")
    private WebElement newLink;

    @FindAll({@FindBy(xpath = "//div[@class='checker-options']/div")})
    private List<WebElement> listOfClasses;

    private WebDriver driver;
    private Select select;
    private List<WebElement> options;

    public SubjectPage(Runner runner) {
        this.runner = runner;
        driver = runner.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void enterSubjectName(String subjectName) {
        subjectNameTextBox.sendKeys(subjectName);
    }

    public void enterAcronym(String subjectAcronym) {
        subjectacronym.sendKeys(subjectAcronym);
    }

    public void enterAboutSubject(String aboutSubject) {
        subjectAbout.sendKeys(aboutSubject);
    }

    public void selectClass(String studentClass) {
        classesDropDown.click();
        //        TODO better to wait
        waitTime().until(ExpectedConditions.visibilityOfAllElements(listOfClasses));
        WebElement SubjectClassElement = driver.findElement(By.xpath("//div[contains(text(),'" + studentClass + "')]"));

        SubjectClassElement.click();
    }

    private List<String> addClassesTextToList() {
//        TODO better to wait
        List<String> listOfClassesText = new ArrayList<>();
        for (int i = 0; i < listOfClasses.size(); i++) {

            listOfClassesText.add(listOfClasses.get(i).getText());

        }
        return listOfClassesText;
    }

    public void selectMultipleClasses(List<String> classes) {
        classesDropDown.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfClasses));
        for (String subjectClass : classes) {
            for (WebElement element : listOfClasses) {
                if (element.getText().equalsIgnoreCase(subjectClass)) {
                    element.click();
                    break;
                }
            }
        }

    }
}
