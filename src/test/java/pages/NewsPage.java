package pages;

import acceptance.Runner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class NewsPage extends BasePage {

    //TODO method on how to upload a file using automation

    @FindBy(id = "topic")
    private WebElement topicTextBox;
    @FindBy(id = "content")
    private WebElement contentextBox;
    @FindBy(xpath = "//div[2]/div[4]/div[2]/div[1]/div[2]")
    private WebElement classesDropDown;
    @FindAll({@FindBy(xpath = "//div[2]/div[4]/div[2]/div[2]/div")})
    public List<WebElement> listOfClasses;
    @FindBy(xpath = "//div[1]/div[2]/div[5]/div[2]/div[1]/div[2]")
    private WebElement coursesDropDown;
    @FindAll({@FindBy(xpath = "//div/div[1]/div[2]/div[5]/div[2]/div[2]/div")})
    public List<WebElement> listOfCourse;
    @FindBy(xpath = "//select[@name='lecturer']")
    private WebElement lecturerPostingNews;


    private Select select;
    private List<WebElement> options;
    private WebDriver driver;

    public NewsPage(Runner runner) {
        this.runner = runner;
        this.driver = getDriver();
        PageFactory.initElements(driver, this);
    }

    public void enterTopicName(String topic) {
        topicTextBox.sendKeys(topic);
    }

    public void enterContent(String content) {
        contentextBox.sendKeys(content);
    }

    public void selectMultipleClasses(List<String> newsClasses) {
        classesDropDown.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfClasses));
        for (String newsClass : newsClasses) {
            for (WebElement element : listOfClasses) {
                scrollElementInToView(element);
                if (element.getText().equalsIgnoreCase(newsClass)) {
                    element.click();
                    break;
                }
            }
        }
    }

    public void selectMultipleCourses(List<String> newsCourses) {
        coursesDropDown.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfCourse));
        for (String newsCourse : newsCourses) {
            for (WebElement element : listOfCourse) {
                if (element.getText().equalsIgnoreCase(newsCourse)) {
                    element.click();
                    break;
                }
            }
        }
    }

    public void selectLecturerPostingNews(String lecturer) {

        select = new Select(lecturerPostingNews);
        options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(lecturer)) {
                option.click();
                break;
            }
        }
    }

}
