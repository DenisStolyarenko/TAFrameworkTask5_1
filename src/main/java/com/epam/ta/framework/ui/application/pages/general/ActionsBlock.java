package com.epam.ta.framework.ui.application.pages.general;

import com.epam.ta.framework.ui.application.pages.AbstractPage;
import com.epam.ta.framework.ui.core.driver.Driver;
import com.epam.ta.framework.ui.core.utils.DateUtil;
import com.epam.ta.framework.ui.core.utils.Waiters;
import org.openqa.selenium.By;

public class ActionsBlock extends AbstractPage {

    private final By SUBMIT_BUTTON_LOCATOR = By.xpath("//input[@value='Submit']");
    private final By CANCEL_BUTTON_LOCATOR = By.xpath("//input[@value='Cancel']");
    private final By ACTION_FRAME_LOCATOR = By.xpath("//iframe[@id='frLookupDialog']");
    private final By ACTION_NOTE_LOCATOR = By.xpath("//textarea[@id='actionNote']");
    private final By WORKFLOW_TITLE_LOCATOR = By.xpath("//td[@class='captionTitle']/h1");
    private final By SUBMIT_BUTTON_IN_FRAME_LOCATOR = By.xpath("//input[contains(@value,'Submit')]");


    public void clickSubmit() {
        Waiters.waitForElementPresent(SUBMIT_BUTTON_LOCATOR);
        Driver.getDriverInstance().findElement(SUBMIT_BUTTON_LOCATOR).click();
        Driver.getDriverInstance().switchTo().frame(Driver.getDriverInstance().findElement(ACTION_FRAME_LOCATOR));
    }

    public void clickCancel() {
        Waiters.waitForElementPresent(CANCEL_BUTTON_LOCATOR);
        Driver.getDriverInstance().findElement(CANCEL_BUTTON_LOCATOR).click();
        Driver.getDriverInstance().switchTo().frame(Driver.getDriverInstance().findElement(ACTION_FRAME_LOCATOR));
    }

    public void fillActionNote(){
        Waiters.waitForElementVisibleEnabled(ACTION_NOTE_LOCATOR);
        Driver.getDriverInstance()
                .findElement(ACTION_NOTE_LOCATOR)
                .sendKeys(Driver.getDriverInstance().findElement(WORKFLOW_TITLE_LOCATOR).getText() + " performed " + DateUtil.getCurrentDate());
    }

    public void submitConfirmation(){
        Waiters.waitForElementVisibleEnabled(SUBMIT_BUTTON_IN_FRAME_LOCATOR);
        Driver.getDriverInstance().findElement(SUBMIT_BUTTON_IN_FRAME_LOCATOR).click();
    }
}
