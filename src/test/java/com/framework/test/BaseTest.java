package com.framework.test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.framework.config.FrameworkConfig;
import com.framework.driver.Driver;
import com.framework.report.ExtentReport;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import java.lang.reflect.Method;
import java.time.Duration;

public class BaseTest {

    protected static ExtentReports extent;
    protected ExtentTest test;

    @BeforeSuite
    public void beforeSuite()
    {
        ExtentReport.initReport();
    }

    @BeforeMethod
    public void setUp(Method method)
    {

        Driver.init();
       ExtentReport.createTest(method.getName());

    }

    @AfterMethod
    public void tearDown()
    {
       Driver.tearDown();
    }

    @AfterSuite
    public void afterSuite()
    {

        ExtentReport.flushReport();
    }
}
