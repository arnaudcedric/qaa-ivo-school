package pages;

import acceptance.Runner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HolidayPage extends BasePage{


    @FindBy(id = "name")
    private WebElement name;

    @FindBy(id = "acronym")
    private WebElement acronym;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButtonOnHolidaysPage;


    private WebDriver driver;
    private Select select;
    private List<WebElement> options;
    public HolidayPage(Runner runner){
        this.runner = runner;
        driver = runner.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void enterName(String name){
        this.name.sendKeys(name);
    }
    public void enterAcronym(String acronym){
        this.acronym.sendKeys(acronym);
    }
    public void clickOnCreate(){
        createButtonOnHolidaysPage.click();
    }
}
