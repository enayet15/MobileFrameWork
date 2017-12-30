package com.mobile.focus.pageObject;

import org.openqa.selenium.By;

import com.mobile.framework.utility.CommonApi;

public class LoginFocus_pageObject extends CommonApi {
	public String SignInFocus="css_.sign-in.text-default";
	public String header="css_.modal-title";
	public String EmailAddress="xpath_.//*[@id='_com_liferay_login_web_portlet_LoginPortlet_login']";
	public String Password="xpath_.//*[@id='_com_liferay_login_web_portlet_LoginPortlet_password']";
	public String LogInButton="css_[class='btn btn-lg btn-primary btn-default'][type='submit']";
	
	
	public void clickSignInFocus(){
		clickWebElement(SignInFocus);	
	}
	
	public void enterEmailAddress(){
	inputWebElement (EmailAddress,"enayet.h.khan@nasa.gov");
		
	}
	
	public void enterPassword(){
		inputWebElement(Password,"Aani12345");
		
	}
	public void clickLogInButton(){
		clickWebElement(LogInButton);
		//driver.findElement(By.cssSelector(LogInButton)).click();
		
	}

	public String getHeader(){
		return getWebElementText(header);
	}
}
