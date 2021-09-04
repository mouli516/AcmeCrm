package com.acme.potentials;

import org.testng.annotations.Test;

import com.acme.GenericLibrary.BaseTest;
import com.acme.GenericLibrary.FileLibrary;
import com.acme.GenericLibrary.WebDriverCommonLib;
import com.acme.pages.HomePage;
import com.acme.pages.LoginPage;
import com.acme.pages.PotentialPage;

public class CreateNewPotential extends BaseTest {
	
	
	@Test
	public void newpotential() throws Throwable
	{
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		FileLibrary flib = new FileLibrary(); 
		LoginPage lp  =new LoginPage();
		lp.logintoapp(flib.getpropdata("validusername", PROP_PATH), flib.getpropdata("validpassword", PROP_PATH));
		wlib.verify(wlib.getpagetitle(),flib.getpropdata("hometitle", PROP_PATH), "home title");
		HomePage hp = new HomePage(); 
		hp.clickonpotentials();
	PotentialPage pot = new PotentialPage();
	pot.createnewpotential();
	
		
		
	}

}
