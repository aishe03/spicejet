package com.spicejet.genericUtility;

public enum SheetName {
	  SHEET1("Sheet1");
		private String keys;
		/**
		 * This contains method for sheetname
		 * @param keys
		 */
		//setter (Constructor)
		private SheetName(String keys)
		{
			this.keys=keys;
		}
		/**
		 * This contains method to convert to String
		 * @return
		 */
		//getter
		public String convertToString()
		{
			return keys.toString();
		}
}
