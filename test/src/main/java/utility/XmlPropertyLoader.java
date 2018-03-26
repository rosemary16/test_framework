package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InvalidPropertiesFormatException;
import java.util.Properties;

/**
 * utility.XmlPropertyLoader for loading properties from xml property file.
 */
public class XmlPropertyLoader {

    private static Properties props = null;

    /**
     * Load property from src/main/resources/properties.xml file.
     *
     * @param propertyName the property name
     * @return the string value
     */
    public static String loadProperty(String propertyName) {
        if (props == null) {
            synchronized (XmlPropertyLoader.class) {
                if (props == null) {
                    props = new Properties();
                    try {
                        FileInputStream fis = new FileInputStream(
                                "test/src/main/resources/properties.xml");
                        props.loadFromXML(fis);
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    } catch (InvalidPropertiesFormatException e) {
                        e.printStackTrace();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return props.getProperty(propertyName);
    }

}
