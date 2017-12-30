package com.mobile.framework.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobile.framework.pageObject.TrainingPage;
import com.mobile.framework.pageObject.pageObject_HomePage;
import com.mobile.framework.utility.CommonApi;

public class TestCase_TrainingPage extends TrainingPage {
	
		
	@Test
	public void testVerifyTrainingPage() throws InterruptedException{
		clickToOpenMenu();
		Thread.sleep(2000);
		clickOnTrainingWebPage();
		clickOnComputerTrainingCenterCTC();
		clickToOpenMenu();
		clickOnTrainingWebPage();
		Thread.sleep(2000);
		clickOnOnlineCourse();
		AssertVerifyText(verifyonlineCoursePageHeader(), "COMPUTER TRAINING CENTER (CTC) - SKILLSOFT");
		Thread.sleep(2000);}
		
		
		
	
	
	/*@Test
	public void testVerifyHomePage1(){
		System.out.println("Before click menu");
		clickToOpenMenu();
		System.out.println("After click menu");
		clickHome();
		Assert.assertEquals(verifyHomeHeader(), "IT News & Updates");
		//clickHomePageViewAllButton();
	}*/

}
