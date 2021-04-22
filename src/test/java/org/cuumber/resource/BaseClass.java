package org.cuumber.resource;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BaseClass {

protected WebDriver driver;

//1
public WebDriver getChromeDriver() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Dell\\JanBatch2021\\Jan_Batch\\Drivers\\chromedriver.exe");
	driver = new ChromeDriver();
	return driver;
}
//2
public WebDriver getInternetDriver() {
	System.setProperty("webdriver.ie.driver", "C:\\Users\\Dell\\JanBatch2021\\Jan_Batch\\Drivers\\IEDriverServer.exe");
	driver = new InternetExplorerDriver();
	return driver;
}
//3
public void loadUrl(String Url) {
	driver.get(Url);
}
//4
public void textBox(WebElement element, String Name) {
	
	element.sendKeys(Name);
}
//5 
public void btnClick(WebElement clickaction) {
	
	clickaction.click();
}
//6
public void quitBrowser() {
	driver.quit();

}
//7
public void closeBrowser() {
	driver.close();

}
}
