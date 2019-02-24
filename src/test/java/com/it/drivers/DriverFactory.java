package com.it.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import static com.it.common.Constants.BASE_URl;

public class DriverFactory {
    static public WebDriver getDriver() {
        WebDriver driver = null;
        String driverType = System.getProperty("driver");
        if (driverType == null || "chrome".equals(driverType)) {
            System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
            driver = new ChromeDriver();

        } else if ("gecko".equals(driverType)) {
            System.setProperty("webdriver.gecko.driver", "drivers/geckodriver");
            driver = new FirefoxDriver();
        } else if ("safari".equals(driverType)) {
//            System.setProperty("webdriver.safari.driver","drivers/geckodriver");
            driver = new SafariDriver();
        } else if ("opera".equals(driverType)) {
            System.setProperty("webdriver.opera.driver", "drivers/operadriver");
            driver = new OperaDriver();
        }

        driver.manage().window().maximize();
        driver.get(BASE_URl);
        return driver;
    }

}
