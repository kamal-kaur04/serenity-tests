package com.browserstack.enums;

public enum Menus {

    ADMIN("web/index.php/admin/viewAdminModule"),
    ADMIN__NATIONALITIES("web/index.php/admin/nationality"),
    PIM("web/index.php/pim/viewPimModule"),
    PIM__CONFIGURATION__OPTIONAL_FIELDS("web/index.php/pim/configurePim"),
    PIM__ADD_EMPLOYEE("web/index.php/pim/addEmployee"),
    MY_INFO("web/index.php/pim/viewMyDetails"),
    DASHBOARD("web/index.php/dashboard/index"),
    BUZZ("web/index.php/buzz/viewBuzz");

    public final String href;

    Menus(String href) {
        this.href = href;
    }
}
