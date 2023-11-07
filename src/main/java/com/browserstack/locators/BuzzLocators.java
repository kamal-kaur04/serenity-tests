package com.browserstack.locators;

public class BuzzLocators {

    public static final String NEW_MESSAGE = "//*[@placeholder=\"What's on your mind?\"]";
    public static final String POST = "//button[contains(., 'Post') and not(contains(., 'Recent'))]";

    public static final String MESSAGE_X_Y = "(//*[@id='buzz']//li[.//*[@id='postEmployeeName' and normalize-space()='%s']]//textarea[contains(@id, 'commentBoxNew_listId') and @class='commentBox'])[%d]";
    public static final String POST_X_Y = "(//*[@id='buzz']//li[.//*[@id='postEmployeeName' and normalize-space()='%s']]//textarea[contains(@id, 'commentBoxNew_listId') and @class='commentBox']//following-sibling::input[@type='button'])[%d]";
}
