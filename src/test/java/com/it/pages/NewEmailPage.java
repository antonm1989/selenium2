package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewEmailPage extends BasePage {
    @FindBy(xpath = "//p[@class='send_container']//input[@name='send']")
    private WebElement btnSendEmail;

    @FindBy(xpath = "//textarea[@name='to']")
    private WebElement inputTo;

    @FindBy(xpath = "//input[@name='subject']")
    private WebElement inputSubject;

    @FindBy(xpath = "//textarea[@name='body' and @id='text']")
    private WebElement inputEmailBody;

    @FindBy(xpath = "//div[@class='from']//div[@class='field_value']")
    private WebElement labelFromUser;


    public void sendEmail(String senderAddress, String emailSubject, String emailBody) {

        inputTo.sendKeys(senderAddress);
        inputSubject.sendKeys(emailSubject);
        inputEmailBody.sendKeys(emailBody);
        btnSendEmail.click();
    }

    public String getFromUser() {
        return labelFromUser.getText();
    }

    public String sendButtonIsDisplayed() {
        return Boolean.toString(btnSendEmail.isDisplayed());
    }


}
