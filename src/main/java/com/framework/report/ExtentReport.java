package com.framework.report;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    public static ExtentReports extent;
    public static ExtentTest test;

    public static void initReport()
    {
        extent = new ExtentReports();
        String reportPath=System.getProperty("user.dir")+"/report.html";
        ExtentSparkReporter spark = new ExtentSparkReporter(reportPath);
        extent.attachReporter(spark);
    }

    public static void createTest(String methodName)
    {
        test=extent.createTest(methodName);
        ExtentManager.setTest(test);
    }

    public static void flushReport()
    {
        extent.flush();
    }
}
