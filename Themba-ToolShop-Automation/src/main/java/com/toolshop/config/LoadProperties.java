package com.toolshop.config;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProperties {

    private static final Properties properties = new Properties();
    private static final String FILE_PATH = "src/main/resources/config.properties";

    static {
        loadProperties();
    }

    private static void loadProperties() {
        try (FileInputStream inputStream = new FileInputStream(FILE_PATH)) {
            properties.load(inputStream);
        } catch (IOException error) {
            throw new RuntimeException("Failed to load properties", error);
        }
    }

    public static String getProperty(String key) {
        String value = properties.getProperty(key);

        if (value == null || value.isEmpty()) {
            throw new IllegalArgumentException("Property '" + key + "' is empty or missing");
        }

        return value;
    }
}
