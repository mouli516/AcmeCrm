package com.acme.GenericLibrary;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class MyListeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		Reporter.log(result.getName()+"started",true);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log(result.getName()+" passed",true);
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.getpagescreeenshot("D:\\java tutorials\\KCSM4\\goibibo\\Screenshots\\"+result.getName()+".png");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log(result.getName()+" failed",true);
		WebDriverCommonLib wlib = new WebDriverCommonLib();
		wlib.getpagescreeenshot("D:\\java tutorials\\KCSM4\\goibibo\\Screenshots\\"+result.getName()+".png");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log(result.getName()+" skipped",true);
	}

	@Override
	public void onStart(ITestContext context) {
		Reporter.log(context.getName()+" testrunner started",true);
	}

	@Override
	public void onFinish(ITestContext context) {
		Reporter.log(context.getName()+" tetsrunner completed",true);
	}
	
	

}
