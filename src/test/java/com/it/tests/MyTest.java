package com.it.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyTest extends BaseTest {
    @Test()
    public void testMyTest() throws InterruptedException {

        app.login.login(validUser.userName, validUser.password);
        Assert.assertEquals(app.dashboard.getUserEmail(), validUser.email);
        app.dashboard.clickComposeButton();
        Assert.assertEquals(app.newEmail.sendButtonIsDisplayed(), "true",
                "sendButton is NOT displayed, but should be");
        Assert.assertEquals(app.newEmail.getFromUser(),validEmail.senderInfo);
        app.newEmail.sendEmail(validEmail.toAddress, validEmail.subject,
                validEmail.body);
//        Assert.assertEquals(app.newEmail.sendButtonIsDisplayed(), "false",
//                "sendButton IS displayed, but shouldn't be");
        Assert.assertEquals(app.emailConfirmation.inboxButtonIsDisplayed(), "true");
        app.emailConfirmation.clickInboxButton();
        Assert.assertEquals(app.dashboard.receivedEmailIsDisplayed(),validEmail.fromName);

    }


}
