package com.spicejet.genericUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	private FileInputStream fis=null;
	Properties property=null;
	public void getPropertyPath(String propertyFilePath)
	{
		try {
			fis=new FileInputStream(propertyFilePath);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		property=new Properties();
		try {
			property.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to fetch data from the property file
	 * @param propertyFilePath
	 * @param key
	 * @return
	 * @throws IOException
	 */
	public String getDataFromPropertyFile(String key) 
	{
				String value = property.getProperty(key).trim();
				return value;	
	}
	public void closePropertyFile() throws IOException  {
		fis.close();
	}
}
