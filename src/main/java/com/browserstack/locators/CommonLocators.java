package com.browserstack.locators;

import org.openqa.selenium.By;

public class CommonLocators {

    public static final By SPINNER = By.xpath("//*[@class='oxd-loading-spinner']");
    public static final By LOADER = By.xpath("//*[@class='oxd-form-loader']");

    public static final By TITLE = By.xpath("//header//span/h6");

    public static final String LISTBOX_X = "//div[@role='listbox']/div[.=\"%s\"]";
}
