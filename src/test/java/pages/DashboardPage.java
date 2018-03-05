package pages;

//import com.ivo.BasePage;
import acceptance.Runner;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class DashboardPage extends BasePage {

//    @FindBy(xpath = "//div[@class='navigator left']/a/div[contains(text(),'period')]")
//    private WebElement periodLink;
//
//    @FindBy(xpath = "//div[@class='navigator left']/a/div[contains(text(),'news')]")
//    private WebElement newsLink;
//
//    @FindBy(xpath = "//div[@class='navigator left']/a/div[contains(text(),'assignment')]")
//    private WebElement assignment;
//
//    @FindBy(xpath = "//div[@class='navigator left']/a/div[contains(text(),'exam')]")
//    private WebElement examLink;
//
//    @FindBy(xpath = "//div[@class='navigator left']/a/div[contains(text(),'note')]")
//    private WebElement noteLink;
//
//    @FindBy(xpath = "//div[@class='navigator right']/a/div[contains(text(),'student')]")
//    private WebElement studentLink;
//
//    @FindBy(xpath = "//div[@class='navigator right']/a/div[contains(text(),'subject')]")
//    private WebElement subjectLink;
//
//    @FindBy(xpath = "//div[@class='navigator right']/a/div[contains(text(),'class')]")
//    private WebElement classLink;
//
//    @FindBy(xpath = "//div[@class='navigator right']/a/div[contains(text(),'course')]")
//    private WebElement courseLink;
//
//    @FindBy(xpath = "//div[@class='navigator right']/a/div[contains(text(),'grade')]")
//    private WebElement gradeLink;
//
//    @FindBy(xpath = "//div[@class='navigator right']/a/div[contains(text(),'holiday')]")
//    private WebElement holidayLink;
//
//    @FindBy(xpath = "//div[@class='navigator right']/a/div[contains(text(),'lecturer')]")
//    private WebElement lecturerLink;
//
//    @FindBy(xpath = "//div[@class='navigator right']/a/div[contains(text(),'parent')]")
//    private WebElement parentLink;
//
//    @FindBy(xpath = "//div[@class='navigator right']/a/div[contains(text(),'school')]")
//    private WebElement schoolLink;
//
//    @FindBy(xpath = "//div[@class='navigator right']/a/div[contains(text(),'dashboard')]")
//    private WebElement dashboardLink;

//    @FindBy(xpath = "//div[@class='initialText']/p/span[contains(text(),'NEW')]")
//    private WebElement newLink;

//    @FindBy(css = ".navigator.right")
//    private WebElement rightNavigator;
//
//    @FindBy(css = ".navigator.left")
//    private WebElement leftNavigator;


//    DashboardPage(){
//
//    }

    private WebDriver driver;

    public DashboardPage(Runner runner){
        this.runner = runner;
        driver = runner.getDriver();
        PageFactory.initElements(driver, this);
    }


}