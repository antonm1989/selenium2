package com.it.users;

import java.util.ResourceBundle;

public class UserFactory {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("user");
    public static User getValidUser(){
        return new User(resourceBundle.getString("validLogin"),
                resourceBundle.getString("validPassword"),
                resourceBundle.getString("validEmail"));
    }
}
