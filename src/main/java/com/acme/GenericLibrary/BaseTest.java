package com.acme.GenericLibrary;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest implements IAutoconstant{
	
	public static WebDriver driver;
	@BeforeClass
	public  void openbrowser() throws Throwable
	{
		FileLibrary fl = new FileLibrary();
		String browser = fl.getpropdata("browser",PROP_PATH);
		if(browser.equalsIgnoreCase("chrome"))
		{
		System.setProperty(CHROME_KEY, Chrome_VALUE);
		 driver=new ChromeDriver();
		}
		 else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty(GECKO_KEY, GECKO_VALUE);
			 driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		String url = fl.getpropdata("url", PROP_PATH);
		driver.get(url);
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		String actualtitle = driver.getTitle();
		String expectedtitle = fl.getpropdata("title", PROP_PATH);
		WebDriverCommonLib w = new WebDriverCommonLib();
		w.verify(actualtitle, expectedtitle, "Login page ");
	}
	@AfterClass
	public void closebrowser()
	{
		driver.close();
	}

}
