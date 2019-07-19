package base;

import com.epam.jdi.light.driver.get.DriverData;
import ex7.JdiSite;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import static com.epam.jdi.light.driver.WebDriverUtils.killAllSeleniumDrivers;
import static com.epam.jdi.light.ui.html.PageFactory.initElements;
import static ex7.JdiSite.mainPage;

public class TestInit {
    protected static Properties properties;
    @BeforeSuite(alwaysRun = true)
    public static void setUp() {
        properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("src/test/resources/ex7.properties");
            properties.load(fis);
        } catch (IOException e) {
        }
        DriverData.CHROME_OPTIONS = () -> {
            ChromeOptions cap = new ChromeOptions();
            cap.addArguments("--start-maximized");
            return cap;
        };
        initElements(JdiSite.class);
        mainPage.open();
    }


    @AfterSuite(alwaysRun = true)
    public void teardown() {
        killAllSeleniumDrivers();
    }
}
