package pages;


import acceptance.Runner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LoginPage extends BasePage {




    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[2]/div/div[1]/input")
    private WebElement usernameTextbox;

    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[2]/div/div[2]/input")
    private WebElement passwordTextbox;

    @FindBy(xpath = "//*[@id=\"main-container\"]/div/div[2]/div/div[3]/button")
    private WebElement loginButton;


    private WebDriver driver;
//    BasePage pages;
    public LoginPage(Runner runner) {
//        pages = BasePage.getInstance();
//        this.driver = driver;
        this.runner = runner;
        driver = runner.getDriver();
        PageFactory.initElements(driver, this);
    }

    // TODO shouldn't be using Thread.sleep use wait until the url change to the dashboard page
    public void login(String username,String password){

//        pages.loadApplicationPage();
//        runner.getDriver().get("http://localhost:3000/login");
//        PageFactory.initElements(driver, this);
        usernameTextbox.sendKeys(username);
        passwordTextbox.sendKeys(password);

        loginButton.click();

    }
}
