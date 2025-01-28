package com.framework.listener;

import com.framework.report.ExtentLog;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

    public void onTestFailure(ITestResult result)
    {
        ExtentLog.fail(result.getName()+ " is failed ");
    }

}
