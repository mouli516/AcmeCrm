package com.acme.recepits;

import org.testng.annotations.Test;

import com.acme.GenericLibrary.BaseTest;
import com.acme.GenericLibrary.FileLibrary;
import com.acme.GenericLibrary.WebDriverCommonLib;
import com.acme.pages.HomePage;
import com.acme.pages.LoginPage;

public class NewRecepit extends BaseTest {
	@Test
	public void createnewrecepit() throws Throwable
	{
		LoginPage lp = new LoginPage();
		FileLibrary flb = new FileLibrary();
		lp.logintoapp(flb.getpropdata("username",PROP_PATH), flb.getpropdata("password", PROP_PATH));
		WebDriverCommonLib wlb = new WebDriverCommonLib();
		wlb.verify(wlb.getpagetitle(), flb.getpropdata("hometitle", CHROME_KEY), "Home page");
		HomePage hp = new HomePage();
		hp.clickoninvoices();
	
		 wlb.verify(wlb.getpagetitle(), flb.getpropdata("customviewpage", PROP_PATH),"Custom view page");
		
	}

}
