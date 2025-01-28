package com.framework.report;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.framework.util.ScreenshotUtil;

public class ExtentLog {

    public static void pass(String message)
    {

        ExtentManager.getTest().pass
                (message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getScreenshot()).build());
    }

    public static void fail(String message)
    {
        ExtentManager.getTest().fail(
                message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getScreenshot()).build());
    }


    public static void info(String message)
    {
        ExtentManager.getTest().info

                ( message, MediaEntityBuilder.createScreenCaptureFromBase64String(ScreenshotUtil.getScreenshot()).build());
    }

}
