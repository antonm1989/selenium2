package com.it.pages;

import com.it.drivers.DriverFactory;
import com.it.drivers.MyDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    static protected MyDriver driver = MyDriver.getInstance();

    public BasePage() {
        PageFactory.initElements(driver, this);
    }

}
