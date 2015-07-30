package com.lakeshore_rv.regression.layers;

import com.lakeshore_rv.regression.UI;
import com.lakeshore_rv.regression.components.NewRVLayerType;
import io.ddavison.conductor.Locomotive;

/**
 * @author ddavison
 * @since Jul 30, 2015
 */
public class NewRVsLayer extends UI {
    public NewRVsLayer(Locomotive test) {
        super(test);
    }

    public static final String LOC_PARENT       = "ul.dropdown-menu-new";
    public static final String LOC_TYPES_PARENT = LOC_PARENT + " div.new-menu-types";

    /**
     * Go to the type
     * @param index the index of the type in which it appears
     */
    public Locomotive gotoType(int index) {
        return test.click(NewRVLayerType.LOC_BASE + ":nth-child(" + index + ")");
    }

    /**
     * Gets the text inside of the type
     * @param index the index of the type in which it appears
     */
    public String getTypeText(int index) {
        return test.getText(NewRVLayerType.LOC_BASE + ":nth-child(" + index + ")");
    }
}
