package com.qa.photofin.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
	
	public static WebDriver driver;

	public static WebDriver initializeBrowser(String browser) {
//		PropertyReader reader= new PropertyReader("user.properties");
//String browser = reader.getProperty("browsertype");
		if(browser.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();	
		}else if(browser.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();	

		}else {
			driver=new EdgeDriver();
		}
		
		
		return driver;
		
	}
	

}
