package com.browserstack.capabilities;

import com.browserstack.Ohrm;
import com.browserstack.locators.MyInfoLocators;
import com.browserstack.datamodel.PersonalDetailsData;

public class MyInfo extends Ohrm {

    public void setPersonalDetails(PersonalDetailsData personalDetails) {
        reporter.reportAction("Set personal details", personalDetails.toString());
        ui.click(MyInfoLocators.NICK_NAME).clearNext(true).sendKeys(MyInfoLocators.NICK_NAME, personalDetails.nickName);
        ui.setSelected(MyInfoLocators.SMOKER, personalDetails.smoker);
        ui.clearNext(true).sendKeys(MyInfoLocators.MILITARY_SERVICE, personalDetails.militaryService);
        ui.click(MyInfoLocators.SAVE_PERSONAL_DETAILS);
    }

    public void setCustomFields(String bloodType) {
        reporter.reportAction("Set blood type ".concat(bloodType));
        ui
                .selectByVisibleText(MyInfoLocators.BLOOD_TYPE, bloodType)
                .click(MyInfoLocators.SAVE_CUSTOM_FIELDS);
    }

    public String getBloodType() {
        return ui.getElement(MyInfoLocators.BLOOD_TYPE_SELECTED).getText();
    }
}
