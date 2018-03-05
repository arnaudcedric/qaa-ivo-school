package acceptance;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
//        tags = {"@chrome", "@firefox"},
        plugin = {"json:target/cucumber.json", "html:target/site/cucumber-pretty"},
        glue = {
                "stepdefs",
        },
        features = {
//                "src/test/java/acceptance/features/EnterStudentDetails.feature",
//                "src/test/java/acceptance/features/CreateASubject.feature",
//                "src/test/java/acceptance/features/CreateANewClass.feature",
                "src/test/java/acceptance/features/CreateANewLecturer.feature"
        },
        strict = true
)
public class SchoolTest extends AbstractTestNGCucumberTests {

//    public SchoolTest(){
//        System.out.println("please run");
//    }
//
//    /*@Before("@studentTest")
//    public void setUp(){
//        System.out.println("starting this test");
//    }
//
//    @After("@studentTest")
//    public void tearDown(){
//        //getDriver().quit();
//    }*/


}
