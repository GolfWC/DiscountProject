package testBase;

import java.io.FileInputStream;
import java.util.Properties;


public class ConficReader {

private static Properties configFile;
	
	static {
		try {
			String path = "src\\test\\resources\\configs\\confic.properties";
			
			FileInputStream input = new FileInputStream(path);
			configFile = new Properties();
			configFile.load(input);
			input.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}
	
	public static String getProperty(String keyName) {
		return configFile.getProperty(keyName);
	}
}
