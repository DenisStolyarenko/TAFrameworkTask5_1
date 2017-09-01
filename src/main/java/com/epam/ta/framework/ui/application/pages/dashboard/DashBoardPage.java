package com.epam.ta.framework.ui.application.pages.dashboard;

import com.epam.ta.framework.ui.application.pages.AbstractPage;
import com.epam.ta.framework.ui.core.driver.Driver;
import com.epam.ta.framework.ui.core.utils.Waiters;
import org.openqa.selenium.By;

public class DashBoardPage extends AbstractPage {
    private final By LOGGED_LABEL_LOCATOR = By.xpath("//td[@id='headerLogin']/div[@class='blInfoLogin']");
    private final By DASHBOARD_LABEL_LOCATOR = By.xpath("//td[@class='header1']/h1[text()='Dashboard']");

    public String readLoggedinText(){
        Waiters.waitForElementPresent(DASHBOARD_LABEL_LOCATOR);
        return Driver.getDriverInstance().findElement(LOGGED_LABEL_LOCATOR).getText();
    }
}
