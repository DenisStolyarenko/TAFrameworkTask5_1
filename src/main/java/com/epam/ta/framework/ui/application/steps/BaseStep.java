package com.epam.ta.framework.ui.application.steps;

import com.epam.ta.framework.ui.application.enums.User;
import com.epam.ta.framework.ui.application.pages.dashboard.DashBoardPage;
import com.epam.ta.framework.ui.application.pages.general.ActionsBlock;
import com.epam.ta.framework.ui.application.pages.login.LoginPage;

public class BaseStep {

    private final String textWelcome = "Welcome to EPAM Cost Tracking Center";
    private final String textAfterSuccessfulLogin = "Logged in as ";

    private LoginPage loginPage = new LoginPage();
    private DashBoardPage dashBoardPage = new DashBoardPage();
    private ActionsBlock actionsBlock = new ActionsBlock();

    protected BaseStep() {
    }

    public boolean login(String baseUrl){
        loginPage.open(baseUrl);
        loginPage.login(User.T_USER.getLogin(), User.T_USER.getPassword());
        return dashBoardPage.readLoggedinText().contains(textAfterSuccessfulLogin + User.T_USER.getFullName());
    }

    public boolean logout(){
        actionsBlock.logout();
        actionsBlock.confirmation();
        return new LoginPage().readIntroductionText().contains(textWelcome);
    }

    public void submitWithActionNote(){
        actionsBlock.clickSubmit();
        actionsBlock.fillActionNote();
        actionsBlock.submitConfirmation();
    }

    public void submitWithoutActionNote(){
        actionsBlock.clickSubmit();
        actionsBlock.submitConfirmation();
    }
}
