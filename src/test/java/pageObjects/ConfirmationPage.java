package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testBase.BaseClass;

public class ConfirmationPage extends BaseClass{
	
	@FindBy(xpath="//h1[@class='cds-119 css-1euneyv cds-121']")
	public WebElement confirmMsg;
	

}
