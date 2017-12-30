package com.mobile.framework.testCases;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mobile.framework.pageObject.serviceAndSolutionsPage;

public class TestServiceAndSolutionsPage extends serviceAndSolutionsPage {
	
	@Test
	public void testVerifyserviceAndSolutionsPage() throws InterruptedException{
		System.out.println("Before click menu");
		clickToOpenMenu();
		System.out.println("After click menu");
		clickOnServiceAndSolution();
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		Thread.sleep(2000);
		clickOnSoftwareLibararyButton();
		Thread.sleep(2000);
		Assert.assertEquals(verifysoftwareLibararyPageHeader(), "SOFTWARE LIBRARY");
	
	}

}
