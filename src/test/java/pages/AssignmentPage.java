package pages;

import acceptance.Runner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AssignmentPage extends BasePage{

    @FindBy(id = "topic") private WebElement topicTextBox;
    @FindBy(id = "topic") private WebElement ContentTextBox;
    @FindBy(id = "topic") private WebElement OverallMarkTextBox;



    private WebDriver driver;
    public AssignmentPage(Runner runner){
        this.runner = runner;
        driver = getDriver();
        PageFactory.initElements(driver,this);
    }

}
