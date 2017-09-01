package com.epam.ta.framework.ui.application.pages;

import com.epam.ta.framework.ui.core.driver.Driver;
import com.epam.ta.framework.ui.core.utils.Waiters;
import org.openqa.selenium.By;

public abstract class AbstractPage {
    private final By LOGOUT_LOCATOR = By.xpath("//a[@href='logout.do']");
    private final String ADDITIONAL_URL = "/login.do?logout=true&tz=GMT%2B06:00";

    public void open(String baseUrl){
        Driver.getDriverInstance().get(baseUrl + ADDITIONAL_URL);
    }

    public void logout(){
        Waiters.waitForElementVisible(LOGOUT_LOCATOR);
        Waiters.waitForElementEnabled(LOGOUT_LOCATOR);
        Driver.getDriverInstance().findElement(LOGOUT_LOCATOR).click();
    }

    public void confirmation(){
        Driver.getDriverInstance().switchTo().alert().accept();
    }


}
