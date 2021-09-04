package com.acme.purcchaseorder;

import org.testng.annotations.Test;

import com.acme.GenericLibrary.BaseTest;
import com.acme.GenericLibrary.FileLibrary;
import com.acme.GenericLibrary.WebDriverCommonLib;
import com.acme.pages.HomePage;
import com.acme.pages.LoginPage;
import com.acme.pages.NewPurchaseOrderPage;
import com.acme.pages.PurchaseOrderPage;

public class CreateNewPurchase extends BaseTest{
	
	@Test
	public void createnewpurchase() throws Throwable
	{
		
		FileLibrary fl = new FileLibrary();
		WebDriverCommonLib wb = new WebDriverCommonLib();
		
		LoginPage lp = new LoginPage();
		
		lp.logintoapp(fl.getpropdata("validusername", PROP_PATH),fl.getpropdata("validpassword", PROP_PATH));
		wb.verify(wb.getpagetitle(), fl.getpropdata("hometitle", PROP_PATH), "hometitle");
	    HomePage hp = new HomePage();
	    hp.scrooltorignt();
	    hp.clickonpurchasetab();
	    wb.verify(wb.getpagetitle(), fl.getpropdata("purchaseoredrpagetitle", PROP_PATH), "purchase oredr page");
		PurchaseOrderPage pop = new  PurchaseOrderPage();
		pop.clickOnNewPurchaseButton();
		NewPurchaseOrderPage npo = new NewPurchaseOrderPage();
		npo.selectExistingvender(fl.readExcelData(EXECL_PATH, "Sheet1", 0, 0));
		
	}
	

}
