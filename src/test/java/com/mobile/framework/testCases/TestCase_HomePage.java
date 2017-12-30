package com.mobile.framework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobile.framework.pageObject.pageObject_HomePage;
import com.mobile.framework.utility.CommonApi;

public class TestCase_HomePage extends pageObject_HomePage {
	
	
	String applicationName="ITCDWebsite";
		
	/*@Test
	public void testVerifyServicePage(){
		System.out.println("Before click menu");
		clickOnBreadsCrumb();
		System.out.println("After click menu");
		clickOnServiceLink();
		
		writedatToCSV(applicationName+","+"TestCase_01,testVerifyServicePage,TestCase_HomePage,Pass");
		//Assert.assertEquals(getHeader(), "IT News & Updates");
		
		
	}*/
	
	@Test
	public void testVerifyHomePage1(){
		try{
		System.out.println("Before click menu");
		clickOnBreadsCrumb();
		System.out.println("After click menu");
		clickOnHomeLink();
		
		
		AssertVerifyStatus(verifyonlineCoursePageHeader(), "IT News & Updates");}
		finally {
			
			writedatToCSV(applicationName+","+"TestCase_01,testVerifyServicePage,TestCase_HomePage,"+status);
		}
		
		//clickHomePageViewAllButton();
	}

}
