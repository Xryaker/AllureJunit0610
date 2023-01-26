package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class DriverConfig {
   private static WebDriver driver;

    public static WebDriver createDriver(Browsers browser) {
        if (driver == null) {
            switch (browser) {
                case CHORME :createChrome();break;
                case CHROMEINCOGNITO : createChromeIncognito();break;

            }
        }
        return driver;
    }



    private static void createChromeIncognito() {
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--incognito");//open chrome in incognito made
        options.addArguments("--start-maximized");//open chrome in window max
//            options.addArguments("--headless");//headlessmode
        driver=new ChromeDriver(options);
     //  driver.manage().timeouts().pageLoadTimeout(3, TimeUnit.SECONDS);
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

    }

    private static void createChrome() {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
    }
}
