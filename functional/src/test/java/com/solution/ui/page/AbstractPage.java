package com.solution.ui.page;

import com.solution.ui.utils.DriverManager;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class AbstractPage {

    @Autowired
    private DriverManager driverManager;

    protected AbstractPage(DriverManager driverManager) {
        PageFactory.initElements(driverManager.getWebDriver(), this);
    }

    protected void openAt(String url) {
        driverManager.getWebDriver().get(url);
    }
}
