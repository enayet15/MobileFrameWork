package sampleAppium.sampleAppium.com.enayat;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.mobile.framework.utility.CommonApi;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class SimpleAppium extends CommonApi {
	static AppiumDriver<WebElement> driver;
	public static  void main(String args[]) throws MalformedURLException, InterruptedException{
		
		//You have to write code to open emulator
		/*
		 * Code for opening Emulator
		 */
		
		//Start Appium Server
		AppiumDriverLocalService appiumServer = AppiumDriverLocalService.buildDefaultService();
		appiumServer.start();
		//appiumServerStart();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		
		// Below code snippet for Android Mobiles native App
		/*capabilities.setCapability("platformName", "android"); // To identify the Platform
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "Nexus 6 API 23");
		//capabilities.setCapability("browserName", "Browser");
		capabilities.setCapability("app", "C:\\Users\\ekhan\\Downloads\\sample.apk");
		capabilities.setCapability("appPackage", "com.android.browser");*/
		
		// Below code snippet is for Android Web App
		//
		
		capabilities.setCapability("platformName", "android"); // To identify the Platform
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("deviceName", "emulator-5554");
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("appPackage", "com.android.chrome");
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.get("https://itcdweb.dev.hq.nasa.gov/");
		Thread.sleep(2000);
		String homePage=".fa.fa-reorder";
		driver.findElement(By.cssSelector(homePage)).click();
		driver.findElement(By.cssSelector(".active-trail")).click();
		
		driver.findElement(By.cssSelector(".fa.fa-reorder")).click();
		driver.findElement(By.cssSelector("ria-haspopup")).click();
		
		
		
		//driver.close();
		appiumServer.stop();
		
	}
	
 
}
