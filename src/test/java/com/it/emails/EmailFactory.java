package com.it.emails;

import java.util.ResourceBundle;

public class EmailFactory {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("email");

    public static Email getValidEmail() {
        return new Email(resourceBundle.getString("validReceiver"),
                resourceBundle.getString("validEmailSubject"),
                resourceBundle.getString("validEmailBody"),
                resourceBundle.getString("validSenderName"),
                resourceBundle.getString("validSenderInfo"));

    }
}
