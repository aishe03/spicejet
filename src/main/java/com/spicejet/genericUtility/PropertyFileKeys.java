package com.spicejet.genericUtility;

public enum PropertyFileKeys {
BROWSER("browser"),URL("url"),USERNAME("username"),PASSWORD("password"),TIMEOUT("timeout");

	
	private String keys;

	//setter
	private PropertyFileKeys(String keys)
	{
		this.keys=keys;
    }
	
    //getter
	public String convertToString()
	{
		return keys.toString();
	}
}
