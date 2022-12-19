package com.spicejet.objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Spicejet_FirstPage {

	@FindBy(xpath="//*[name()='svg' and @data-testid='svg-img' ]/ancestor::div[@class='css-1dbjc4n r-1awozwy r-1loqt21 r-18u37iz r-117bsoe r-1otgn73' and @data-testid='round-trip-radio-button']/div[@class='css-1dbjc4n r-zso239']")
	private WebElement roundTripRadioButton;
	@FindBy(xpath="//div[@data-testid='to-testID-origin']")
	private WebElement fromTextBox;
	@FindBy(xpath="//input[@value='Bengaluru (BLR)']")
	private WebElement bengaluru_departure;
	@FindBy(xpath="//div[@data-testid='to-testID-destination']")
	private WebElement toTextBox;
	@FindBy(xpath="//input[@value='Delhi (DEL)']")
	private WebElement delhi_departure;
    
	public Spicejet_FirstPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
public void roundTripRadioButton()
{
	roundTripRadioButton.click();
}

}