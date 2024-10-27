package com.PropertiesFile.Configuration;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class ReadConfigurationProperties {

	// here i creating an obj of properties class
	Properties property = new Properties(); //properties file is a class in java to read the input from the properties class

	String projectpath = System.getProperty("user.dir");

	//String path = "C:/Users/Bharg/eclipse-workspace/SeleniumJavaFrameWork/src/main/java/com/PropertiesFile/Configuration/configurationfile.properties";

	//public ReadConfigurationProperties {}
	public  String  getProperties() {

		//this.property = property;

		//Properties property = new Properties();

		try {
			//Properties property = new Properties();
			FileInputStream input = new FileInputStream(projectpath +"/src/main/java/com/PropertiesFile/Configuration/configurationfile.properties");
			try {
				property.load(input);
				//input.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch ( FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return projectpath;
	}
	public  String getURl()
	{
		String Url = property.getProperty("Url");
		if(Url!=null)
			return Url;
		else
			throw new RuntimeException("Url is not found in configurationfile.propertyfile");
	}
	public  String getText()
	{
		String text = property.getProperty("text");
		if(text!=null)
			return text;
		else
			throw new RuntimeException("text is not found in configurationfile.propertyfile");
	}
	public  String getKeys()
	{
		String keys = property.getProperty("Keys");
		if(keys!=null)
			return keys;
		else
			throw new RuntimeException("Keys is not found in configurationfile.propertyfile");
	}
}

