package com.framework.driver;

import com.framework.config.ConfigUtil;
import com.framework.config.FrameworkConfig;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {
    //public static WebDriver driver;
    //public static ThreadLocal<WebDriver> threadLocal=new ThreadLocal<>();
    public  static void init()
    {
        WebDriver driver;
        String  browser=ConfigUtil.getConfig().Browser();

        driver=DriverFactory.getDriver(browser);
        DriverManager.setDriver(driver);
        DriverManager.getDriver().manage().window().maximize();
        DriverManager.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(ConfigUtil.getConfig().Timeout()));
        DriverManager.getDriver().get(ConfigUtil.getConfig().Url());
    }

    public static void tearDown()
    {
        DriverManager.getDriver().quit();
    }
}
