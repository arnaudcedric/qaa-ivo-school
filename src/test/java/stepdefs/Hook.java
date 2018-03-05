package stepdefs;

import acceptance.Runner;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hook extends Runner {

    @Before
    public void setUp() {
        System.out.println("starting this test \n ");
//        for (String tag : scenario.getSourceTagNames()) {
//            if (tag.toString().equalsIgnoreCase("@firefox")) {
//                loadFirefoxDriver();
//            } else if (tag.toString().equalsIgnoreCase("@chrome")) {
//                loadChromeDriver();
//            }
//        }
//        loadFirefoxDriver();
        loadChromeDriver();
    }

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            scenario.embed(((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.BYTES), "image/png");
            scenario.write("Scenario has Failed : " + scenario.getName());
        } else {
            scenario.write("Scenario has passed");
        }
        getDriver().quit();
    }
}