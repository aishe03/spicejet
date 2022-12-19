package com.spicejet.genericUtility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverUtility {
	/**
	 * This method is used to
	 * launch the browser based on the browser key
	 * maximize the browser 
	 * provide implicit wait
	 * launch application by using url
	 * @param browser
	 * @param timeout
	 * @param url
	 * @return
	 */

	public WebDriver launchApplication(String browser,long timeout,String url)
	{
		String browser1="chrome";
		WebDriver driver=null;
		if(browser.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
		}
		else if(browser.equals("firefox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
		}
		else if(browser.equals("ie"))
		{
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
		}
		else
		{
			System.out.println("please enter valid browser name");
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver;
	} 
	/**
	 * This method is used to wait for page to load before indentifying any sychronized element in DOM [HTML-Docuent]
	 * @param driver
	 */
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	/**
	 * used to place mouse cursor on specified element
	 * @param driver
	 * @param elemnet
	 */
	public void mouseOverOnElemnet(WebDriver driver , WebElement elemnet)
	{
		Actions act = new Actions(driver);
		act.moveToElement(elemnet).perform();
	}
	/**
	 * This method is used to scroll to a particular element
	 * @param driver
	 */
	public void scrollToParticularElement(WebDriver driver)
	{
	JavascriptExecutor js = (JavascriptExecutor) driver; 
	js.executeScript("window.scrollBy(0,50)", "");
	}
}
