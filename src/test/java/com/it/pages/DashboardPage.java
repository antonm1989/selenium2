package com.it.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashboardPage extends BasePage {


    @FindBy(xpath = "//span[@class='sn_menu_title']")
    public WebElement labelUserMail;
    @FindBy(xpath = "//div[@class='section_nav']//a[contains(@href,'compose')]")
    private WebElement btnComposeEmail;
    @FindBy(xpath = "//div[@class='messages']//div[@class='row new'][1]//span[@class='frm']")
    private WebElement receivedEmail;


    public String getUserEmail() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, 10);
//        wait.until((driver)->driver.findElement(By.name("sss"))); //через каждые полсекунды опрашивает
        // в течение 10 сек
        Action build = new Actions(driver).click().build();
        build.perform();

        wait.until(ExpectedConditions.visibilityOf(labelUserMail));
        driver.scrollDown();
        Thread.sleep(1000);
        return labelUserMail.getText();
    }

    public void clickComposeButton() {
        btnComposeEmail.click();
    }

    public String receivedEmailIsDisplayed() {
        return receivedEmail.getText();
    }

}
