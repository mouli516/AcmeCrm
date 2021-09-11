package com.acme.sources;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.acme.GenericLibrary.BaseTest;
import com.acme.GenericLibrary.FileLibrary;
import com.acme.GenericLibrary.WebDriverCommonLib;
import com.acme.pages.CreateLead;
import com.acme.pages.HomePage;
import com.acme.pages.LeadPage;
import com.acme.pages.LoginPage;
@Listeners(com.acme.GenericLibrary.MyListeners.class)
public class CreateNewLead extends BaseTest {
	@Test
	public  void createnewlead() throws Throwable
	{
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		Thread.sleep(2000);
		LoginPage lp = new LoginPage();
		FileLibrary flib = new FileLibrary();
		lp.logintoapp(flib.getpropdata("validusername", PROP_PATH),flib.getpropdata("validpassword", PROP_PATH));
		WebDriverCommonLib wlb = new WebDriverCommonLib();
		wlb.verify(wlb.getpagetitle(), flib.getpropdata("hometitle", PROP_PATH), "Home Title");
		
		
		HomePage hp = new HomePage();
		hp.clickonleads();
		wlb.verify(wlb.getpagetitle(), flib.getpropdata("cViewtitle", PROP_PATH), "Customer view page");
		 LeadPage lead = new LeadPage();
		 lead.clickonnewleadd();
		 CreateLead crt = new CreateLead();
		 crt.createlead();
		
		
		 
		
		
		
	}

}
