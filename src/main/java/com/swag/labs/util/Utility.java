package com.swag.labs.util;
/**
 * ****************************************************************************************************************
 * @author sakhter
 * Class Name: Utility
 * Description: This class will capture screenshots after the test execution
 * Date: 01/29/2022
 * ****************************************************************************************************************
 */
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
public class Utility {
	public static void captureScreenshot(WebDriver driver, String screenshotName) {
		
		try {
			TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
			File srcFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(srcFile, new File("./Screenshots/"+screenshotName+getCurrentDateTime() +".png"));
			System.out.println("Validate that the screenshot is taken");
		}
		catch (Exception e)
		{
			System.out.println("Unable to capture the screenshot "+e.getMessage());
		}
		
	}
public static String getCurrentDateTime() {
DateFormat customFormat = new SimpleDateFormat("MM_dd_yyyy_HH_mm_ss");
Date currentdate = new Date();
return customFormat.format(currentdate);
}
/**
 * ****************************************************************************************************************
                >>>>>>>>>>>>>>>>>>>>>>>>>>>>> End of the File <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<
 * ****************************************************************************************************************
 */
}
