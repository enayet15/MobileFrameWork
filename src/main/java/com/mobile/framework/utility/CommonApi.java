package com.mobile.framework.utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.opencsv.CSVWriter;
import com.sun.jna.platform.win32.Netapi32Util.User;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class CommonApi extends CSVReporting {

	// public static AppiumDriver<WebElement> driver;
	public AppiumDriver<WebElement> driver;
	public AppiumDriverLocalService appiumServer;
	public String getUrl;
	public String deviceName;
	public String platformVersion;
	public WebElement element;
	public static String status = "Fail";

	@BeforeSuite
	public void csvConfiguration() throws IOException {
		String workingDir = System.getProperty("user.dir");
		String fileName = workingDir + "/" + "csvReport" + "/" + currentDate() + "_report.csv";
		csvWriter = new CSVWriter(new FileWriter(fileName));
		writeReportingColumn(readDataPropertiesFile("reportColumn"));
	}

	@AfterSuite
	public void closeConfiguration() throws IOException {
		writeIntoCSVReport(reportData);
		closeCsvWriter();
	}

	@BeforeClass
	public void baseMethod() throws IOException {
		getUrl = readDataPropertiesFile("webUrl");
		deviceName=readDataPropertiesFile("deviceName");
		platformVersion=readDataPropertiesFile("platformVersion");

		appiumServerStart();
		/***** DesiredCapabilities are provided to identify Environment ****/
		DesiredCapabilities capabilities = new DesiredCapabilities();

		/***** Below code snippet is for Android Web App ****/

		capabilities.setCapability("platformName", "android"); // To identify the Platform
		
		// Change the platform version of the device
		capabilities.setCapability("platformVersion",platformVersion);
		
		// Change the device name which one is connected
		capabilities.setCapability("deviceName", deviceName);

		// *** Open cmd commmend and C:\Users\ekhan>adb devices and see
		// emulator-5554 device
		capabilities.setCapability("browserName", "Chrome");
		capabilities.setCapability("appPackage", "com.android.chrome");
		// cmd commend adb shell pm list packages - find app packeage
		// package.com.android.chrome
		driver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		// itcweb.test.hq.nasa.gov = localhost resolves to the IP address
		// 127.0.0.1 port=4723 find appium setting appium
		driver.get(getUrl);
	}

	public void appiumServerStart() {
		/**** Start Appium Server ****/
		appiumServer = AppiumDriverLocalService.buildDefaultService();
		appiumServer.start();
	}

	/*** Stop Appium Server ***/
	@AfterClass
	public void stopAppiumServer() {
		appiumServer.stop();

	}

	/***
	 * This method is for reading properties file
	 */
	public String readDataPropertiesFile(String key) throws IOException {
		Properties prop = new Properties();
		InputStream inputSt = new FileInputStream(
				"C:\\Users\\ekhan\\workspace\\MobileFrameWork\\Data\\data.properties");
		prop.load(inputSt);
		// getUrl=prop.getProperty("webUrl");

		return prop.getProperty(key);

	}

	/*
	 * public void clickWebelement(WebElement element){ element.click(); }
	 */

	//*** This method will verify the text as like - IT News Update ***																	

	// Thsi method is for Text Input into Textbox

	public void inputWebElement(String element, String text) {
		String[] webElement = element.split("_", 2);
		String webElemntType = webElement[0];
		String actualElement = webElement[1];
		if (webElemntType.equalsIgnoreCase("css")) {
			System.out.println("I am in sendkeys");
			System.out.println(actualElement);
			driver.findElement(By.cssSelector(actualElement)).clear();
			driver.findElement(By.cssSelector(actualElement)).sendKeys(text);

		}
		if (webElemntType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(actualElement)).clear();
			driver.findElement(By.xpath(actualElement)).sendKeys(text);
		}
		if (webElemntType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(actualElement)).clear();
			driver.findElement(By.id(actualElement)).sendKeys(text);
		}
		if (webElemntType.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(actualElement)).clear();
			driver.findElement(By.className(actualElement)).sendKeys(text);
		}
	}

	public void clickWebElement(String element) {
		String[] webElement = element.split("_", 2);

		String webElemntType = webElement[0];
		String actualElement = webElement[1];
		if (webElemntType.equalsIgnoreCase("css")) {
			driver.findElement(By.cssSelector(actualElement)).click();
		}
		if (webElemntType.equalsIgnoreCase("xpath")) {
			driver.findElement(By.xpath(actualElement)).click();
		}
		if (webElemntType.equalsIgnoreCase("id")) {
			driver.findElement(By.id(actualElement)).click();
		}
		if (webElemntType.equalsIgnoreCase("classname")) {
			driver.findElement(By.className(actualElement)).click();
		}
	}

	public String getWebElementText(String element) {
		String[] webElement = element.split("_", 2);
		String webElemntType = webElement[0];
		String actualElement = webElement[1];
		String getText = "";
		if (webElemntType.equalsIgnoreCase("css")) {
			getText = driver.findElement(By.cssSelector(actualElement)).getText();
		}
		if (webElemntType.equalsIgnoreCase("xpath")) {
			getText = driver.findElement(By.xpath(actualElement)).getText();
		}
		if (webElemntType.equalsIgnoreCase("id")) {
			getText = driver.findElement(By.id(actualElement)).getText();
		}
		if (webElemntType.equalsIgnoreCase("classname")) {
			getText = driver.findElement(By.className(actualElement)).getText();
		}
		return getText;
	}
	

	/*
	 * public String getWebElement(String element){ String[]
	 * webElement=element.split("="); String webElemntType=webElement[0]; String
	 * actualElement=webElement[1];
	 * 
	 * return actualElement; }
	 */

	public void scroll(String locationPoint) {
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0," + locationPoint + ")");
	}

	// Below method will verify and assert the Text
	
	public void AssertVerifyText(String actual, String expected){
			
	Assert.assertEquals(actual, expected);
		}
	
	
	// Method to verify and give test case status
	public void AssertVerifyStatus(String actual, String expected){
		try{
			
		Assert.assertEquals(actual, expected);
		status="Pass";
		}catch(Exception e){
			
			status="Fail";
			}
		//return status;
	}

	// Method to Perform Enter action
	public void enterAction() {
		driver.getKeyboard().pressKey(Keys.ENTER);
	}

	// Write data to csv opens
	public void writedatToCSV(String testCaseData) {
		String[] data = testCaseData.split(",");
		reportData.add(data);
	}

}
