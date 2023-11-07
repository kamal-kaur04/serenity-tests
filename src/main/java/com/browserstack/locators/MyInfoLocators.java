package com.browserstack.locators;

public class MyInfoLocators {

    public static final String NICK_NAME = "//div[contains(@class,'oxd-input-group') and .//label[text()='Nickname']]//input";
    public static final String SMOKER = "//div[contains(@class,'oxd-input-group') and .//label[text()='Smoker']]";
    public static final String MILITARY_SERVICE = "//div[contains(@class,'oxd-input-group') and .//label[text()='Military Service']]//input";
    public static final String SAVE_PERSONAL_DETAILS = "//div[./h6[.='Personal Details']]//button[@type='submit']";

    public static final String BLOOD_TYPE = "//form[@class='oxd-form' and .//label[text()='Blood Type']]//div[@class='oxd-select-wrapper']";
    public static final String BLOOD_TYPE_SELECTED = "//form[@class='oxd-form' and .//label[text()='Blood Type']]//div[@class='oxd-select-text-input']";
    public static final String SAVE_CUSTOM_FIELDS = "//div[./h6[.='Custom Fields']]//button[@type='submit']";
}
