package com.it;

import com.it.helpers.*;

public class App {
    public CommonHelper common;
    public LoginHelper login;
    public DashboardHelper dashboard;
    public NewEmailHelper newEmail;
    public EmailConfirmationHelper emailConfirmation;

    public App(CommonHelper common, LoginHelper login,
               DashboardHelper dashboard, NewEmailHelper newEmail,
               EmailConfirmationHelper emailConfirmation) {
        this.common = common;
        this.login = login;
        this.dashboard = dashboard;
        this.newEmail = newEmail;
        this.emailConfirmation = emailConfirmation;
    }

    public App() {
        common = new CommonHelper();
        login = new LoginHelper();
        dashboard = new DashboardHelper();
        newEmail = new NewEmailHelper();
        emailConfirmation = new EmailConfirmationHelper();
    }
}
