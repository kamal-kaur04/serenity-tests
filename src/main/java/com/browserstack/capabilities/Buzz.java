package com.browserstack.capabilities;

import com.browserstack.Ohrm;
import com.browserstack.locators.BuzzLocators;

public class Buzz extends Ohrm {

    public void add(String message) {
        reporter.reportAction("Add message : ".concat(message));
        ui
                .sendKeys(BuzzLocators.NEW_MESSAGE, message)
                .click(BuzzLocators.POST);
        ui.waitForPageToLoad();
    }

    public void reply(String user, int postNumber, String message) {
        reporter.reportAction("Reply : ".concat(message));
        ui
                .sendKeys(String.format(BuzzLocators.MESSAGE_X_Y, user, postNumber), message)
                .click(String.format(BuzzLocators.POST_X_Y, user, postNumber));
        ui.waitForPageToLoad();
    }
}
