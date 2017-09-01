package com.epam.ta.framework.ui.application.business_objects;

import com.epam.ta.framework.ui.application.enums.User;
import com.epam.ta.framework.ui.core.utils.DateUtil;

import java.util.Date;

public class BusinessTrip extends Item {

    private Integer estimatedBudget;
    private Date plannedStartDate;
    private Date plannedEndDate;
    private String locationFrom;
    private String country;
    private String destinationCity;
    private String destinationAddress;
    private String description;

    public BusinessTrip(String summary, User actionPerfomer, String projectName, Integer estimatedBudget,
                        Date plannedStartDate, Date plannedEndDate, String locationFrom, String country, String destinationCity, String destinationAddress, String description) {
        super(summary, actionPerfomer, projectName);
        this.estimatedBudget = estimatedBudget;
        this.plannedStartDate = plannedStartDate;
        this.plannedEndDate = plannedEndDate;
        this.locationFrom = locationFrom;
        this.country = country;
        this.destinationCity = destinationCity;
        this.destinationAddress = destinationAddress;
        this.description = description;
    }

    public Integer getEstimatedBudget() {
        return estimatedBudget;
    }

    public void setEstimatedBudget(Integer estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public String getPlannedStartDate() {
        return DateUtil.getInputFormat(plannedStartDate);
    }

    public String getPlannedEndDate() {
        return DateUtil.getInputFormat(plannedEndDate);
    }

    public String getLocationFrom() {
        return locationFrom;
    }

    public void setLocationFrom(String locationFrom) {
        this.locationFrom = locationFrom;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getDestinationCity() {
        return destinationCity;
    }

    public void setDestinationCity(String destinationCity) {
        this.destinationCity = destinationCity;
    }

    public String getDestinationAddress() {
        return destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String getSummary() {
        return summary;
    }

    public String getId() {
        return id;
    }

    public User getCreator() {
        return creator;
    }

    public User getActionPerfomer() {
        return actionPerfomer;
    }

    public String getCurrency() {
        return currency;
    }

    public String getProjectName() {
        return projectName;
    }
}
