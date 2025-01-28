package com.framework.pages;

import com.framework.driver.DriverManager;

public class HomePage {

    public String getTitle()
    {
        return  DriverManager.getDriver().getTitle();

    }
}
