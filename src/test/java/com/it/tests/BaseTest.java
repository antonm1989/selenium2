package com.it.tests;

import com.it.App;
import com.it.emails.Email;
import com.it.emails.EmailFactory;
import com.it.users.User;
import com.it.users.UserFactory;
import org.testng.annotations.AfterSuite;

public class BaseTest {
    protected static User validUser = UserFactory.getValidUser();
    protected static Email validEmail= EmailFactory.getValidEmail();
    protected static App app = new App();

    @AfterSuite
    public void tearDownSuite(){
        app.common.stopApp();
    }
}
