package com.mobile.framework.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mobile.framework.utility.CommonApi;

public class serviceAndSolutionsPage extends CommonApi {
	
	public String homeBreadScrumb="css_.fa.fa-reorder";
	public String serviceAndSolution ="xpath_.//*[@id='tb-megamenu-main-menu']/div/ul/li[2]/a";
	//public String softwareLibarary="xpath_.//*[@id='block-block-21']/div[2]/ul[1]/li[2]/a";
	public String softwareLibarary="xpath_.//*[@id='block-block-61']/div[2]/ul/li[4]/a";
	public String softwareLibararyPageHeader="xpath_.//*[@id='page-title']";
	
	
	
	public void clickToOpenMenu(){
		clickWebElement(homeBreadScrumb);
		}
			
	        
        public void clickOnServiceAndSolution() { 
        	clickWebElement(serviceAndSolution);
  }
    	public void clickOnSoftwareLibararyButton(){
    		//scroll("200");
    		clickWebElement(softwareLibarary);
    	   		   		
   } 
    
	public String verifysoftwareLibararyPageHeader(){
	 return getWebElementText(softwareLibararyPageHeader);
}
	
	
	}
	
	





