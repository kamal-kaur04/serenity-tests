package com.browserstack.capabilities;

import com.browserstack.Ohrm;
import com.browserstack.locators.CommonLocators;

public class Common extends Ohrm {

    public String getTitle() {
        return ui.getElement(CommonLocators.TITLE).getText();
    }
}
