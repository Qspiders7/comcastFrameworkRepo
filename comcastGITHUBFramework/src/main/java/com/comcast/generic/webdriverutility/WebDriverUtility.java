package com.comcast.generic.webdriverutility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	public void waitForPageToLoad(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		
	}

	
	public void waitForElementPresent(WebDriver driver,WebElement element) {
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	//when we want to switch to tab based on url
	public void SwitchTabOnURL(WebDriver driver,String partialURL) {
		Set<String> set = driver.getWindowHandles();

		for (String id : set) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if (url.contains(partialURL)) {
				break;
			}
		}
	}
	public void SwitchBackToTabOnURL(WebDriver driver,String partialURL) {
		Set<String> set = driver.getWindowHandles();

		for (String id : set) {
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if (url.contains(partialURL)) {
				break;
			}
		}
	}
		
				
		//when we want to switchto tab based on title			
	public void SwitchTabOnTitle(WebDriver driver,String partialTitle) {
		Set<String> set = driver.getWindowHandles();
			for (String id : set) {
				driver.switchTo().window(id);
				String acturl= driver.getTitle();
				if (acturl.contains("partialTitle")) {
					break;
			
	}
	
				
			}
			}
	//1.when we want to switch to frame
	public void switchtoFrame(WebDriver driver , int index){//switch to frame based on index
	driver.switchTo().frame(index);
	}
	
	//2.switch to frame based on name or attribute ID
	public void switchtoFrame(WebDriver driver , String nameID) {
		driver.switchTo().frame(nameID);
		
	}
	
	//3.switch to frame based on webelement
		public void switchtoFrame(WebDriver driver ,WebElement element) {
			driver.switchTo().frame(element);
		}
	
	//1,2,3 are overloadedmethods
	public void switchtoAlertAndCancel(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public void switchtoAlertAndAccept(WebDriver driver) {
		driver.switchTo().alert().accept();
	}
	
	
	public void select(WebElement element,String text ){//when we want to select value based on visibletext
	Select sel = new Select(element);
	sel.selectByVisibleText(text);
	}
		
		//if visible text not there
	public void select(WebElement element,int index ){//when we want to select value based on index
		Select sel = new Select(element);
		sel.selectByIndex(index);
		}
			
		public void mousemovedonElement(WebDriver driver,WebElement element) {
			Actions act = new Actions(driver);
			act.moveToElement(element).perform();
		}
		
		public void doubleClick(WebDriver driver,WebElement element) {
			Actions act = new Actions(driver);
			act.doubleClick(element).perform();
			
		}
	
	
	}
