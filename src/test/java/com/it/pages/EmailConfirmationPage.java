package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EmailConfirmationPage extends BasePage {
    @FindBy(xpath = "//a[contains(@href,'list/INBOX/')]")
    private WebElement btnInbox;

    public void clickInboxButton() {
        btnInbox.click();
    }

    public String inboxButtonIsDisplayed() {
        return Boolean.toString(btnInbox.isDisplayed());
    }
}
