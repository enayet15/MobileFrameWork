package com.mobile.framework.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.mobile.framework.utility.CommonApi;

public class TrainingPage extends CommonApi {
	
	public String homeBreadScrumb="css_.fa.fa-reorder";
	public String trainingWebPage ="xpath_.//*[@id='tb-megamenu-main-menu']/div/ul/li[5]/a";
	//.//*[@id='tb-megamenu-main-menu']/div/ul/li[5]/a
	public String computerTrainingCenterCTC="xpath_.//*[@id='block-block-64']/div[2]/ul/li[2]/a";
	//.//*[@id='block-block-64']/div[2]/ul/li[2]/a
	public String onlineCourse="xpath_.//*[@id='block-block-64']/div[2]/ul/li[3]/a";
	//.//*[@id='block-block-64']/div[2]/ul/li[3]/a
	public String onlineCoursePageHeader="xpath_.//*[@id='page-title']";
	
	
	public void clickToOpenMenu(){
		clickWebElement(homeBreadScrumb);
		}
			
	        
        public void clickOnTrainingWebPage() { 
        	clickWebElement(trainingWebPage);
  }
    	public void clickOnComputerTrainingCenterCTC(){
    		scroll("200");
    		clickWebElement(computerTrainingCenterCTC);
    	   		   		
   } 
    	

    	public void clickOnOnlineCourse(){
    		scroll("200");
    		clickWebElement(onlineCourse);
    	   		   		
   } 
    
	public String verifyonlineCoursePageHeader(){
	 return getWebElementText(onlineCoursePageHeader);
}
	
	
	}
	
	





