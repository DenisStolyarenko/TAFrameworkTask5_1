package com.epam.ta.framework.ui.application.steps.businesstrip;

import com.epam.ta.framework.ui.application.business_objects.BusinessTrip;
import com.epam.ta.framework.ui.application.pages.businesstrip.BTListPage;
import com.epam.ta.framework.ui.application.pages.businesstrip.CreateBTPage;
import com.epam.ta.framework.ui.application.steps.BaseStep;

public class BusinessTripStep extends BaseStep {
    private CreateBTPage createBTPage = new CreateBTPage();
    private BTListPage btListPage = new BTListPage();

    public BusinessTripStep() {
    }

    public void createBT(BusinessTrip businessTrip){
        btListPage.newBtClick();
        createBTPage.chooseProject(businessTrip.getProjectName());
        createBTPage.inputEstimatedBudget(businessTrip.getEstimatedBudget());
        createBTPage.inputTripFromLocation(businessTrip.getLocationFrom());
        createBTPage.inputDestinationCountry(businessTrip.getCountry());
        createBTPage.inputDestinationCity(businessTrip.getDestinationCity());
        createBTPage.inputDestinationAddress(businessTrip.getDestinationAddress());
        createBTPage.inputTripDescription(businessTrip.getDescription());
        createBTPage.inputStartDate(businessTrip.getPlannedStartDate());
        createBTPage.inputEndDate(businessTrip.getPlannedEndDate());
        createBTPage.inputSummary(businessTrip.getSummary());
        createBTPage.saveItem();
    }

    public String checkingNameOfOpenedItemList(String baseUrl){
        btListPage.openBTlist(baseUrl);
        return btListPage.getListName();
    }

    public boolean checkingIDOfBusinessTrip(){
        return createBTPage.quantityOfDigitsInIDnumber() == 19;
    }

    public boolean isSubmitted(){
        return (createBTPage.getStatus().toLowerCase().contains("submitted")) || (createBTPage.getStatus().toLowerCase().contains("submited"));
    }
}
