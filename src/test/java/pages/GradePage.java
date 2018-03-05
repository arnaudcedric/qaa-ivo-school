package pages;

import acceptance.Runner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class GradePage extends BasePage {


    @FindBy(id = "name")
    private WebElement gradeName;

    @FindBy(id = "acronym")
    private WebElement gradeAcronym;

    @FindBy(id = "top_margin")
    private WebElement gradeTopMargin;

    @FindBy(id = "bottom_margin")
    private WebElement gradeBottomMargin;

    @FindBy(id = "points")
    private WebElement gradePointEquivalence;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButtonOnLecturerPage;

    private WebDriver driver;
    private Select select;
    private List<WebElement> options;
    public GradePage(Runner runner){
        this.runner = runner;
        driver = runner.getDriver();
        PageFactory.initElements(driver, this);
    }

    public void enterGradeName(String gradeName){
        this.gradeName.sendKeys(gradeName);
    }

    public void enterGradeAcronym(String gradeAcronym){
        this.gradeAcronym.sendKeys(gradeAcronym);
    }

    public void enterGradeTopMargin(String gradeTopMargin){
        this.gradeTopMargin.sendKeys(gradeTopMargin);
    }

    public void enterGradeBottomMargin(String gradeBottomMargin){
        this.gradeBottomMargin.sendKeys(gradeBottomMargin);
    }

    public void enterGradePointEquivalence(String PointEquivalence){
        this.gradePointEquivalence.sendKeys(PointEquivalence);
    }

    public void clickCreateButton() {
        this.createButtonOnLecturerPage.click();
    }


}
