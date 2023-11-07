package com.browserstack.capabilities;

import com.browserstack.Ohrm;
import com.browserstack.locators.LoginLocators;

public class Login extends Ohrm {

    public void signIn(String username, String password) {
        reporter.reportAction("Sign in with username ".concat(username));
        ui
                .sendKeys(LoginLocators.USERNAME, username)
                .sendKeys(LoginLocators.PASSWORD, password)
                .click(LoginLocators.LOGIN);
    }
}
