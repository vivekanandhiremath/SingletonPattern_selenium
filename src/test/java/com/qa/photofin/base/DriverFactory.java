package com.qa.photofin.base;

public class DriverFactory {
	
public static BrowserDriver getDrivcer(String browser) {
	switch (browser.toLowerCase()) {
	case "chrome":
		return new ChromeDriverManager();
	case "firefox":
		return new FireFoxDriverManager();

	case "edge":
		return new EdgeDriverManager();
	default:
		throw new IllegalArgumentException("invalid browser"+ browser);
	}
}
}
