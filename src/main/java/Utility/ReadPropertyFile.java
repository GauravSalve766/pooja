package Utility;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadPropertyFile {

    public static String readpropertyfile(String value) throws Exception {
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\Lenovo\\eclipse-workspace\\PracticeFramework\\TestData\\config.properties");
		prop.load(file);
		return prop.getProperty(value);
	}
}
