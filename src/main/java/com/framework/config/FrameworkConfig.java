package com.framework.config;

import org.aeonbits.owner.Config;

//@Config.Sources(value="file:C:\\Users\\getmo\\SampleSelenium\\Framework\\SeleniumFrameworkV1\\src\\test\\resources\\Config.properties")
@Config.Sources(value = "file:./src/test/resources/Config.properties")
public interface FrameworkConfig extends Config {
    String Browser();
    long Timeout();
    String Url();
}
