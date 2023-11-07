package com.browserstack.locators;

import org.openqa.selenium.By;

public class LoginLocators {

    public static final By USERNAME = By.xpath("//input[@name='username']");
    public static final By PASSWORD = By.xpath("//input[@name='password']");
    public static final By LOGIN = By.xpath("//button[@type='submit']");
}
