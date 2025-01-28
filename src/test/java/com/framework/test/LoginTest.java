package com.framework.test;

import com.framework.config.FrameworkConfig;
import com.framework.driver.Driver;
import com.framework.driver.DriverManager;
import com.framework.pages.LoginPage;
import com.framework.testdata.TestData;
import com.framework.util.DataSupplierUtil;
import io.github.sskorol.core.DataSupplier;
import io.github.sskorol.data.TestDataReader;
import io.github.sskorol.data.XlsxReader;
import one.util.streamex.StreamEx;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;
import java.time.Duration;

public class LoginTest extends BaseTest{


    @Test(dataProvider = "getData",dataProviderClass = DataSupplierUtil.class,description = "This method is to verfiy the error message in Login page")
    public void loginTest(TestData data)throws InterruptedException {

        LoginPage loginPage=new LoginPage();
        loginPage.performLogin(data.userName, data.password);
        Thread.sleep(3000);
        String errorMessage=loginPage.getErrorMessage();
        Assert.assertEquals(errorMessage,"invalid credentials");
    }


}
