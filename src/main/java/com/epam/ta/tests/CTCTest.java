package com.epam.ta.tests;

import com.epam.ta.framework.ui.application.business_objects.BusinessTrip;
import com.epam.ta.framework.ui.application.commonconstants.AnyParameters;
import com.epam.ta.framework.ui.application.enums.Projects;
import com.epam.ta.framework.ui.application.enums.User;
import com.epam.ta.framework.ui.application.steps.businesstrip.BusinessTripStep;
import com.epam.ta.framework.ui.core.driver.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CTCTest {
    private BusinessTripStep businessTripStep = new BusinessTripStep();
    private final String sectionName = "Business Trips";


    @Test(description = "Log in")
    @Parameters({"baseUrl"})
    public void loginTest(String baseUrl){
        Assert.assertTrue(businessTripStep.login(baseUrl), "Impossible to login to CTC");
    }

    @Test(dependsOnMethods = "loginTest", description = "check opening the list of Bussiness Trips")
    @Parameters({"baseUrl"})
    public void openListOfBT(String baseUrl) {
        Assert.assertEquals(businessTripStep.checkingNameOfOpenedItemList(baseUrl), sectionName, "The section did not found");
    }

    @Test(dependsOnMethods = "openListOfBT", description = "create new BT")
    public void createNewBt(){
        BusinessTrip item = new BusinessTrip(AnyParameters.summary, User.T_USER, Projects.ENRC_TRD.getProjectName(),AnyParameters.estimatedBudget, AnyParameters.plannedStartDate, AnyParameters.plannedEndDate,
                AnyParameters.locationFrom, AnyParameters.country, AnyParameters.destinationCity, AnyParameters.destinationAddress, AnyParameters.description);
        businessTripStep.createBT(item);
        Assert.assertTrue(businessTripStep.checkingIDOfBusinessTrip(), "Business Trip is not created");
    }

    @Test(dependsOnMethods = "createNewBt", description = "submit BT")
    public void submitBT(){
        businessTripStep.submitWithActionNote();
        Assert.assertTrue(businessTripStep.isSubmitted(), "Business Trip is not submited");
    }

    @Test(dependsOnMethods = "submitBT", description = "Log out")
    public void logOut() {
        Assert.assertTrue(businessTripStep.logout(),"Logout is not performed");
    }

    @AfterClass(description = "Close browser")
    public void closeBrowser(){
        Driver.closeBrowser();
    }
}
