package com.browserstack.capabilities;

import com.browserstack.Ohrm;
import com.browserstack.enums.Menus;

public class Navigation extends Ohrm {

    public void navigateToHome() {
        reporter.reportAction("Navigate to home page");
        ui.driver.navigate().to(url);
    }

    public void goTo(String menu) {
        String target;
        try {
            target = url.concat(Menus.valueOf(menu).href);
        } catch (IllegalArgumentException e) {
            reporter.reportAction("Reference does not exist for ".concat(menu));
            return;
        }
        reporter.reportAction(String.format("Navigate to '%s'", target));
        ui.driver.navigate().to(target);
        ui.waitForPageToLoad();
    }
}
