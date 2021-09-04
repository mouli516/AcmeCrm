package com.acme.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.acme.GenericLibrary.BaseTest;
import com.acme.GenericLibrary.WebDriverCommonLib;

public class CreateAccountPage {
	
	
	@FindBy(xpath = "//input[@name='property(Account Name)']") private WebElement Accountname;
	@FindBy(xpath = "//img[@title='Account Name Lookup']") private WebElement accountnamelookup;
	@FindBy(xpath = "//a[text()='rashmi']") private WebElement rashmi;
	@FindBy(xpath = "//select[@name='property(Account Type)']") private WebElement AccountTypeDropdown;
	@FindBy(xpath = "//select[@name='property(Industry)']") private WebElement industuryDropdown;
	@FindBy(xpath = "(//input[@value='Save'])[2]") private WebElement savebtn;
	
	public CreateAccountPage()
	{
		PageFactory.initElements(BaseTest.driver, this);
	}
	
	public void createNewAccount(String accountname) throws Throwable
	{
		WebDriverCommonLib wlb = new WebDriverCommonLib();
	 
		Accountname.sendKeys(accountname);
		accountnamelookup.click();
		wlb.getWindowHandleclick("Zoho CRM - Account Name Lookup",rashmi);
		
	}
	

}
