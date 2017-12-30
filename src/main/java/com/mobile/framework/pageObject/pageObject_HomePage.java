package com.mobile.framework.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.mobile.framework.utility.CommonApi;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class pageObject_HomePage extends CommonApi {
	
	public String homeBreadScrumb="css_.fa.fa-reorder";
	public String homeLink="css_.active-trail";
	public String homePageHeader="xpath_.//*[@id='block-views-all-itcd-notices-block--2']/div[2]/div/div[1]/p";
	public String serviceAndSolMenu="xpath_.//*[@id='tb-megamenu-main-menu']/div/ul/li[2]/a";
	
	
	public void clickOnBreadsCrumb(){
		clickWebElement(homeBreadScrumb);
	}
	public void clickOnHomeLink(){
		clickWebElement(homeLink);
	}
	
	public void clickOnServiceLink(){
		clickWebElement(serviceAndSolMenu);
	}
	
	public String verifyonlineCoursePageHeader(){
		return getWebElementText(homePageHeader);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*public void clickToOpenMenu(){
		
		
	}
	
	public void clickHome(){
		//clickWebElement(homeLink);
		//homeLink.click();
		
	}
	
	public String verifyHomeHeader(){
		//System.out.println("Header : "+getWebEmenetTextHome(homePageHeader));
		return getWebEmenetTextHomeWithXpath(homePageHeader);
		
	}
	
	public void clickHomePageViewAllButton(){
		//clickWebelement("tb-megamenu-item");
		
	}*/
	
	//Custom Webelement CLick method
	/*public void clickWebElement(String webElement){
		driver.findElement(By.cssSelector(webElement)).click();		
	}
	
	public String getWebEmenetTextHome(String webElement){
		return driver.findElement(By.cssSelector(webElement)).getText();		
	}
	
	public String getWebEmenetTextHomeWithXpath(String webElement){
		return driver.findElement(By.xpath(webElement)).getText();		
	}*/
	
	/*public pageObject_HomePage(AppiumDriver driver){
	PageFactory.initElements(new AppiumFieldDecorator(driver), pageObject_HomePage.class);
}*/

/*@FindBy(how=How.CSS, using=".fa.fa-reorder")
WebElement homeBreadScrumbWeb;

@FindBy(css=".active-trail")
WebElement homeLink;

@FindBy(xpath=".//*[@id='block-views-all-itcd-notices-block--2']/div[2]/div/div[1]/p")
WebElement homePageHeader;

@FindBy(css="tb-megamenu-item")
WebElement homePageViewButton;*/

//@FindBy(how = How.XPATH, using = ".//*[@id='tb-megamenu-main-menu']/div/ul/li[3]/a")
//  public static WebElement itNewsAndUpdate;
	

}
