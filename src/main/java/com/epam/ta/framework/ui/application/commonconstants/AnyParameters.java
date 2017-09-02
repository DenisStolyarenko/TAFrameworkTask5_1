package com.epam.ta.framework.ui.application.commonconstants;


import com.epam.ta.framework.ui.core.utils.DateUtil;

import java.util.Date;

public class AnyParameters {
    public final static String summary = "Item is created by Selenium " + DateUtil.getSdf(DateUtil.getCurrentDate());

    public final static Integer estimatedBudget = 200000;
    public final static Date plannedStartDate = DateUtil.getCurrentDate();
    public final static Date plannedEndDate = DateUtil.getNextDate();
    public final static String locationFrom = "Karaganda";
    public final static String country = "Belarus";
    public final static String destinationCity = "Minsk";
    public final static String destinationAddress = "Minsk, Lenin street";
    public final static String description = "Travel to " + destinationCity + " " + DateUtil.getCurrentDate();




}
