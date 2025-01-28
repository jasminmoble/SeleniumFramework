package com.framework.config;

import org.aeonbits.owner.ConfigFactory;

public class ConfigUtil {

    public static FrameworkConfig getConfig()
    {

        return ConfigFactory.create(FrameworkConfig.class);
    }
}
