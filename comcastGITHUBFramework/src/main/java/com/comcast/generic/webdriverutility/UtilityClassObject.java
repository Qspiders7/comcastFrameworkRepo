package com.comcast.generic.webdriverutility;

import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentTest;

public class UtilityClassObject {
	// i want to share this testobject into multiple threads soo i am using
	// threadlocal
	public static ThreadLocal<ExtentTest> test = new ThreadLocal<ExtentTest>();
//if we want to share driver object
	public static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	
	// if anybody wants to access extent test object and driver object
	
	public static ExtentTest getTest() {// eventhogh test is static it share the object by taking help of  threadlocal
		return test.get();
	}
	
	public static void setTest(ExtentTest actTest) {
		 test.set(actTest);
	}
	
	public static WebDriver getdriver() {// eventhogh test is static it share the object by taking help of  threadlocal
		return driver.get();
	}
	
	public static void setDriver(WebDriver actDriver) {
		 driver.set(actDriver);
	}

	//this class help us to share static variable for multiple threads incase of parallel execution 
}
