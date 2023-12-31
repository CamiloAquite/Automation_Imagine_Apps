package is.serenitydemo.setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebUI {

    private static final String WEB_DRIVER_EDGE_DRIVER = "webdriver.chrome.driver";
    private static final String WEB_DRIVER_EDGE_DRIVER_PATH = "src/test/resources/driver/chrome/chromedriver.exe";
    private static final String DEMO_QA_URL = "https://demo.serenity.is/";
    protected WebDriver driver;

    private void setupWebDriver() {
        System.setProperty(WEB_DRIVER_EDGE_DRIVER, WEB_DRIVER_EDGE_DRIVER_PATH);
    }

    private void setupWebDriverChromeDriverUrl() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(DEMO_QA_URL);
    }

    protected void generalSetup() {
        System.out.println("Antes --------------------------------------------");
        setupWebDriver();
        setupWebDriverChromeDriverUrl();
        System.out.println("====0--------");
    }



    protected void quitDrive() {
        driver.quit();
    }
}
