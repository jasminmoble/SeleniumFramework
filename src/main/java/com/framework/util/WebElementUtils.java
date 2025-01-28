package com.framework.util;

import com.framework.config.ConfigUtil;
import com.framework.driver.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WebElementUtils {

    public static void click(By by)
    {
        WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigUtil.getConfig().Timeout()));
        wait.until(ExpectedConditions.elementToBeClickable(by));

        DriverManager.getDriver().findElement(by).click();
    }

    public static void sendKeys(By by,String text)
    {
        WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigUtil.getConfig().Timeout()));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
        DriverManager.getDriver().findElement(by).sendKeys(text);
    }

    public static String getText(By by)
    {
        WebDriverWait wait=new WebDriverWait(DriverManager.getDriver(), Duration.ofSeconds(ConfigUtil.getConfig().Timeout()));
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
       return DriverManager.getDriver().findElement(by).getText();
    }
}
