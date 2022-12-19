package com.spicejet.genericUtility;

import java.util.Random;

public class JavaUtility {
	/**
	 * 
	 * @param s
	 * @param l
	 * @return
	 */
		
		public Object StringToAnyDataType(String s,String strategy) //s has integer which is of string type 
		//we have used object because we have used both long and int
		{
			Object convertedData = null;
			if(strategy.equals("int"))
			{
				convertedData=Integer.parseInt(s);
			}
			else if(strategy.equals("long"))
			{
			convertedData= Long.parseLong(s);
		}
			return convertedData;
	}
		/**
		 * 
		 * @param limit
		 * @return
		 */
		public int getRandomNumber(int limit)
		{
			int randomNumber = new Random().nextInt();
			return randomNumber;
		}
}
