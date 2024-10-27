package com.PropertiesFile.Configuration;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class PropertiesFileEx1 {
	
	public static Properties property;
	
	private static String configurationpath = "src/main/java/com/PropertiesFile/Configuration/Configuration.properties";
	
	public static void initializingPropertiesFile() {
		
		//creating an obj for properties file
		property = new Properties();
		
			try {
				InputStream	input = new FileInputStream(configurationpath);
				
				//loaded the input to read the input from properties
				property.load(input);
			} catch (FileNotFoundException e) {
				
				e.printStackTrace();
			}
			catch (IOException e) {
				
				e.printStackTrace();
			}
		
		
		
		
	}

}
