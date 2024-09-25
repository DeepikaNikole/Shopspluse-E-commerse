//package com.utilities;
//
//import java.io.FileInputStream;
//import java.io.IOException;
//import java.util.Properties;
//
//public class PropertyUtils {
//
//    private static Properties properties = new Properties();
//
//    static {
//        try {
//            // Load the properties file only once
//            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
//            properties.load(fis);
//        } catch (IOException e) {
//            e.printStackTrace();
//            throw new RuntimeException("Failed to load config.properties file.");
//        }
//    }
//
//    public static String readProperty(String key) {
//        return properties.getProperty(key);
//    }
//}
package com.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtils {

    private static Properties properties = new Properties();

    static {
        try {
            // Load the properties file only once
            FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "/src/main/resources/config.properties");
            properties.load(fis);
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to load config.properties file.");
        }
    }

    public static String readProperty(String key) {
        return properties.getProperty(key);
    }
}
