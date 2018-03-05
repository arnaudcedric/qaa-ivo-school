package pages;
import acceptance.Runner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Properties;
// for common functions
public class BasePage extends Runner {

    @FindBy(css = ".navigator.right")
    private WebElement rightNavigator;

    @FindBy(css = ".navigator.left")
    private WebElement leftNavigator;

    @FindBy(xpath = "//div[@class='initialText']/p/span[contains(text(),'NEW')]")
    private WebElement newLink;

    public BasePage(){

    }

    protected Properties properties = new Properties();
    protected Runner runner;
    protected WebDriver driver;

    public BasePage(Runner runner){
        this.runner = runner;
        driver = getDriver();
        PageFactory.initElements(driver,this);
    }

    private void loadProperties() {
        try {
            properties.load(getClass().getClassLoader().getResourceAsStream("profile.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadApplicationPage() {
        loadProperties();
        runner.getDriver().get(properties.getProperty("applicationUrl"));
    }

    public WebDriverWait waitTime() {
        WebDriverWait wait = new WebDriverWait(getDriver(), 10);
        return wait;
    }

    public void scrollElementInToView(WebElement element) {
        JavascriptExecutor jsDriver = (JavascriptExecutor) runner.getDriver();
        jsDriver.executeScript("arguments[0].scrollIntoView(true);", element);
//        jsDriver.executeScript("document.getElementsByClassName('content')[0].scrollBy(0, 200)",element);
    }

    public void clickRightNavigatorLinkByName(String iconName){
//        waitTime().until(ExpectedConditions.urlToBe("http://localhost:3000/dashboard"));
        rightNavigator.findElement(By.id("link-"+iconName)).click();
        newLink.click();
    }
// TODO have a separate method to click on new link and change all the feature to accommodate this change
    public void clickLeftNavigatorLink(String iconName){
        leftNavigator.findElement(By.id("link-"+iconName)).click();
        newLink.click();
    }
}