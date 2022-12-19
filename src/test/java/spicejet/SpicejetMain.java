package spicejet;

import com.spicejet.genericUtility.ExcelUtility;
import com.spicejet.genericUtility.FileUtility;
import com.spicejet.genericUtility.IConstantPath;
import com.spicejet.genericUtility.JavaUtility;
import com.spicejet.genericUtility.PropertyFileKeys;
import com.spicejet.genericUtility.SheetName;
import com.spicejet.genericUtility.WebDriverUtility;

public class SpicejetMain {

	public static void main(String[] args) {
		ExcelUtility excelutility = new ExcelUtility();
		FileUtility fileutility = new FileUtility();
		JavaUtility javaUtility=new JavaUtility();
		WebDriverUtility webDriverUtility=new WebDriverUtility();
		
		/**
		 * Get data from property file
		 */
		fileutility.getPropertyPath(IConstantPath.PROPERTY_FILE_PATH);

		String browser = fileutility.getDataFromPropertyFile(PropertyFileKeys.BROWSER.convertToString());
		String url = fileutility.getDataFromPropertyFile( PropertyFileKeys.URL.convertToString());
		String timeout1 = fileutility.getDataFromPropertyFile(PropertyFileKeys.TIMEOUT.convertToString());
		long timeout = Long.parseLong(timeout1);
		
		
		excelutility.getExcelPath(IConstantPath.EXCEL_PATH);
		
		String expectedOrder = excelutility.getDataFromExcel(SheetName.SHEET1.convertToString(),2,6);
		webDriverUtility.launchApplication(browser, timeout, url);
	}

}
