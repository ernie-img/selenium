package com.lakeshore_rv.regression.general;

import com.lakeshore_rv.regression.AutomatedTest;
import com.lakeshore_rv.regression.partial.NavBar;
import org.junit.Test;
import org.openqa.selenium.By;

/**
 * @author ddavison
 * @since Jul 30, 2015
 */
public class SearchTests extends AutomatedTest {

    @Test
    public void testCanSearch() {
        // we are at the home page
        topBar.search("coa");
    }

    @Test
    public void testCanGoToNewRVs() {
        hoverOver(NavBar.LOC_LNK_NEWRVS);
        store("type", newRVLayer.getTypeText(2));
        newRVLayer.gotoType(2);

        validatePresent(By.xpath("//button[contains(text(), \""+get("type")+"\")]"));
    }

    @Test
    public void testCanGoToNewRVsWithFilter() {

    }
}
