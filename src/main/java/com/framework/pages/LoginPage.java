package com.framework.pages;

import com.framework.driver.DriverManager;
import com.framework.report.ExtentLog;
import com.framework.report.ExtentManager;
import com.framework.report.ExtentReport;
import com.framework.util.WebElementUtils;
import org.openqa.selenium.By;

public class LoginPage {
    private static  final By TEXTBOX_USERNAME= By.name("username");
    private static final By TEXTBOX_PASSWORD=By.name("password");
    private static final By BUTTON_LOGIN=By.className("oxd-button");
    private static final By TEXT_ERROR=By.className("oxd-alert-content-text");


    public void setUserName(String username)
    {

        WebElementUtils.sendKeys(TEXTBOX_USERNAME,username);
        ExtentLog.pass("UserName is entered");
    }
    public  void setPassword(String aPassword)
    {
        WebElementUtils.sendKeys(TEXTBOX_PASSWORD,aPassword);
        ExtentLog.pass("Password is entered");
    }
    public  void clickLogin( )
    {

        WebElementUtils.click(BUTTON_LOGIN);
        ExtentLog.pass("Login Button is Clicked");

    }

    public void performLogin(String userName,String password)
    {
        setUserName(userName);
        setPassword(password);
        clickLogin();
    }

    public String getErrorMessage()
    {
        String error=DriverManager.getDriver().findElement(TEXT_ERROR).getText();
        return error;
    }

}
