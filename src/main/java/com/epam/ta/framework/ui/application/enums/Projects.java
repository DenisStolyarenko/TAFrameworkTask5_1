package com.epam.ta.framework.ui.application.enums;

import java.math.BigDecimal;

public enum Projects {
    ENRC_TRD("ENRC-TRD", new BigDecimal(4000741400009063959L)),
    ENRC_ADM("ENRC-ADM", new BigDecimal(4060741400008518037L));

    private String projectName;
    private BigDecimal projectId;

    Projects(String projectName, BigDecimal projectId) {
        this.projectName = projectName;
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public BigDecimal getProjectId() {
        return projectId;
    }

    @Override
    public String toString() {
        return "Projects{" +
                "projectName='" + projectName + '\'' +
                ", projectId=" + projectId +
                '}';
    }
}
