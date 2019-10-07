package ridezum;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseTest {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {

        System.setProperty("webdriver.chrom.driver", "/Users/obilko/Desktop");
        driver = new ChromeDriver();
        driver.get("https://ridezum.com/");

        String expRes ="zum";


    }

    @AfterClass
    public static void finish() {
        driver.quit();

    }


}
