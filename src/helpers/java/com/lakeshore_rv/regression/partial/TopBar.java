package com.lakeshore_rv.regression.partial;

import io.ddavison.conductor.Locomotive;
import org.openqa.selenium.By;

/**
 * @author ddavison
 * @since Jul 30, 2015
 */
public class TopBar {
    private Locomotive test;
    public TopBar(Locomotive t) {
        test = t;
    }

    public static final By LOC_LNK_SEARCH = By.cssSelector("a.search-trigger");
    public static final By LOC_TXT_SEARCH = By.cssSelector("div.search-wrapper.open input[type='search']");
    public static final By LOC_BTN_SEARCH = By.cssSelector("div.search-wrapper.open input[value='Search']");

    /**
     * Search in the top bar
     * @param searchTerm the term to search for
     */
    public Locomotive search(String searchTerm) {
        test.click(LOC_LNK_SEARCH);
        test.waitForElement(LOC_TXT_SEARCH);

        return test.setText(LOC_TXT_SEARCH, searchTerm)
        .click(LOC_BTN_SEARCH);
    }
}
