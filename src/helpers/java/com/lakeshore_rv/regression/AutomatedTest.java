package com.lakeshore_rv.regression;

import com.lakeshore_rv.regression.layers.NewRVsLayer;
import com.lakeshore_rv.regression.partial.TopBar;
import io.ddavison.conductor.Browser;
import io.ddavison.conductor.Config;
import io.ddavison.conductor.Locomotive;

/**
 * @author ddavison
 * @since Jul 30, 2015
 */
@Config(
    browser = Browser.CHROME,
    url = "http://lakeshore-rv.com",
    hub = "http://adamsobczak:EuuxjkrGNqRP9i5ug4zm@hub.browserstack.com/wd/hub"
)

// adamsobczak
// EuuxjkrGNqRP9i5ug4zm
public class AutomatedTest extends Locomotive {
    public TopBar topBar;
    public NewRVsLayer newRVLayer;

    public AutomatedTest() {
        driver.manage().window().maximize();
        this.topBar = new TopBar(this);
        this.newRVLayer = new NewRVsLayer(this);
    }
}
