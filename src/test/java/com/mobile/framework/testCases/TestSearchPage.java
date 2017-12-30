package com.mobile.framework.testCases;

import org.testng.annotations.Test;

import com.mobile.framework.pageObject.searchPage;

public class TestSearchPage extends searchPage{

	@Test
	public void testCaseSearch()throws Exception{
		Thread.sleep(2000);
		clickSearchIcon();
		Thread.sleep(3000);
		enterSearchText();
		Thread.sleep(3000);
		enterSearchTextBox();
		clickOnSearchButton();
		
		
	}
}
