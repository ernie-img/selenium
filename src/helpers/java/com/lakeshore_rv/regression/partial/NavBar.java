package com.lakeshore_rv.regression.partial;

import org.openqa.selenium.By;

/**
 * @author ddavison
 * @since Jul 30, 2015
 */
public class NavBar {
    public static final By LOC_LNK_HOME = By.cssSelector("li.menu-home > a");
    public static final By LOC_LNK_NEWRVS = By.cssSelector("li.menu-new-rvs > a");
    public static final By LOC_LNK_USEDRVS = By.cssSelector("li.menu-used-rvs > a");
    public static final By LOC_LNK_CUSTOMRVBUILD = By.cssSelector("li.menu-custom-rv-build > a");
    public static final By LOC_LNK_RVDELIVERY = By.cssSelector("li.menu-rv-delivery > a");
    public static final By LOC_LNK_MORE = By.cssSelector("li.menu-more-contacts-service > a");
    public static final By LOC_LNK_RVMANUFACTURERS = By.cssSelector("li.menu-rv-manufacturers > a");
    public static final By LOC_LNK_CLEARANCERVS = By.cssSelector("li.menu-clearance-rvs > a");
}
