package config;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

    public static Properties prop = new Properties();

    static {
        try {
            InputStream input = ConfigReader.class
                    .getClassLoader()
                    .getResourceAsStream("config.properties");

            if (input == null) {
                throw new RuntimeException("config.properties not found in src/main/resources");
            }

            prop.load(input);

        } catch (Exception e) {
            throw new RuntimeException("Failed to load config.properties", e);
        }
    }

    public static String getProperty(String key) {
        return prop.getProperty(key);
    }
}
