package org.api.ConfigManager;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigProperties {

    public static ApplicationConfigReader cm = new ApplicationConfigReader();

    public static String baseurl = cm.getBaseUrl();





}
