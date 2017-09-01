package com.epam.ta.framework.ui.application.pages.businesstrip;

import com.epam.ta.framework.ui.application.pages.AbstractPage;
import com.epam.ta.framework.ui.core.driver.Driver;
import com.epam.ta.framework.ui.core.utils.Waiters;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class BTDetailsBlock extends AbstractPage {
    private final By PLANNED_DURATION_LOCATOR = By.xpath("//span[@id='plannedDuration']");
    private final By PLANNED_START_DATE_LOCATOR = By.xpath("//input[@id='plannedStartDate_ui']");
    private final By PLANNED_END_DATE_LOCATOR = By.xpath("//input[@id='plannedEndDate_ui']");
    private final By DESTINATION_COUNTRY_LOCATOR = By.xpath(".//select[@name='destinationCountryId']");
    private final By TRIP_FROM_LOCATION_LOCATOR = By.xpath(".//select[@name='fromLocationId']");
    private final By DESTINATION_CITY_LOCATOR = By.xpath("//input[@name='destinationCity']");
    private final By DESTINATION_ADDRESS_LOCATOR = By.xpath("//textarea[@name='destinationAddress']");
    private final By DESCRIPTION_LOCATOR = By.xpath("//textarea[@id='description']");
    private final By TICKET_LOCATOR = By.xpath("//input[@id='ticketsRequired']");
    private final By CAR_LOCATOR = By.xpath("//input[@id='carRequired']");

    public void inputStartDate(String plannedStartDate){
        Waiters.waitForElementVisibleEnabled(PLANNED_START_DATE_LOCATOR);
        Driver.getDriverInstance().findElement(PLANNED_START_DATE_LOCATOR).click();
        Driver.getDriverInstance().findElement(PLANNED_START_DATE_LOCATOR).clear();
        Driver.getDriverInstance().findElement(PLANNED_START_DATE_LOCATOR).sendKeys(plannedStartDate);
    }

    public void inputEndDate(String plannedEndDate){
        Waiters.waitForElementVisibleEnabled(PLANNED_END_DATE_LOCATOR);
        Driver.getDriverInstance().findElement(PLANNED_END_DATE_LOCATOR).click();
        Driver.getDriverInstance().findElement(PLANNED_END_DATE_LOCATOR).clear();
        Driver.getDriverInstance().findElement(PLANNED_END_DATE_LOCATOR).sendKeys(plannedEndDate);
    }

    public void inputTripFromLocation(String locationFrom){
        Waiters.waitForElementVisibleEnabled(TRIP_FROM_LOCATION_LOCATOR);
        Select locationFromSelect = new Select(Driver.getDriverInstance().findElement(TRIP_FROM_LOCATION_LOCATOR));
        locationFromSelect.selectByVisibleText(locationFrom);
    }

    public void inputDestinationCountry(String country){
        Waiters.waitForElementVisibleEnabled(DESTINATION_COUNTRY_LOCATOR);
        Select countrySelect = new Select(Driver.getDriverInstance().findElement(DESTINATION_COUNTRY_LOCATOR));
        countrySelect.selectByVisibleText(country);
    }

    public void inputDestinationCity(String destinationCity){
        Driver.getDriverInstance().findElement(DESTINATION_CITY_LOCATOR).sendKeys(destinationCity);
    }

    public void inputDestinationAddress(String destinationAddress){
        Driver.getDriverInstance().findElement(DESTINATION_ADDRESS_LOCATOR).sendKeys(destinationAddress);
    }

    public void inputTripDescription(String description){
        Driver.getDriverInstance().findElement(DESCRIPTION_LOCATOR).sendKeys(description);
    }

    public BTDetailsBlock selectTicket(){
        if (!Driver.getDriverInstance().findElement(TICKET_LOCATOR).isSelected()) {
            Driver.getDriverInstance().findElement(TICKET_LOCATOR).click();
        }
        return this;
    }

    public BTDetailsBlock selectCar(){
        if (!Driver.getDriverInstance().findElement(CAR_LOCATOR).isSelected()) {
            Driver.getDriverInstance().findElement(CAR_LOCATOR).click();
        }
        return this;
    }

    public String getPlannedDuration(){
        return Driver.getDriverInstance().findElement(PLANNED_DURATION_LOCATOR).getText();
    }

    public String getPlannedEndDate() {
        return Driver.getDriverInstance().findElement(PLANNED_END_DATE_LOCATOR).getAttribute("value");
    }

    public String getPlannedStartDate() {
        return Driver.getDriverInstance().findElement(PLANNED_START_DATE_LOCATOR).getAttribute("value");
    }
}
