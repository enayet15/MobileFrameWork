package com.mobile.focus.testCase;


import org.testng.annotations.Test;

import com.mobile.focus.pageObject.LoginFocus_pageObject;

public class FocusLogin_TestCase extends LoginFocus_pageObject {

	@Test
	public void loginTestCase() throws InterruptedException{
		
		
		clickSignInFocus();
		Thread.sleep(1000);
		System.out.println("Header name : "+getHeader());
		Thread.sleep(1000);
		enterEmailAddress();
		Thread.sleep(1000);
		enterPassword();
		Thread.sleep(5000);
		clickLogInButton();
		Thread.sleep(2000);
	}
}
