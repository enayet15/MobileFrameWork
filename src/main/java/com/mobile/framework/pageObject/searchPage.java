package com.mobile.framework.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import com.mobile.framework.utility.CommonApi;

public class searchPage extends CommonApi {

	public String searchIcon="css_.fa.fa-search.search-icon";
	//public String searchBox="css_#search-block-form";
	public String searchTextBox="css_#edit-search-block-form--2";
	public String clickSsearchButton="css_#edit-submit";
	public String enterTextBox="css_input[id='edit-keys'][class='form-text']";
	
	//#edit-search-block-form--2
	
	public void clickSearchIcon(){
		clickWebElement(searchIcon);
	}
	
	public void enterSearchText() throws Exception{
		inputWebElement(searchTextBox,"test");
		Thread.sleep(2000);
		enterAction();
		
	}
	
	public void enterSearchTextBox() throws Exception{
		inputWebElement(enterTextBox,"launchpad");
		
	}
	public void clickOnSearchButton(){
		
		clickWebElement(clickSsearchButton);
	}
	
}
