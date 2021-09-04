package com.acme.records;

import org.testng.annotations.Test;

import com.acme.GenericLibrary.BaseTest;
import com.acme.GenericLibrary.FileLibrary;
import com.acme.GenericLibrary.WebDriverCommonLib;
import com.acme.pages.AccountsPage;
import com.acme.pages.HomePage;
import com.acme.pages.LoginPage;

public class CreateAccount extends  BaseTest {
	
	
	
	public void newaccount() throws Throwable
	{
		LoginPage lp = new LoginPage();
		FileLibrary flb = new FileLibrary();
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		lp.logintoapp(flb.getpropdata("validusername", PROP_PATH), flb.getpropdata("validpassword", PROP_PATH));
		wlib.verify(wlib.getpagetitle(), flb.getpropdata("hometitile", PROP_PATH), "Home Title");
		HomePage hp = new HomePage();
		hp.clickOnAccountTab();
		wlib.verify(wlib.getpagetitle(), flb.getpropdata("AccountsPage", PROP_PATH), "Accounts Page");
		AccountsPage ac = new AccountsPage();
		ac.clickOnNewAccountTab();
		wlib.verify(EXECL_PATH, Chrome_VALUE, CHROME_KEY);
	}
}
