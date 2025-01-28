package com.framework.report;

import com.aventstack.extentreports.ExtentTest;
import org.openqa.selenium.WebDriver;

public class ExtentManager {
    public static ThreadLocal<ExtentTest> threadLocal=new ThreadLocal<>();

    public static void setTest(ExtentTest test)
    {
        threadLocal.set(test);
    }

    public static ExtentTest getTest()
    {
        return threadLocal.get();

    }
}
