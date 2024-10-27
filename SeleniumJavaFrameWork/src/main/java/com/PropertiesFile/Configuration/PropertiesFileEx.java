package com.PropertiesFile.Configuration;

import java.util.Properties;

import java.io.InputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class PropertiesFileEx {
	
	static Properties property = new Properties();
	
	static String projectpath= System.getProperty("user.dir");

	public static void main(String[] args) throws IOException  {
		
		getProperties();
		setProperties();
		getProperties();
		//setProperties();
}
	public static void getProperties()  {
		try {
		//creating an obj of properties class
		//Properties property = new Properties();
		
		//String projectpath= System.getProperty("user.dir");
		
		//creating an obj of class inputstream to read the input from the properties file
		InputStream input = new FileInputStream(projectpath +"/src/main/java/com/PropertiesFile/Configuration/config.properties");
		
		//loading the properties  from .properties file 
		property.load(input);
		
		//getting the values from the .properties file
		String brows = property.getProperty("Browser");
		
		System.out.println(brows);
		
		System.out.println(property.getProperty("UserName"));
				
		}catch(Exception exp) {
			System.out.println(exp.getMessage());
			System.out.println(exp.getCause());
			System.out.println(exp.getStackTrace());
			
		}
	}
		public static void setProperties() throws IOException    {
			
			OutputStream output;
			try {
				output = new FileOutputStream(projectpath +"/src/main/java/com/PropertiesFile/Configuration/config.properties");
				property.setProperty("Browser", "chrome");
				property.setProperty("UserName", "bhargavi");
				property.store(output,null);
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			//property.setProperty("url", "https://google.com");
			//property.setProperty("Username", "Bhargavi");
			
			
			
			
		}
		
		
		
	}


