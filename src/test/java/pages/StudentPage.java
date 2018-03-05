package pages;

import acceptance.Runner;
import acceptance.type.StudentType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class StudentPage extends BasePage {


    // TODO Need to Create a Class for the student in the CLassPage.java before entering student details
    // TODO Need to Create a Course for the student in the CoursePage.java before entering student details
    // TODO Need to Create a parent for the student in the parent.java before entering student details

    @FindBy(id = "first_name")
    private WebElement firstNameTextBox;

    @FindBy(id = "last_name")
    private WebElement last_nameTextBox;

    @FindBy(id = "email")
    private WebElement emailTextBox;

    @FindBy(id = "phone_number")
    private WebElement phoneNumberTextBox;

    @FindBy(id = "previous_school")
    private WebElement previousSchoolTextBox;

    @FindBy(id = "address")
    private WebElement addressTextBox;

    @FindBy(xpath = "//div[contains(text(),'Date Of Birth(yyyy-mm-dd)')]")
    private WebElement dateLabel;

    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement dateBox;

    @FindBy(xpath = "//th[@class='rdtSwitch']")
    private WebElement monthYearOnCalendar;

    @FindBy(xpath = "//select[@name='nationality']")
    private WebElement countryOfOrigin;

    @FindBy(xpath = "//select[@name='class']")
    private WebElement studentsCurrentClass;

    @FindBy(xpath = ".//*[@id='app-container']/div[3]/div/div[2]/div/div[1]/div[2]/div[11]/div[2]/div[1]/div[2]")
    private WebElement coursesDropDown;

    @FindAll({@FindBy(xpath = "//div[@class='switch']/div")})
    public List<WebElement> ListOfGender;

    @FindBy(id = "searchValue")
    private WebElement parentsSearchBon;

    @FindBy(id = "-goBtn")
    private WebElement parentGoButton;

    @FindBy(xpath = "//button[contains(text(),'Create')]")
    private WebElement createButtonOnStudentPage;

    @FindBy(xpath = "//div[contains(text(),'Prenom')]")
//    TODO prenom should be change to firstName on the UI
    private WebElement prenomLabel;

    @FindBy(xpath = "//div[contains(text(),'Last Name')]")
    private WebElement lastNameLabel;

    @FindBy(xpath = "//div[contains(text(),'Email')]")
    private WebElement emailLabel;

    @FindBy(xpath = "//div[contains(text(),'Phone Number')]")
    private WebElement phoneNumberLabel;

    @FindBy(xpath = "//div[contains(text(),'Date Of Birth(yyyy-mm-dd)')]")
    private WebElement dOBLabel;

    @FindBy(xpath = "//div[contains(text(),'Country of Origin')]")
    private WebElement countryOfOriginLabel;

    @FindBy(xpath = "//div[contains(text(),'Gender')]")
    private WebElement genderLabel;

    @FindBy(xpath = "//div[contains(text(),'Previous School')]")
    private WebElement previousSchoolLabel;

    @FindBy(xpath = "//div[contains(text(),'Address')]")
    private WebElement addressLabel;

    @FindBy(xpath = "//div[contains(text(),'Current Class')]")
    private WebElement studentsCurrentClassLabel;

    @FindBy(xpath = "//div[contains(text(),'Courses')]")
    private WebElement coursesLabel;

    @FindBy(xpath = "//div[contains(text(),'Parents')]")
    private WebElement parentsLabel;

    @FindBy(xpath = "//div[contains(text(),'Error in form, check highlighted fields')]")
    private WebElement errorMessage;

    @FindAll({@FindBy(xpath = "//div[2]/div[11]/div[2]/div[2]/div")})
    public List<WebElement> listOfCourses;

    @FindAll({@FindBy(xpath = "//div[2]/div[2]/div[2]/div")})
    public List<WebElement> listOfParent;




    public WebElement getErrorMessage() {
        return errorMessage;
    }


    public WebElement getPrenomLabel() {
        return prenomLabel;
    }

    public WebElement getLastNameLabel() {
        return lastNameLabel;
    }

    public WebElement getEmailLabel() {
        return emailLabel;
    }

    public WebElement getPhoneNumberLabel() {
        return phoneNumberLabel;
    }

    public WebElement getdOBLabel() {
        return dOBLabel;
    }

    public WebElement getCountryOfOriginLabel() {
        return countryOfOriginLabel;
    }

    public WebElement getGenderLabel() {
        return genderLabel;
    }

    public WebElement getPreviousSchoolLabel() {
        return previousSchoolLabel;
    }

    public WebElement getAddressLabel() {
        return addressLabel;
    }

    public WebElement getStudentsCurrentClassLabel() {
        return studentsCurrentClassLabel;
    }

    public WebElement getCoursesLabel() {
        return coursesLabel;
    }

    public WebElement getParentsLabel() {
        return parentsLabel;
    }

    private WebDriver driver;
    private Select select;
    private List<WebElement> options;
    public StudentPage(Runner runner) {
        this.runner = runner;
        driver = runner.getDriver();
        PageFactory.initElements(driver, this);

    }

    //    TODO clean up code find a better way for this
    public void enterStudentDetails(StudentType student) {

        firstNameTextBox.sendKeys(student.getFirstName());
        last_nameTextBox.sendKeys(student.getLastName());
        emailTextBox.sendKeys(student.getEmail());
        phoneNumberTextBox.sendKeys(student.getPhoneNumber());
        previousSchoolTextBox.sendKeys(student.getPreviousSchool());
        addressTextBox.sendKeys(student.getAddress());
        selectDate(student.getDate());
        selectACountryOfOrigin(student.getCountryOfOrigin());
        selectStudentCurrentClass(student.getStudentsCurrentClass());
        selectCourse(student);
        selectGender(student.getGender());
        selectAParent(student.getParent());
    }

    public void enterStudentDetailswWithOutParent(StudentType student) {
        firstNameTextBox.sendKeys(student.getFirstName());
        last_nameTextBox.sendKeys(student.getLastName());
        emailTextBox.sendKeys(student.getEmail());
        phoneNumberTextBox.sendKeys(student.getPhoneNumber());
        previousSchoolTextBox.sendKeys(student.getPreviousSchool());
        addressTextBox.sendKeys(student.getAddress());
        selectDate(student.getDate());
        selectACountryOfOrigin(student.getCountryOfOrigin());
        selectStudentCurrentClass(student.getStudentsCurrentClass());
        selectCourse(student);
        selectGender(student.getGender());
    }

    public void enterStudentDetailswWithOutGender(StudentType student) {
        firstNameTextBox.sendKeys(student.getFirstName());
        last_nameTextBox.sendKeys(student.getLastName());
        emailTextBox.sendKeys(student.getEmail());
        phoneNumberTextBox.sendKeys(student.getPhoneNumber());
        previousSchoolTextBox.sendKeys(student.getPreviousSchool());
        addressTextBox.sendKeys(student.getAddress());
        selectDate(student.getDate());
        selectACountryOfOrigin(student.getCountryOfOrigin());
        selectStudentCurrentClass(student.getStudentsCurrentClass());
        selectCourse(student);
        selectAParent(student.getParent());
    }

    public void enterStudentDetailsWithOutGenderAndParent(StudentType student) {

        firstNameTextBox.sendKeys(student.getFirstName());
        last_nameTextBox.sendKeys(student.getLastName());
        emailTextBox.sendKeys(student.getEmail());
        phoneNumberTextBox.sendKeys(student.getPhoneNumber());
        previousSchoolTextBox.sendKeys(student.getPreviousSchool());
        addressTextBox.sendKeys(student.getAddress());
        selectDate(student.getDate());
        selectACountryOfOrigin(student.getCountryOfOrigin());
        selectStudentCurrentClass(student.getStudentsCurrentClass());
        selectCourse(student);

    }

    public void clickOnCreateButtonOnStudentPage() {
        createButtonOnStudentPage.click();
    }

    private void selectDate(String date) {

        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

        Date dateToBeSelectedOnCalender = null;
        try {
            dateToBeSelectedOnCalender = df.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("dateToBeSelectedOnCalender : " + dateToBeSelectedOnCalender.toString());

        Date currentDate = new Date();
        System.out.println("current date : " + currentDate);
        dateBox.click();
        String monthYearDisplayOnStudentPage = /*driver.findElement(By.className("rdtSwitch"))*/monthYearOnCalendar.getText();

        System.out.println("monthYearDisplayOnStudentPage : " + monthYearDisplayOnStudentPage);

        String monthToBeSelected = new SimpleDateFormat("MMMM").format(dateToBeSelectedOnCalender).toUpperCase();
        String yearToBeSelected = new SimpleDateFormat("yyyy").format(dateToBeSelectedOnCalender).toUpperCase();
        String dayToBeSelected = new SimpleDateFormat("d").format(dateToBeSelectedOnCalender).toUpperCase();

        String monthYearTobeSelected = monthToBeSelected + " " + yearToBeSelected;
        System.out.println("monthYearToBeSelected : " + monthYearTobeSelected);
        System.out.println("dayYearToBeSelected : " + dayToBeSelected);

        while (true) {
            if (monthYearTobeSelected.equalsIgnoreCase(monthYearDisplayOnStudentPage)) {
                // that means we are on the right month and the year section
                // we just need to select the date
                driver.findElement(By.xpath(".//*[@class='rdtDay'][contains(text(),'" + dayToBeSelected + "')]")).click();
                System.out.println("month date \n");
                break;
            } else {
                // we need to move forward or backward meaning navigate to current month and year
                //and select the date
                if (dateToBeSelectedOnCalender.after(currentDate)) {
                    //forward calendar move icon
                    driver.findElement(By.xpath(/*"//span[contains(text(),'›')]"*/"//th[@class='rdtNext']")).click();

                } else {// meaning its before you need to click on back link
                    //forward calendar move icon
                    driver.findElement(By.xpath("//th[@class='rdtPrev']")).click();
                }
            }
//            //this has to be update
            monthYearDisplayOnStudentPage = driver.findElement(By.className("rdtSwitch")).getText();
        }

    }

    private void selectACountryOfOrigin(String country) {

        select = new Select(countryOfOrigin);
        options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(country)) {
                option.click();
                break;
            }
        }
    }

    private void selectStudentCurrentClass(String studentCurrentClass) {
        select = new Select(studentsCurrentClass);
        options = select.getOptions();
        for (WebElement option : options) {
            if (option.getText().equalsIgnoreCase(studentCurrentClass)) {
                option.click();
                break;
            }
        }

    }

    //    TODO clean code find a better way for this
    private void selectCourse(/*int studentCourseId,*/StudentType student) {
        coursesDropDown.click();
//        WebElement studentCourseElement = getDriver().findElement(By.xpath("//div[contains(text(),'" + studentCourseId + "')]"));
//        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='70%';");


//        if (isClickable(studentCourseElement)) {
//        scrollElementInToView(studentCourseElement);
//        }
//        studentCourseElement.click();
//        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='100%';");

        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfCourses));

        for (String studentCourse : student.getCourses()) {
            for (WebElement element : listOfCourses) {
                if (element.getText().equalsIgnoreCase(studentCourse)) {
                    element.click();
                    break;
                }
            }
        }


    }

//    private void selectCourse(int studentCourse) {
//        coursesDropDown.click();
//        StudentType student = new StudentType();
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        WebElement studentCourseElement = getDriver().findElement(By.xpath("//div[contains(text(),'" + studentCourse + "')]"));
////        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='70%';");
//
//
////        if (isClickable(studentCourseElement)) {
//        scrollElementInToView(studentCourseElement);
////        }
//        studentCourseElement.click();
////        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='100%';");
//
//    }

//    public void selectMultipleCourse(List<String> courses) {
//
//        for (String course : courses) {
//            for (WebElement element : listOfCourses) {
//                if (element.getText().equalsIgnoreCase(course)) {
//                    element.click();
//                }
//            }
//        }
//
//    }

    public void selectGender(String studentGender) {
        for (WebElement gender : ListOfGender) {
            if (gender.getText().equalsIgnoreCase(studentGender)) {
                gender.click();
            }
        }
    }
//    TODO write better method to be able to pick multiple parents
    private void selectAParent(String parentName) {
        parentGoButton.click();
        WebDriverWait wait = new WebDriverWait(driver,3);
        wait.until(ExpectedConditions.visibilityOfAllElements(listOfParent));
        driver.findElement(By.xpath("//div[contains(text(), '" + parentName + "')]")).click();
    }

//    public boolean verifyStudentNameIsPresentOnStudentList(String name) {
//        if (listOfStudent.size() > 0) {
//
//            for (int i = 0; i < listOfStudent.size(); i++) {
//                WebElement element = driver.findElement(By.xpath("//span[contains(text(),'" + name + "')]"));
//                scrollElementInToView(element);
//                if (listOfStudent.get(i).getText().equalsIgnoreCase(name)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//        return false;
//    }

//    public boolean verifyStudentNameIsPresentOnStudentList(String name) {
//        if (listOfStudent.size() > 0) {
//
//            for (WebElement student : listOfStudent){
//                WebElement studentNameElement = driver.findElement(By.xpath("//span[contains(text(),'" + name + "')]"));
//                scrollElementInToView(studentNameElement);
//                if (student.getText().equalsIgnoreCase(name)){
//                    return true;
//                }
//            }
//
//            for (int i = 0; i < listOfStudent.size(); i++) {
//                WebElement element = driver.findElement(By.xpath("//span[contains(text(),'" + name + "')]"));
//                scrollElementInToView(element);
//                if (listOfStudent.get(i).getText().equalsIgnoreCase(name)) {
//                    return true;
//                }
//            }
//            return false;
//        }
//        return false;
//    }

    public boolean verifyStudentNameIsPresent(String name) {
        return driver.findElements(By.xpath("//span[contains(text(),'" + name + "')]")).size() > 0;
    }

//    public boolean isClickable(WebElement el)
//    {
//        try{
//            WebDriverWait wait = new WebDriverWait(driver, 6);
//            wait.until(ExpectedConditions.elementToBeClickable(el));
//            return true;
//        }
//        catch (Exception e){
//            return false;
//        }
//    }
}
