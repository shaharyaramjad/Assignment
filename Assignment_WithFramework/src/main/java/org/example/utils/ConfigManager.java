package org.example.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigManager {

    private static ConfigManager manager;
    private static final Properties prop = new Properties();

    private ConfigManager(){

        InputStream inputStream = ConfigManager.class.getResourceAsStream("src/main/resources/config.properties");
        try {
            prop.load(inputStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static ConfigManager getInstance(){
        if(manager == null)
        {
            synchronized (ConfigManager.class){
                manager = new ConfigManager();

            }
        }

        return manager;
    }

    public String getString(String key)
    {
        return System.getProperty(key,prop.getProperty(key));
    }






}
