package com.epam.ta.framework.ui.application.business_objects;

import com.epam.ta.framework.ui.application.enums.User;

public abstract class Item {
    protected String summary;
    protected String id;
    protected User creator;
    protected User actionPerfomer;
    protected String currency;
    protected String projectName;

    public Item(String summary, User actionPerfomer, String projectName) {
        this.summary = summary;
        this.actionPerfomer = actionPerfomer;
        this.projectName = projectName;
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
