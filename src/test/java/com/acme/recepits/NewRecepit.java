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
		System.out.println(flb.getpropdata("validusername", PROP_PATH));
		System.out.println(flb.getpropdata("validusername", PROP_PATH));
		lp.logintoapp(flb.getpropdata("validusername", PROP_PATH),flb.getpropdata("validpassword", PROP_PATH));
		WebDriverCommonLib wlb = new WebDriverCommonLib();
		wlb.verify(wlb.getpagetitle(), flb.getpropdata("hometitle", PROP_PATH), "Home page");
		HomePage hp = new HomePage();
		hp.scrooltorignt();
		hp.clickoninvoices();
	
		 wlb.verify(wlb.getpagetitle(), flb.getpropdata("customviewpage", PROP_PATH),"Custom view page");
		
	}

}
