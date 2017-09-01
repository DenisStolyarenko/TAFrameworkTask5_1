package com.epam.ta.framework.ui.application.enums;

public enum WebDriverPath {
    CHROME("webdriver.chrome.driver", "driverbinaries/chromedriver.exe");

    private String webDriverName;
    private String webDriverPath;

    WebDriverPath(String webDriverName, String webDriverPath) {
        this.webDriverName = webDriverName;
        this.webDriverPath = webDriverPath;
    }

    public String getWebDriverName() {
        return webDriverName;
    }

    public String getWebDriverPath() {
        return webDriverPath;
    }
}
