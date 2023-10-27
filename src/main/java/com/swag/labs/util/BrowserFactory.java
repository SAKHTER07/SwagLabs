package com.swag.labs.util;

/**
 * ****************************************************************************************************************
 * @author sakhter
 * Class Name: Browser Factory
 * Description: This class will store the browser for the tests
 * Date: 01/29/2022
 * ****************************************************************************************************************
 */
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class BrowserFactory {
	public static WebDriver startApplication (WebDriver driver, String browserName, String appURL) {
		if (browserName.equals("Chrome"))
		{
			// WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get(appURL);
			return driver;
		}
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
	}
	/**
	 * ****************************************************************************************************************
	                >>>>>>>>>>>>>>>>>>>>>>>>>>>>> End of the File <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
	 * ****************************************************************************************************************
	 */	
	}


