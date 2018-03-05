package acceptance;

import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Runner {

    private static WebDriver driver;

    public WebDriver getDriver() {
        return driver;
    }

    public void loadChromeDriver() {
//        if (browserType.equalsIgnoreCase("chrome")) {
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

//        } else if (browserType.equalsIgnoreCase("firefox")) {
//            System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
//            driver = new FirefoxDriver();
//        }
    }

    public void loadFirefoxDriver() {
        System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();

    }

}
