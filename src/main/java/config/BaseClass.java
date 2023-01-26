package config;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;

public class BaseClass {
    static public WebDriver driver;

    @BeforeClass
    public static void getDriver() {
        driver = DriverConfig.createDriver(Browsers.CHROMEINCOGNITO);
    }
    @AfterClass
    public static void af(){
       if(driver!=null) driver.quit();
    }
}
