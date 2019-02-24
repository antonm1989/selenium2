package com.it.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(name ="login")
    private WebElement inputUserName;


    @FindBy(name ="pass")
    private WebElement inputPassword;


    @FindBy(xpath ="//input[@tabindex='5']")
    private WebElement btnLogin;

    public void login(String userName, String password) {
        inputUserName.sendKeys(userName);
        inputPassword.sendKeys(password);
        btnLogin.click();
    }
}
